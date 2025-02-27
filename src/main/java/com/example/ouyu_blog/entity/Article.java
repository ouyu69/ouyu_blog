package com.example.ouyu_blog.entity;



/**
 * @FileName Article
 * @Description
 * @Author ouyu
 * @Date 2025-02-26
 **/

public class Article {
    private int id ;
    private String title;
    private String text ;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public Article(int id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
    }

    public Article() {
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
