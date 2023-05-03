package com.example.back.Repository;

import com.example.back.Entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersEntity, Integer> {

    public UsersEntity findByUserIdAndUserPw(String UserId, String UserPw);

}
