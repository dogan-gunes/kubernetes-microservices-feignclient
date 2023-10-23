package com.dgn.userservice.model;

import lombok.Data;

@Data
public class UserDetail {

    private String identityNumber;
    private String phoneNumber;
    private String email;
    private String address;
}
