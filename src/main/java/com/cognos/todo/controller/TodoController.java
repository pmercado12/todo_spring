package com.cognos.todo.controller;

import com.cognos.todo.model.MiTodo;
import com.cognos.todo.model.Todo;
import com.cognos.todo.services.TodoService;
import com.cognos.todo.vo.TodoVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {

    @Resource
    private TodoService todoService;

    private List<Todo> lista = new ArrayList<Todo>();

    @GetMapping("")
    public List<Todo> getTodos() {
        return this.todoService.getLista();
    }

    @PostMapping("")
    public void addTodo(@RequestBody(required = true) TodoVo todoVo) {
        this.todoService.guardarRegistro(todoVo);
    }

    @DeleteMapping("/{idTodo}")
    public void eliminarTodo(@PathVariable("idTodo") Long idTodo) {
        this.todoService.eliminarRegistro(idTodo);
    }
}
