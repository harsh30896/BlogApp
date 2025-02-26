package com.blogApp.service;

import com.blogApp.entity.BlogPost;
import org.springframework.http.ResponseEntity;

public interface BlogPostService {
    BlogPost createBlogPost(String title, String content,String blogHeading);
    BlogPost getBlogPost(Long id);
    ResponseEntity<String> deleteBlogPost(String blogHeading);
}