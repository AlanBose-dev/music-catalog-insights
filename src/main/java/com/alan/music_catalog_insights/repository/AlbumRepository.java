package com.alan.music_catalog_insights.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alan.music_catalog_insights.entity.Album;

public interface AlbumRepository extends JpaRepository<Album, Long> {

}