package com.sonu.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    String userId;
    @NotNull
    @NotEmpty
    @Size(min = 5, max = 16)
    String userName;
    @NotNull
    @NotEmpty
    @Size(min = 10, max = 10)
    String userDOB;
    @NotNull
    Long userPhoneNumber;

}
