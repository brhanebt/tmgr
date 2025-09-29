package com.tmgr.dto;

import com.tmgr.model.Task;
import com.tmgr.model.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CommentDTO {
    private Long id;
    private String content;
    private User user;
    private Task task;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}