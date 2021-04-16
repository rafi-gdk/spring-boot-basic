package com.sonu.main.service;

import com.sonu.main.model.UserDetails;
import com.sonu.main.model.UserRequest;
import com.sonu.main.model.UserResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    UserResponse getUser(String userId);

    List<UserDetails> getAllUsers();

    UserResponse updateUser(UserRequest userRequest);

    String deleteUser(String userId);

    UserResponse addUser(UserRequest userRequest);
}
