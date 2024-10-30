package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity // 엔티티 선언
public class Article {

    @Id // 엔티티의 대푯값 선언
    @GeneratedValue //자동 생성 기능 추가
    private Long id;
    @Column
    private String title;
    @Column
    private String content;

    /* 롬복으로 대체
    public Article(Long id, String content, String title) {
        this.id = id;
        this.content = content;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
     */


}
