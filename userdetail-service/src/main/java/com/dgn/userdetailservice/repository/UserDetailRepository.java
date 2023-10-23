package com.dgn.userdetailservice.repository;

import com.dgn.userdetailservice.model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<UserDetail,Long> {

    Optional<UserDetail> findUserDetailByIdentityNumber(String identityNumber);
}
