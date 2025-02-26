package com.blogApp.serviceImpl;

import com.blogApp.dto.BlogPostDto;
import com.blogApp.entity.BlogPost;
import com.blogApp.service.BlogPostService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BlogPostServiceImpl implements BlogPostService {

    private final BlogPostDto blogPostDto;
    public BlogPostServiceImpl(BlogPostDto blogPostDto) {
        this.blogPostDto = blogPostDto;
    }

    @Override
    public BlogPost createBlogPost(String title, String content,String blogHeading) {
        BlogPost blogPost = new BlogPost(title, content, blogHeading);
        return blogPostDto.save(blogPost);
    }

    @Override
    public BlogPost getBlogPost(Long id) {
        return blogPostDto.findById(id);
    }

    @Override
    public ResponseEntity<String> deleteBlogPost(String blogHeading) {
        return blogPostDto.deleteBlogPost(blogHeading);
    }


}