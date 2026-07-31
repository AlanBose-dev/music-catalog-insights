package com.alan.music_catalog_insights.dto;

public class TopRatedAlbumResponse {

    private String albumName;
    private String artistName;
    private Integer rating;

    public TopRatedAlbumResponse(String albumName, String artistName, Integer rating) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.rating = rating;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public Integer getRating() {
        return rating;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}