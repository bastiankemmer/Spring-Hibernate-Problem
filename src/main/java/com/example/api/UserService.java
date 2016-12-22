package com.example.api;

import com.example.model.UserModel;
import com.example.model.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by bastiankemmer on 22.12.16.
 */
@RestController
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Value("${auto.user.amount}")
    private int automaticallyCreatUsersAmount;

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value="/users")
    public ResponseEntity<?> getAllUser() throws InterruptedException {
        logger.info("Incoming call");
        List<UserModel> users = (List<UserModel>) userRepository.findAll();
        Thread.sleep(20000);
        return ResponseEntity.ok(users);
    }
}
