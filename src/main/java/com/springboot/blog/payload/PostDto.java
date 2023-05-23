package com.springboot.blog.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
@Schema(
        description = "DTO For Blog Post Resource"
)
public class PostDto {

    private Long id;

    // Title should not be empty
    // Should have at least 2 characters
    @Schema(
            description = "Title For Blog Post Resource"
    )
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;

    // Post Description should not be null
    // Should have at least 10 characters
    @Schema(
            description = "Description For Blog Post Resource"
    )
    @NotEmpty
    @Size(min = 10, message = "Post Description should have at least 10 characters")
    private String description;

    // Post Content should not be null or empty
    @Schema(
            description = "Content For Blog Post Resource"
    )
    @NotEmpty
    private String content;

    private Set<CommentDto> comments;

    @Schema(
            description = "Category For Blog Post Resource"
    )
    private Long categoryId;

}
