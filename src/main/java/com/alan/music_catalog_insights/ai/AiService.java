package com.alan.music_catalog_insights.ai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alan.music_catalog_insights.analytics.AnalyticsService;
import com.alan.music_catalog_insights.dto.AiSummaryResponse;
import com.alan.music_catalog_insights.dto.GenreCountResponse;

import java.util.List;

@Service
public class AiService {

    @Autowired
    private AnalyticsService analyticsService;

    public AiSummaryResponse generateSummary() {

        long totalAlbums = analyticsService.getTotalAlbums();

        Double averageRating = analyticsService.getAverageRating();

        List<GenreCountResponse> genres =
                analyticsService.getAlbumsByGenre();

        String topGenre = "Unknown";

        if (!genres.isEmpty()) {
            topGenre = genres.get(0).getGenre();
        }

        String summary =
                "You have saved " + totalAlbums + " albums. "
                + "Your average rating is "
                + averageRating + "/5. "
                + "Your favourite genre appears to be "
                + topGenre + ".";

        return new AiSummaryResponse(summary);
    }
}