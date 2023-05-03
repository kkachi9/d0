package com.example.back.Controller;

import com.example.back.Entity.TodoEntity;
import com.example.back.Entity.UsersEntity;
import com.example.back.Repository.TodoRepository;
import com.example.back.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
//d
@RestController
public class TodoController {

    @Autowired
    TodoRepository todoRepository;

    @PostMapping("/api/write")
    public ResponseEntity write(
            @RequestBody Map<String, String> params
            ) {

        TodoEntity todo = new TodoEntity();

        todo.setTodoTitle(params.get("title"));
        todo.setTodoSubtitle(params.get("subTitle"));
        todo.setTodoContent(params.get("content"));

        todoRepository.save(todo);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/api/list")
    public ResponseEntity list(){
        List<TodoEntity> list = todoRepository.findAll();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/api/delete")
    public void delete(@RequestParam int id){

        todoRepository.deleteById(id);

    }


}
