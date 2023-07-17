package com.abhishek.service;

import com.abhishek.model.Blog;
import com.abhishek.respository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.messaging.Task;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BlogService {
    @Autowired
    private BlogRepository repository;



    //create
    public Blog addBlog (Blog blog)
    {
        blog.setBlogId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(blog);
    }

    //read
    public List<Blog> findAllBlogs()
    {
        return repository.findAll();
    }

    public Blog getBlogByBlogId(String blogId)
    {
        return repository.findById(blogId).get();
    }

    public List<Blog> getBlogByUserId(String userId)
    {
        return repository.findByUserId(userId);
    }


    //update
    public Blog updateBlog(Blog blogRequest)
    {
        Blog existingBlog=repository.findById(blogRequest.getBlogId()).get();
        existingBlog.setContent(blogRequest.getContent());
        existingBlog.setTitle(blogRequest.getTitle());
        return repository.save(existingBlog);
    }

    public String deleteBlog(String blogId)
    {
        repository.deleteById(blogId);
        return blogId+" blog is deleted from dashboard...";
    }

}
