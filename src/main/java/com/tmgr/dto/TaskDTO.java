package com.tmgr.dto;

import com.tmgr.enums.TaskPriority;
import com.tmgr.enums.TaskStatus;
import com.tmgr.enums.TaskType;
import com.tmgr.model.Comment;
import com.tmgr.model.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class TaskDTO {
    private Long id;

    private String title;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private TaskStatus status;
    private TaskPriority priority;
    private TaskType category;
    private UserDTO creator;
    private UserDTO assignee;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<CommentDTO> comments;
}