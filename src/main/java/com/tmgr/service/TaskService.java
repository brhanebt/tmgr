package com.tmgr.service;

import com.tmgr.enums.TaskStatus;
import com.tmgr.exceptions.ResourceNotFoundException;
import com.tmgr.exceptions.ServerSideException;
import com.tmgr.model.Task;
import com.tmgr.repository.TaskRepository;
import com.tmgr.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TaskService {
    private final TaskRepository taskRepository;
    private final UserRepository userRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public List<Task> getTasksCreatedBy(Long userId) {
        var user = userRepository.findById(userId);
        if (user.isPresent()) {
            return taskRepository.findByCreator(user.get());
        } else {
            throw new ResourceNotFoundException("User not found with id " + userId);
        }
    }

    public List<Task> getTasksByAssigneeId(Long assigneeId) {
        var user= userRepository.findById(assigneeId);
        if (user.isPresent()) {
            var value = user.get();
            return taskRepository.findByAssignee(value);
        } else{
            throw new ResourceNotFoundException("User not found with id " + assigneeId);
        }
    }

    public List<Task> getAllTasksSortedBy(String... sortBy) {
        return taskRepository.findAll(Sort.by(Sort.Direction.ASC, sortBy));
    }

    public Task getTaskById(Long id) {
        var task = taskRepository.findById(id);
        if (task.isPresent()) {
            return task.get();
        } else {
            throw new ResourceNotFoundException("Task not found with id " + id);
        }
    }

    public List<Task> getTasksByStatus(String status) {
        try{
            var taskStatus = TaskStatus.valueOf(status.toUpperCase());
            return taskRepository.findByStatus(taskStatus);
        } catch (IllegalArgumentException e){
            log.error("Invalid status: {}", status);
            throw new ServerSideException("Invalid status " + status);
        }
    }
}
