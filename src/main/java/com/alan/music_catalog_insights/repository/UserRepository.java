package com.alan.music_catalog_insights.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alan.music_catalog_insights.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}
