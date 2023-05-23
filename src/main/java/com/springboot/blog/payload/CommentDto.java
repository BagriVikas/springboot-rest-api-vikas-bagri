package com.springboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {

    private long id;

    // Should not be null or empty
    @NotEmpty(message = "Name should not be null or empty")
    private String name;

    // Should not be null or empty
    // Should be valid
    @NotEmpty(message = "Email should not be null or empty")
    @Email
    private String email;

    // Should not be null or empty
    // Should have minimum of 10 characters
    @NotEmpty
    @Size(min = 10, message = "Comment body must have minimum of 10 characters")
    private String body;

}
