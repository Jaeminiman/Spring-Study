package org.example.domain.posts;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.domain.BaseTimeEntity;

import javax.persistence.*;

// 3.2장
@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity { /* 3.5장에서 BaseTimeEntity 상속 추가*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
// 3.4장 수정 & 삭제
    public void update (String title, String content) {
        this.title = title;
        this.content = content;
    }
}
