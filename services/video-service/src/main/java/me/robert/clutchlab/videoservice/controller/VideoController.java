package me.robert.clutchlab.videoservice.controller;

import me.robert.clutchlab.videoservice.entity.Video;
import me.robert.clutchlab.videoservice.service.VideoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/videos")
public class VideoController {

    private final VideoService videoService;

    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Video Service is running";
    }

    @PostMapping
    public ResponseEntity<Video> createVideo(@RequestBody Video video) {
        Video savedVideo = videoService.createVideo(video);
        return ResponseEntity.ok(savedVideo);
    }

    @GetMapping
    public ResponseEntity<List<Video>> getAllVideos() {
        return ResponseEntity.ok(videoService.getAllVideos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Video> getVideoById(@PathVariable Long id) {
        return videoService.getVideoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}