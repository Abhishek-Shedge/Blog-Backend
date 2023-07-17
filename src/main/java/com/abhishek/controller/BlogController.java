package com.abhishek.controller;


import com.abhishek.model.Blog;
import com.abhishek.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    private BlogService service;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Blog createBlog(@RequestBody Blog blog)
    {
        return service.addBlog(blog);
    }

    @GetMapping
    public List<Blog> getBlogs()
    {
        return service.findAllBlogs();
    }

    @GetMapping("/{blogId}")
    public Blog getBlog(@PathVariable String blogId)
    {
        return service.getBlogByBlogId(blogId);
    }

    @GetMapping("/userId/{userId}")
    public List<Blog> findBlogByUserId(@PathVariable String userId)
    {
        return service.getBlogByUserId(userId);
    }

    @PutMapping
    public Blog modifyBlog(@RequestBody Blog blog)
    {
        return service.updateBlog(blog);
    }

//    public ResponseEntity<Blog> modifyBlog(@PathVariable String blogId, @RequestBody Blog blogDetails)
//    {
//        Blog blog=
//    }

    @DeleteMapping("/{blogId}")
    public String deleteBlog(@PathVariable String blogId)
    {
        return service.deleteBlog(blogId);
    }
}
