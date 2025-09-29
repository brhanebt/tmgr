package com.tmgr.repository;

import com.tmgr.enums.TaskStatus;
import com.tmgr.model.Task;
import com.tmgr.model.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByAssignee(User assignee);

    List<Task> findByCreator(User createdBy);

    List<Task> findAll(Sort sort);

    //@Query(value = "SELECT * FROM task WHERE status = ?1", nativeQuery = true)
    List<Task> findByStatus(TaskStatus status);

    @Query("SELECT t FROM Task t LEFT JOIN FETCH t.comments")
    List<Task> findAllWithComments();
}
