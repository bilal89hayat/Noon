package com.library.management.service.impl;

import com.library.management.model.UserDetails;
import com.library.management.repository.UserDetailsRepository;
import com.library.management.service.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

   private UserDetailsRepository userRepository;

    public UserDetailsServiceImpl(UserDetailsRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createDefaultUser() {

        UserDetails userDetails = new UserDetails();
        userDetails.setUserId((long) 1);
        userDetails.setMemberShipActive(true);
        userDetails.setUserName("noon");
        userDetails.setCreatedDate(new Date());
        userRepository.save(userDetails);
    }
}
