package com.tmgr.controller;

import com.tmgr.model.Task;
import com.tmgr.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    @GetMapping("/creator/{id}")
    public ResponseEntity<List<Task>> getTasksByCreatorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(taskService.getTasksCreatedBy(id));
    }
    @GetMapping("/assignee/{id}")
    public ResponseEntity<List<Task>> getTasksByAssigneeId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(taskService.getTasksByAssigneeId(id));
    }

    @GetMapping("/sorted")
    public ResponseEntity<List<Task>> getTasksSorted(@RequestParam(name = "sort", defaultValue = "createdAt") String sortBy) {
        String[] fields = sortBy.split(",");
        return ResponseEntity.ok(taskService.getAllTasksSortedBy(fields));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(taskService.getTaskById(id));
    }

    @GetMapping("/status")
    public ResponseEntity<List<Task>> getTasksByStatus(@RequestParam(name = "status") String status) {
        return ResponseEntity.ok(taskService.getTasksByStatus(status));
    }
}
