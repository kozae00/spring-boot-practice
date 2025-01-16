package com.example.demo.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    private int age = 0;

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "hello";
    }

    @GetMapping("/introduce")
    @ResponseBody
    public String introduce() {
        return "안녕하세요. 저는 홍길동입니다.";
    }

    @GetMapping("/ageUp")
    @ResponseBody
    public int ageUp() {
        age++;
        return age;
    }

    @GetMapping("/byte")
    @ResponseBody
    public byte getByte() {
        return 1;
    }

    @GetMapping("/short")
    @ResponseBody
    public short getShort() {
        return 1;
    }

    @GetMapping("/long")
    @ResponseBody
    public long getLong() {
        return 1;
    }

    @GetMapping("/float")
    @ResponseBody
    public float getFloat() {
        return 3.14f;
    }

    @GetMapping("/double")
    @ResponseBody
    public double getDouble() {
        return 3.14;
    }

    @GetMapping("/char")
    @ResponseBody
    public char getChar() {
        return 'A';
    }

    @GetMapping("/boolean")
    @ResponseBody
    public boolean getBoolean() {
        return true;
    }

    @GetMapping("/array")
    @ResponseBody
    public String[] getArray() {
        return new String[] {"a", "b", "c"};
    }

    @GetMapping("/list")
    @ResponseBody
    public List<String> getList() {
        return List.of("a", "b", "c");
    }

    @GetMapping("/map")
    @ResponseBody
    public Map<String, String> getMap() {
        return Map.of("k1", "v1", "k2","v2");
    }

    @GetMapping("/article")
    @ResponseBody
    public Article getArticle(){
        return new Article(1, "제목", "내용");
    }
}

@Getter
@AllArgsConstructor
class Article {
    private int id = 1;
    private String title;
    private String body;
}