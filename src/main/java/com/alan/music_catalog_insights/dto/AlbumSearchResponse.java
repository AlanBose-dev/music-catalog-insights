package com.alan.music_catalog_insights.dto;

public class AlbumSearchResponse {

    private String albumName;
    private String artistName;
    private String genre;
    private String releaseDate;
    private Double price;
    private String artworkUrl;

    public AlbumSearchResponse() {
    }

    public AlbumSearchResponse(String albumName, String artistName,
                               String genre, String releaseDate,
                               Double price, String artworkUrl) {

        this.albumName = albumName;
        this.artistName = artistName;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.price = price;
        this.artworkUrl = artworkUrl;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getArtworkUrl() {
        return artworkUrl;
    }

    public void setArtworkUrl(String artworkUrl) {
        this.artworkUrl = artworkUrl;
    }
}