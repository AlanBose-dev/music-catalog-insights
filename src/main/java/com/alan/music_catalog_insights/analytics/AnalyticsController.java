package com.alan.music_catalog_insights.analytics;
import java.util.List;
import com.alan.music_catalog_insights.dto.GenreCountResponse;
import com.alan.music_catalog_insights.dto.TopRatedAlbumResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyticsController {

    @Autowired
    private AnalyticsService analyticsService;

    @GetMapping("/api/analytics/total-albums")
    public long getTotalAlbums() {
        return analyticsService.getTotalAlbums();
    }
    @GetMapping("/api/analytics/average-rating")
    public Double getAverageRating() {

        return analyticsService.getAverageRating();
    }
    @GetMapping("/api/analytics/genre-count")
    public List<GenreCountResponse> getAlbumsByGenre() {
        return analyticsService.getAlbumsByGenre();
    }
    @GetMapping("/api/analytics/top-rated")
    public List<TopRatedAlbumResponse> getTopRatedAlbums() {
        return analyticsService.getTopRatedAlbums();
    }
}