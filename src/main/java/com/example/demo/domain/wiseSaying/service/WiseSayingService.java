package com.example.demo.domain.wiseSaying.service;

import com.example.demo.domain.wiseSaying.entity.WiseSaying;
import java.util.ArrayList;
import java.util.List;
public class WiseSayingService {
    private List<WiseSaying> wiseSayingList = new ArrayList<>();
    private int lastId = 0;
    public List<WiseSaying> getAllItems() {
        return wiseSayingList;
    }
    public WiseSaying write(String content, String author) {
        WiseSaying wiseSaying = WiseSaying.builder()
                .id(++lastId)
                .content(content)
                .author(author)
                .build();
        wiseSayingList.add(wiseSaying);
        return wiseSaying;
    }
}