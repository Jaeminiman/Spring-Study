package org.example.web;

import org.example.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 2.2장
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello() {
        return "hello";
    }

// 2.4장 롬북
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto (@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
