package com.tmgr.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.tmgr.enums.UserRole;
import com.tmgr.enums.UserStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;
    private String email;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @OneToMany(mappedBy = "creator")
    @JsonManagedReference
    private List<Task> createdTasks;

    @OneToMany(mappedBy = "assignee")
    @JsonManagedReference
    private List<Task> tasks;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Comment> comments;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", status=" + status +
                '}';
    }
}
