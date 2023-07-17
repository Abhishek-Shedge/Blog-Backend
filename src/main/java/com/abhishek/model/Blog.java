package com.abhishek.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "blogs")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Blog {
    @Id
    private String blogId;
    private String userId;
    private String title;
    private String content;
}
