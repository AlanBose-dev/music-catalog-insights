package com.alan.music_catalog_insights.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alan.music_catalog_insights.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}