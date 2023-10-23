package com.dgn.userservice.client;

import com.dgn.userservice.model.UserDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8081/userdetail",name = "user-detail")
@FeignClient(url = "http://userdetail-service.default.svc.cluster.local:8081/userdetail",name = "user-detail")
public interface UserDetailClient {

    @GetMapping("/getUserDetailByIdentityNumber/{identityNumber}")
    ResponseEntity<UserDetail> getUserDetailByIdentityNumber(@PathVariable String identityNumber);

}
