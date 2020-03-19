package com.library.management;

import com.library.management.service.UserDetailsService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.annotation.PostConstruct;

@SpringBootApplication
@Log4j2
public class LibraryManagementApplication {

	@Autowired
	private UserDetailsService userService;

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementApplication.class, args);
	}


	@PostConstruct
	public void createDefaultUser() {
		log.info("======= creating default user ========");
		userService.createDefaultUser();
	}
}
