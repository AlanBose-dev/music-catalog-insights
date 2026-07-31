package com.alan.music_catalog_insights.dto;

public class AiSummaryResponse {

    private String summary;

    public AiSummaryResponse(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}