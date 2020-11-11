package com.cognos.todo.controller;

import com.cognos.todo.model.MiTodo;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin
@RestController
public class TodoController {
    private List<MiTodo> lista = new ArrayList<MiTodo>();

    @GetMapping("/api/todos")
    public Iterable<MiTodo> getTodos() {
        return lista;
    }

    @PostMapping("/api/todo")
    public Integer addTodo(@RequestParam String descripcion) {
        MiTodo mt = new MiTodo(descripcion);
        lista.add(mt);
        return mt.getId();
    }
}
