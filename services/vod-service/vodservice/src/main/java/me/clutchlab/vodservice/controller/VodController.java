package me.clutchlab.vodservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VodController {

    @GetMapping("/api/vods/hello")
    public String hello() {
        return "Vod Service is running";
    }
}