package com.dgn.userservice.controller;

import com.dgn.userservice.model.User;
import com.dgn.userservice.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user){
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }
    @GetMapping("getUserAndDetail/{identityNumber}")
    public ResponseEntity<User> getUserAndDetail(@PathVariable String identityNumber){
        return new ResponseEntity<>(userService.getUserAndDetail(identityNumber),HttpStatus.OK);
    }
}
