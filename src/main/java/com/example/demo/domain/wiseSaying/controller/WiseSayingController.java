package com.example.demo.domain.wiseSaying.controller;

import com.example.demo.domain.wiseSaying.entity.WiseSaying;
import com.example.demo.domain.wiseSaying.service.WiseSayingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class WiseSayingController {
    WiseSayingService wiseSayingService = new WiseSayingService();
    @GetMapping("/wiseSayings")
    public List<WiseSaying> getWiseSayings() {
        return wiseSayingService.getAllItems();
    }
}
