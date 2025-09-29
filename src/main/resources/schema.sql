drop table comment;
drop table task;
drop table user;
create table user(
    id bigint primary key auto_increment,
    first_name varchar(100),
    last_name varchar(150),
    email varchar(150),
    role varchar(50),
    status varchar(50)
);

create table task(
    id bigint primary key auto_increment,
    title varchar(100),
    description text,
    start_time timestamp,
    end_time timestamp,
    status varchar(50),
    priority varchar(50),
    category varchar(50),
    creator_id bigint,
    assignee_id bigint,
    created_at timestamp,
    updated_at timestamp,
    foreign key (creator_id) references user(id),
    foreign key (assignee_id) references user(id)
);

create table comment(
    id bigint primary key auto_increment,
    content text,
    user_id bigint,
    task_id bigint,
    created_at timestamp,
    updated_at timestamp,
    foreign key (user_id) references user(id),
    foreign key (task_id) references task(id)
);