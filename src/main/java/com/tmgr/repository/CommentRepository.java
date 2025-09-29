package com.tmgr.repository;

import com.tmgr.model.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Query(value = "SELECT * FROM comment WHERE task_id = ?1", nativeQuery = true)
    List<Comment> findCommentsByTaskId(Long id);

    @Query(value = "SELECT * FROM comment WHERE user_id = ?1", nativeQuery = true)
    List<Comment> findCommentsByUserId(Long id);

    @Query(value = "SELECT * FROM comment WHERE task_id = ?1 AND user_id = ?2", nativeQuery = true)
    List<Comment> findCommentsByTaskIdAndUserId(Long taskId, Long userId);

    List<Comment> findByTaskId(Long taskId, Sort sort);
}
