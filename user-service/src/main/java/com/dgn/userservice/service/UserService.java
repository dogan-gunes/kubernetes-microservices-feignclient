package com.dgn.userservice.service;

import com.dgn.userservice.client.UserDetailClient;
import com.dgn.userservice.model.User;
import com.dgn.userservice.model.UserDetail;
import com.dgn.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

        private final UserRepository userRepository;
        private final UserDetailClient userDetailClient;

    public UserService(UserRepository userRepository, UserDetailClient userDetailClient) {
        this.userRepository = userRepository;
        this.userDetailClient = userDetailClient;
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

    public User getUserAndDetail(String identityNumber){
        UserDetail userDetail = userDetailClient.getUserDetailByIdentityNumber(identityNumber).getBody();
        User user = userRepository.findUserByIdentityNumber(identityNumber).orElse(null);
        user.setUserDetail(userDetail);
        return user;
    }
}
