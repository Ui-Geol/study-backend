package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor // 아래의 생성자 생성
@ToString
public class ArticleForm {
    private Long id;
    private String title;
    private String content;

    /* 롬복으로 대체 생성
    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
    
    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }
     */

    public Article toEntity() {
        return new Article(id, title, content);
    }

}
