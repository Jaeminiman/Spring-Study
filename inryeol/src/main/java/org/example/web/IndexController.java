package org.example.web;

import lombok.RequiredArgsConstructor;
import org.example.service.posts.PostsService;
import org.example.web.dto.PostsResponseDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// 4.2장
@RequiredArgsConstructor // 4.4장에서 추가
@Controller
public class IndexController {
    private final PostsService postsService; // 4.4장에서 추가

    @GetMapping("/")
    public String index(Model model) { // 4.4장 추가
        model.addAttribute("posts", postsService.findAllDesc()); // 4.4장 추가
        return "index";
    }

    // 4.3장
    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }

    // 4.5장
    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }
}
