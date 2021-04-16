package com.sonu.main.service;

import com.sonu.main.exception.UserDataException;
import com.sonu.main.model.UserDetails;
import com.sonu.main.model.UserRequest;
import com.sonu.main.model.UserResponse;
import com.sonu.main.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Optional;

import static com.sonu.main.util.UserUtil.buildUserRequest;
import static com.sonu.main.util.UserUtil.buildUserResponse;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    public UserResponse getUser(String userId) {
        UserResponse response;
        try {
            Optional<UserDetails> user = repository.findById(userId);
            if (user.isPresent()) {
                response = buildUserResponse(user.get());
                log.info("getUser Response for " + userId + response);
            } else {
                throw new UserDataException("UserNotFound");
            }
        } catch (Exception e) {
            log.error("Exception Occured in getUser: " + e);
            throw new UserDataException(e);
        }
        return response;
    }

    public List<UserDetails> getAllUsers() {
        List<UserDetails> usersList;
        try {
            usersList = repository.findAll();
            log.info("getAllUsers Response " + usersList);
        } catch (Exception e) {
            log.error("Exception Occured in getAllUsers: " + e);
            throw new UserDataException(e);
        }
        return usersList;
    }

    public UserResponse addUser(@Validated UserRequest userRequest) {
        UserResponse userResponse;

        try {
            UserDetails user = repository.save(buildUserRequest(userRequest));
            if (user != null) {
                userResponse = buildUserResponse(user);
                log.info("addUser Response " + userResponse);
            } else {
                throw new UserDataException("User Insert Failed");
            }
        } catch (Exception e) {
            log.error("Exception Occured in addUser: " + e);
            throw new UserDataException(e);
        }
        return userResponse;
    }

    public UserResponse updateUser(UserRequest userRequest) {
        UserResponse userResponse;
        try {
            Optional<UserDetails> optionalUser = repository.findById(userRequest.getUserId());
            if (optionalUser.isPresent()) {
                UserDetails saveUser = repository.save(buildUserRequest(userRequest));
                if (saveUser != null) {
                    userResponse = buildUserResponse(saveUser);
                    log.info("updateUser Response " + userResponse);
                } else {
                    throw new UserDataException("User Insert Failed");
                }
            } else {
                throw new UserDataException("UserNotFound");
            }
        } catch (Exception e) {
            log.error("Exception Occured in updateUser: " + e);
            throw new UserDataException(e);
        }
        return userResponse;
    }

    public String deleteUser(String userId) {
        try {
            repository.deleteById(userId);
            log.info("deleteUser Response success for" + userId);
        } catch (Exception e) {
            log.error("Exception Occured in deleteUser: " + e);
            throw new UserDataException(e);
        }
        return "success";
    }
}