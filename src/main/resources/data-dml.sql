-- Example users
INSERT INTO user (first_name, last_name, email, role, status) VALUES ('Alice','Smith', 'alice@example.com', 'ADMIN','ACTIVE');
INSERT INTO user (first_name, last_name, email, role, status) VALUES ('Bob', 'John','bob@example.com', 'USER', 'ACTIVE');
INSERT INTO user (first_name, last_name, email, role, status) VALUES ('Charlie', 'Brown', 'charlie@example.com', 'USER', 'ACTIVE');
INSERT INTO user  (first_name, last_name, email, role, status) VALUES ('David', 'Lee', 'david@example.com', 'USER', 'ACTIVE');
INSERT INTO user (first_name, last_name, email, role, status) VALUES ('Eve', 'Wilson', 'eve@example.com', 'USER', 'ACTIVE');
INSERT INTO user (first_name, last_name, email, role, status) VALUES ('Frank', 'Taylor', 'frank@example.com', 'USER', 'ACTIVE');

-- Example task
INSERT INTO task (title, description, start_time, end_time, status, priority, category, creator_id, assignee_id, created_at, updated_at)
VALUES ( 'Sample Task', 'This is a sample task.', '2025-09-26T09:00:00', '2025-09-26T17:00:00', 'OPEN', 'HIGH', 'TASK', 1, 1, '2025-09-26T08:00:00', '2025-09-26T08:00:00');
INSERT INTO task(title, description, start_time, end_time, status, priority, category, creator_id, assignee_id, created_at, updated_at)
VALUES ('Sample Task 2', 'This is a sample task 2.', '2025-09-26T09:00:00', '2025-09-26T17:00:00', 'ASSIGNED', 'HIGH', 'TASK', 1, 2, '2025-09-26T08:00:00', '2025-09-26T08:00:00');
INSERT INTO task(title, description, start_time, end_time, status, priority, category, creator_id, assignee_id, created_at, updated_at)
VALUES ('Sample Task 3', 'This is a sample task 3.', '2025-09-26T09:00:00', '2025-09-26T17:00:00', 'OPEN', 'HIGH', 'TASK', 2, 2, '2025-09-26T08:00:00', '2025-09-26T08:00:00');
INSERT INTO task(title, description, start_time, end_time, status, priority, category, creator_id, assignee_id, created_at, updated_at)
VALUES ('Sample Task 4', 'This is a sample task 4.', '2025-09-26T09:00:00', '2025-09-26T17:00:00', 'ASSIGNED', 'HIGH', 'TASK', 1, 2, '2025-09-26T08:00:00', '2025-09-26T08:00:00');
INSERT INTO task(title, description, start_time, end_time, status, priority, category, creator_id, assignee_id, created_at, updated_at)
VALUES ('Sample Task 5', 'This is a sample task 5.', '2025-09-26T09:00:00', '2025-09-26T17:00:00', 'IN_PROGRESS', 'HIGH', 'TASK', 2, 1, '2025-09-26T08:00:00', '2025-09-26T08:00:00');
INSERT INTO task(title, description, start_time, end_time, status, priority, category, creator_id, assignee_id, created_at, updated_at)
VALUES ('Sample Task 6', 'This is a sample task 6.', '2025-09-26T09:00:00', '2025-09-26T17:00:00', 'DONE', 'HIGH', 'TASK', 1, 2, '2025-09-26T08:00:00', '2025-09-26T08:00:00');
INSERT INTO task(title, description, start_time, end_time, status, priority, category, creator_id, assignee_id, created_at, updated_at)
VALUES ('Sample Task 7', 'This is a sample task 7.', '2025-09-26T09:00:00', '2025-09-26T17:00:00', 'IN_PROGRESS', 'HIGH', 'BUG', 1, 1, '2025-09-26T08:00:00', '2025-09-26T08:00:00');
INSERT INTO task(title, description, start_time, end_time, status, priority, category, creator_id, assignee_id, created_at, updated_at)
VALUES ('Sample Task 8', 'This is a sample task 8.', '2025-09-26T09:00:00', '2025-09-26T17:00:00', 'DONE', 'HIGH', 'BUG', 2, 2, '2025-09-26T08:00:00', '2025-09-26T08:00:00');
INSERT INTO task(title, description, start_time, end_time, status, priority, category, creator_id, assignee_id, created_at, updated_at)
VALUES ('Sample Task 9', 'This is a sample task 9.', '2025-09-26T09:00:00', '2025-09-26T17:00:00', 'CANCELLED', 'HIGH', 'BUG', 1, 2, '2025-09-26T08:00:00', '2025-09-26T08:00:00');
INSERT INTO task(title, description, start_time, end_time, status, priority, category, creator_id, assignee_id, created_at, updated_at)
VALUES ('Sample Task 10', 'This is a sample task 10.', '2025-09-26T09:00:00', '2025-09-26T17:00:00', 'CANCELLED', 'HIGH', 'FEATURE', 2, 1, '2025-09-26T08:00:00', '2025-09-26T08:00:00');

-- Example comments
INSERT INTO comment (content, task_id, user_id, created_at, updated_at)
VALUES ('This is a sample comment.', 1, 2, '2025-09-26T08:00:00', '2025-09-26T08:00:00');
INSERT INTO comment (content, task_id, user_id, created_at, updated_at)
VALUES ('This is a sample comment 2.', 1, 1, '2025-09-26T08:00:00', '2025-09-26T08:00:00');
INSERT INTO comment (content, task_id, user_id, created_at, updated_at)
VALUES ('This is a sample comment 3.', 2, 2, '2025-09-26T08:00:00', '2025-09-26T08:00:00');
INSERT INTO comment (content, task_id, user_id, created_at, updated_at)
VALUES ('This is a sample comment 4.', 2, 1, '2025-09-26T08:00:00', '2025-09-26T08:00:00');
INSERT INTO comment (content, task_id, user_id, created_at, updated_at)
VALUES ('This is a sample comment 5.', 3, 2, '2025-09-26T08:00:00', '2025-09-26T08:00:00');