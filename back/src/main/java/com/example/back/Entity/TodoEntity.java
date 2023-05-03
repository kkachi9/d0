package com.example.back.Entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "todo", schema = "todo", catalog = "")
public class TodoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "todo_title", nullable = true, length = 50)
    private String todoTitle;
    @Basic
    @Column(name = "todo_subtitle", nullable = true, length = 50)
    private String todoSubtitle;
    @Basic
    @Column(name = "todo_content", nullable = true, length = 50)
    private String todoContent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public String getTodoSubtitle() {
        return todoSubtitle;
    }

    public void setTodoSubtitle(String todoSubtitle) {
        this.todoSubtitle = todoSubtitle;
    }

    public String getTodoContent() {
        return todoContent;
    }

    public void setTodoContent(String todoContent) {
        this.todoContent = todoContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoEntity that = (TodoEntity) o;
        return id == that.id && Objects.equals(todoTitle, that.todoTitle) && Objects.equals(todoSubtitle, that.todoSubtitle) && Objects.equals(todoContent, that.todoContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, todoTitle, todoSubtitle, todoContent);
    }
}
