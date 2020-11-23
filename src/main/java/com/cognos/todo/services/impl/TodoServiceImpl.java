/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cognos.todo.services.impl;

import java.util.List;
import java.util.Optional;

import com.cognos.todo.model.Todo;
import com.cognos.todo.repositories.TodoRepository;
import com.cognos.todo.services.TodoService;
import com.cognos.todo.vo.TodoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("todoService")
@Transactional(readOnly = true)
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> getLista (){
        return todoRepository.getListaTodo();
    }

    @Override
    @Transactional
    public void eliminarRegistro(Long idTodo) {
        Optional<Todo> optionalTodo = this.todoRepository.findById(idTodo);
        if(optionalTodo.isPresent()){
            Todo todo = optionalTodo.get();
            this.todoRepository.delete(todo);
        }
    }

    @Override
    @Transactional
    public void guardarRegistro(TodoVo todoVo) {
        Todo todo = new Todo();
        todo.setDescTodo(todoVo.getDescTodo());
        this.todoRepository.saveAndFlush(todo);
    }
}