package com.tmgr.dto;

import com.tmgr.enums.UserRole;
import com.tmgr.enums.UserStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private UserRole role;
    private List<TaskDTO> createdTasks;
    private List<TaskDTO> tasks;
    private UserStatus status;
    private List<CommentDTO> comments;
}