package com.example.demo.domain.wiseSaying.controller;

import com.example.demo.domain.wiseSaying.entity.WiseSaying;
import com.example.demo.domain.wiseSaying.service.WiseSayingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/wiseSayings/write")
    public WiseSaying writeWiseSayings(String content, @RequestParam(defaultValue = "no name") String author) { // @RequestParam(...) 과 String ... 같으면 생략 가능
        System.out.println("content = " + content);
        System.out.println("author = " + author);

        return wiseSayingService.write(content, author);
    }

    @GetMapping("/wiseSayings/{id}")
    public WiseSaying getItem(@PathVariable("id") int id) { // @PathVariable("id") int id 변수명이 같으면 @pPathVariable(...)생략 가능
        return wiseSayingService.getItem(id).orElse(null);
    }

    @GetMapping("/wiseSayings/{id}/delete")
    public boolean deleteItem(@PathVariable int id) {
        return wiseSayingService.deleteById(id);
    }

}
