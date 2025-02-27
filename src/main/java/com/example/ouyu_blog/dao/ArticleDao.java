package com.example.ouyu_blog.dao;

import com.example.ouyu_blog.entity.Article;

import java.util.List;

public interface ArticleDao {
    List<Article> findAllArticle() ;
}
