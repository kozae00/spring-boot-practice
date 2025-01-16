package com.example.demo.domain.wiseSaying.controller;

import com.example.demo.domain.wiseSaying.entity.WiseSaying;
import com.example.demo.domain.wiseSaying.service.WiseSayingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class WiseSayingController {

    private final WiseSayingService wiseSayingService;

    @GetMapping("/wiseSayings")
    public List<WiseSaying> getWiseSayings() {
        return wiseSayingService.getAllItems();
    }

    @GetMapping("/wiseSaying/write")
    public WiseSaying writeWiseSaying(@RequestParam(defaultValue = "no name") String content, @RequestParam("author")String author) { // @RequestParam(...) 과 String ... 같으면 생략 가능
        System.out.println("content = " + content);
        System.out.println("author = " + author);
        return wiseSayingService.write(content, author);
    }

}
