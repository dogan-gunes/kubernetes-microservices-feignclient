package com.dgn.userdetailservice.service;

import com.dgn.userdetailservice.model.UserDetail;
import com.dgn.userdetailservice.repository.UserDetailRepository;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService {

    private final UserDetailRepository userDetailRepository;

    public UserDetailService(UserDetailRepository userDetailRepository) {
        this.userDetailRepository = userDetailRepository;
    }

    public UserDetail getUserDetailByIdentityNumber(String identityNumber){
        return userDetailRepository.findUserDetailByIdentityNumber(identityNumber).orElse(null);
    }
}
