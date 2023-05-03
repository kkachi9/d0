package com.example.back.Controller;

import com.example.back.Entity.UsersEntity;
import com.example.back.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UsersController {

    @Autowired
    UsersRepository usersRepository;

    @PostMapping("/api/signUp")
    public ResponseEntity signUp(
            @RequestBody Map<String, String> params
            ) {
        UsersEntity user = new UsersEntity();

        user.setUserId(params.get("id"));
        user.setUserPw(params.get("pw"));

        usersRepository.save(user);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/api/login")
    public ResponseEntity login(
            @RequestBody Map<String, String> params
    ) {

        UsersEntity user = usersRepository.findByUserIdAndUserPw(params.get("id"), params.get("pw"));

        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);

        }


}
