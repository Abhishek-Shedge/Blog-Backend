package com.abhishek.respository;

import com.abhishek.model.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BlogRepository extends MongoRepository<Blog,String>{
    @Query("{userId: ?0}")
    List <Blog> findByUserId(String userId);
}
