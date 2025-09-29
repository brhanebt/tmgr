package com.tmgr.service;

import com.tmgr.enums.UserStatus;
import com.tmgr.exceptions.ResourceNotFoundException;
import com.tmgr.exceptions.ServerSideException;
import com.tmgr.model.User;
import com.tmgr.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAllWithTasks();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public void deactivateUser(Long id) {
        var user = userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Error while deactivating data"+id));
        user.setStatus(UserStatus.INACTIVE);
        userRepository.save(user);
    }

}
