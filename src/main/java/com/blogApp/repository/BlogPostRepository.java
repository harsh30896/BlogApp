package com.blogApp.repository;

import com.blogApp.entity.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BlogPostRepository extends JpaRepository<BlogPost,Long> {
    Optional<BlogPost> findByBlogHeading(String blogHeading);
}
