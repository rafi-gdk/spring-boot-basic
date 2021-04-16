package com.sonu.main.util;

import com.sonu.main.model.UserDetails;
import com.sonu.main.model.UserRequest;
import com.sonu.main.model.UserResponse;

import java.time.LocalDate;

public class UserUtil {

    public static UserDetails buildUserRequest(UserRequest userRequest) {
        UserDetails user = new UserDetails();
        if (userRequest.getUserId() != null) user.setUserId(userRequest.getUserId());
        if (userRequest.getUserName() != null) user.setUserName(userRequest.getUserName());
        if (userRequest.getUserDOB() != null) user.setUserDOB(LocalDate.parse(userRequest.getUserDOB()));
        if (userRequest.getUserPhoneNumber() != null) user.setUserPhoneNumber(userRequest.getUserPhoneNumber());
        return user;
    }

    public static UserResponse buildUserResponse(UserDetails user) {
        UserResponse userResponse = new UserResponse();
        if (user.getUserId() != null) userResponse.setUserId(user.getUserId());
        if (user.getUserName() != null) userResponse.setUserName(user.getUserName());
        if (user.getUserDOB() != null) userResponse.setUserDOB(user.getUserDOB());
        if (user.getUserPhoneNumber() != null) userResponse.setUserPhoneNumber(user.getUserPhoneNumber());
        return userResponse;
    }
}
