package com.sonu.main.controller;

import com.sonu.main.model.UserDetails;
import com.sonu.main.model.UserRequest;
import com.sonu.main.model.UserResponse;
import com.sonu.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Size;
import java.util.List;

@RestController
@RequestMapping("/user")
@Validated
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser/{userId}")
    public UserResponse getUser(@PathVariable("userId") @Size(min = 36, max = 36,message = "UserId Length should be 36") String userId) {
        return userService.getUser(userId);
    }

    @GetMapping("/getAllUsers")
    public List<UserDetails> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/addUser")
    public UserResponse addUser(@Validated @RequestBody UserRequest userRequest) {
        return userService.addUser(userRequest);
    }

    @PutMapping("/updateUser")
    public UserResponse updateUser(@Validated @RequestBody UserRequest userRequest) {
        return userService.updateUser(userRequest);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable("userId") @Size(min = 36, max = 36,message = "UserId Length should be 36") String userId) {
        return userService.deleteUser(userId);
    }
}
