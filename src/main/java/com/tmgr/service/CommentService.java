package com.tmgr.service;


import com.tmgr.model.Comment;
import com.tmgr.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CommentService {
    private final CommentRepository commentRepository;

    public List<Comment> getCommentsByTaskId(Long id) {
        return commentRepository.findCommentsByTaskId(id);
    }

    public List<Comment> getCommentsByUserId(Long id) {
        return commentRepository.findCommentsByUserId(id);
    }

    public List<Comment> getCommentsByTaskIdAndUserId(Long id, Long userId) {
        return commentRepository.findCommentsByTaskIdAndUserId(id, userId);
    }

    public List<Comment> getCommentsByTaskIdSorted(Long taskId, String[] fields) {
        Sort sort = Sort.by(Sort.Direction.ASC, fields);
        return commentRepository.findByTaskId(taskId, sort);
    }
}
