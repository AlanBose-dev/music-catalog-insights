package com.alan.music_catalog_insights.dto;

public class AlbumUpdateRequest {

    private Integer rating;
    private String notes;

    public AlbumUpdateRequest() {
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}