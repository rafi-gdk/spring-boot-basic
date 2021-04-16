package com.sonu.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    String userId;
    String userName;
    LocalDate userDOB;
    Long userPhoneNumber;

}
