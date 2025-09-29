package com.tmgr.controller;

import com.tmgr.model.Comment;
import com.tmgr.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @GetMapping("/task/{id}")
    public ResponseEntity<List<Comment>> getCommentsByTaskId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(commentService.getCommentsByTaskId(id));
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<List<Comment>> getCommentsByUserId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(commentService.getCommentsByUserId(id));
    }
    @GetMapping("/task/{id}/user/{userId}")
    public ResponseEntity<List<Comment>> getCommentsByTaskIdAndUserId(@PathVariable("id") Long id, @PathVariable("userId") Long userId) {
        return ResponseEntity.ok(commentService.getCommentsByTaskIdAndUserId(id, userId));
    }
    @GetMapping("/task/{taskId}/sorted")
    public ResponseEntity<List<Comment>> getCommentsByTaskIdSorted(@PathVariable("taskId") Long taskId, @RequestParam(name = "sort", defaultValue = "createdAt") String sortBy) {
        String[] fields = sortBy.split(",");
        return ResponseEntity.ok(commentService.getCommentsByTaskIdSorted(taskId, fields));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comment> getCommentById(@PathVariable("id") Long id) {
        List<Comment> dtos = commentService.getCommentsByTaskId(id);
        return dtos.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(dtos.get(0));
    }
}
