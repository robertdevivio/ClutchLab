package me.robert.clutchlab.videoservice.repository;

import me.robert.clutchlab.videoservice.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}