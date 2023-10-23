package com.dgn.userdetailservice.controller;

import com.dgn.userdetailservice.model.UserDetail;
import com.dgn.userdetailservice.service.UserDetailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userdetail")
public class UserDetailController {

    private final UserDetailService userDetailService;

    public UserDetailController(UserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    }
    @GetMapping("/getUserDetailByIdentityNumber/{identityNumber}")
    public ResponseEntity<UserDetail> getUserDetailByIdentityNumber(@PathVariable String identityNumber){
        return new ResponseEntity<>(userDetailService.getUserDetailByIdentityNumber(identityNumber), HttpStatus.OK);
    }
}
