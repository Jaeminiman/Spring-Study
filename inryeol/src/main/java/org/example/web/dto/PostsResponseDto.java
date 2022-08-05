package org.example.web.dto;

import org.example.domain.posts.Posts;
import org.example.domain.posts.PostsRepository;

// 3.4장 수정 & 삭제
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getContent();
    }
}
