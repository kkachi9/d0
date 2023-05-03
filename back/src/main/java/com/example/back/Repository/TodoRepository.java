package com.example.back.Repository;

import com.example.back.Entity.TodoEntity;
import com.example.back.Entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {

}
