package com.alan.music_catalog_insights.analytics;
import java.util.List;
import com.alan.music_catalog_insights.dto.GenreCountResponse;
import com.alan.music_catalog_insights.dto.TopRatedAlbumResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alan.music_catalog_insights.repository.AlbumRepository;

@Service
public class AnalyticsService {

    @Autowired
    private AlbumRepository albumRepository;

    public long getTotalAlbums() {
        return albumRepository.count();
    }
    public Double getAverageRating() {

        Double average = albumRepository.getAverageRating();

        return average == null ? 0.0 : average;
    }
    public List<GenreCountResponse> getAlbumsByGenre() {
        return albumRepository.getAlbumsByGenre();
    }
    public List<TopRatedAlbumResponse> getTopRatedAlbums() {
        return albumRepository.getTopRatedAlbums();
    }
}