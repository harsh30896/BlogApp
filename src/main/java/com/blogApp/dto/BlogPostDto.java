package com.blogApp.dto;

import com.blogApp.entity.BlogPost;
import com.blogApp.repository.BlogPostRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class BlogPostDto {

    private final BlogPostRepository blogPostRepository;

    public BlogPostDto(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    public BlogPost save(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }

    public BlogPost findById(Long id) {
        return blogPostRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Blog post not found with id: " + id));
    }

    public ResponseEntity<String> deleteBlogPost(String blogHeading){
        Optional<BlogPost> blogPost = blogPostRepository.findByBlogHeading(blogHeading);
        if(!blogPost.isEmpty()){
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}