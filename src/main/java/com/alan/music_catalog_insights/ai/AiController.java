package com.alan.music_catalog_insights.ai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alan.music_catalog_insights.dto.AiSummaryResponse;

@RestController
public class AiController {

    @Autowired
    private AiService aiService;

    @GetMapping("/api/ai/summary")
    public AiSummaryResponse generateSummary() {
        return aiService.generateSummary();
    }
}