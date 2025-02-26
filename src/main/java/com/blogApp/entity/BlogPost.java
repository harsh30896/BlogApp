package com.blogApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String blogHeading;

    public BlogPost() {}

    public BlogPost(String title, String content,String blogHeading) {
        this.title = title;
        this.content = content;
        this.blogHeading=blogHeading;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getBlogHeading() {return blogHeading;}
    public void setBlogHeading(String blogHeading) {this.blogHeading = blogHeading;}
    public String getContent() {return content;}
    public void setContent(String content) {this.content = content;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
}
