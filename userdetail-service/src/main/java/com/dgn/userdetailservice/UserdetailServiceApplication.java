package com.dgn.userdetailservice;

import com.dgn.userdetailservice.model.UserDetail;
import com.dgn.userdetailservice.repository.UserDetailRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserdetailServiceApplication implements CommandLineRunner {
    private final UserDetailRepository userDetailRepository;

    public UserdetailServiceApplication(UserDetailRepository userDetailRepository) {
        this.userDetailRepository = userDetailRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserdetailServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

		final UserDetail userDetail = UserDetail.builder()
				.address("ANKARA")
				.email("dogan@dogan.com")
				.identityNumber("00000000000")
				.phoneNumber("11111111111")
				.build();
		userDetailRepository.save(userDetail);

	}
}
