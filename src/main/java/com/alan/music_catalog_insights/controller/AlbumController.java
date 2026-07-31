package com.alan.music_catalog_insights.controller;

import org.springframework.web.bind.annotation.RequestBody;

import com.alan.music_catalog_insights.entity.Album;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import com.alan.music_catalog_insights.dto.AlbumSearchResponse;
import com.alan.music_catalog_insights.dto.AlbumUpdateRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alan.music_catalog_insights.service.AlbumService;

@RestController
@RequestMapping("/api/albums")
public class AlbumController {

    private final AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/search")
    public List<AlbumSearchResponse> searchAlbums(@RequestParam String term) throws Exception {
        return albumService.searchAlbums(term);
    }
    
    @PostMapping("/save")
    public Album saveAlbum(@RequestBody Album album) {
        return albumService.saveAlbum(album);
    }
    
    @GetMapping
    public List<Album> getAllAlbums() {
        return albumService.getAllAlbums();
    }
    @PutMapping("/{id}")
    public Album updateAlbum(@PathVariable Long id,
                             @RequestBody AlbumUpdateRequest request) {

        return albumService.updateAlbum(id, request);
    }
    
}