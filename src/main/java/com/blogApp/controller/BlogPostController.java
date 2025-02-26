package com.blogApp.controller;

import com.blogApp.entity.BlogPost;
import com.blogApp.service.BlogPostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BlogPostController {

    private final BlogPostService blogPostService;

    public BlogPostController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }

    @PostMapping("/createPost")
    public BlogPost createBlog(@RequestBody BlogPost blogPost) {
        return blogPostService.createBlogPost(blogPost.getTitle(), blogPost.getContent(),blogPost.getBlogHeading());
    }

    @GetMapping("/{id}")
    public BlogPost getBlog(@PathVariable Long id) {
        return blogPostService.getBlogPost(id);
    }

    @PutMapping("find blog/{blogHeading}")
    public ResponseEntity<?> deleteBlogPost(@RequestParam String blodHeading){
        return blogPostService.deleteBlogPost(blodHeading);
    }
}