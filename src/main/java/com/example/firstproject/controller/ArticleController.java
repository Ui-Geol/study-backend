package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j //로깅 기능을 위한 어노테이션
@Controller
public class ArticleController {
    @Autowired //스프링 부트가 미리 생성해 놓은 리포지터리 객체 주입(DI)
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleFrom() {
        return "articles/new";
    }

    //
    @PostMapping("articles/create")
    public String createArticle(ArticleForm form) {
        
        log.info(form.toString()); //아래의 로그를 대체
        //System.out.println(form.toString());

        // 1. DTO를 엔터티로 변환
        Article article = form.toEntity();

        log.info(article.toString()); //아래의 로그를 대체
        //System.out.println(article.toString());

        // 2. 리포지터리로 엔티티를 DB에 저장
        Article saved = articleRepository.save(article);
        return "articles/new";
    }
}
