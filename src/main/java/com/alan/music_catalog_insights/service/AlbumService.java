package com.alan.music_catalog_insights.service;

import com.alan.music_catalog_insights.dto.AlbumUpdateRequest;
import com.alan.music_catalog_insights.dto.AlbumSearchResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.alan.music_catalog_insights.entity.Album;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.alan.music_catalog_insights.repository.AlbumRepository;

@Service
public class AlbumService {

	private final RestTemplate restTemplate;
	private final AlbumRepository albumRepository;

    public AlbumService(AlbumRepository albumRepository,
            RestTemplate restTemplate) {

this.albumRepository = albumRepository;
this.restTemplate = restTemplate;
}

	public AlbumRepository getAlbumRepository() {
		return albumRepository;
	}

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}
 
	public List<AlbumSearchResponse> searchAlbums(String term) throws Exception {

	    String url = "https://itunes.apple.com/search?term=" + term + "&entity=album";

	    String json = restTemplate.getForObject(url, String.class);

	    ObjectMapper mapper = new ObjectMapper();

	    JsonNode root = mapper.readTree(json);

	    JsonNode results = root.get("results");

	    List<AlbumSearchResponse> albums = new ArrayList<>();

	    for (JsonNode album : results) {

	        AlbumSearchResponse response = new AlbumSearchResponse();

	        response.setAlbumName(album.path("collectionName").asText());

	        response.setArtistName(album.path("artistName").asText());

	        response.setGenre(album.path("primaryGenreName").asText());

	        response.setReleaseDate(album.path("releaseDate").asText());
	        response.setAppleCatalogId(album.path("collectionId").asLong());

	        response.setTrackCount(album.path("trackCount").asInt());

	        JsonNode priceNode = album.path("collectionPrice");

	        if (priceNode != null && !priceNode.isNull()) {
	            response.setPrice(priceNode.asDouble());
	        } else {
	            response.setPrice(0.0);
	        }
	        response.setArtworkUrl(album.path("artworkUrl100").asText());

	        albums.add(response);
	    }

	    return albums;
	}
	
	public Album saveAlbum(Album album) {
	    return albumRepository.save(album);
	}
	
	public List<Album> getAllAlbums() {
	    return albumRepository.findAll();
	}
	
	public Album updateAlbum(Long id, AlbumUpdateRequest request) {

	    Album album = albumRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Album not found"));

	    album.setRating(request.getRating());
	    album.setNotes(request.getNotes());

	    return albumRepository.save(album);
	}
	
	public void deleteAlbum(Long id) {

	    System.out.println("Delete method called with id = " + id);

	    throw new RuntimeException("Album not found");
	}
}