package com.cognos.todo.services;
import com.cognos.todo.model.Todo;
import com.cognos.todo.vo.TodoVo;

import java.util.List;

public interface TodoService {
    public List<Todo> getLista();
    public void eliminarRegistro(Long idTodo);
    public void guardarRegistro(TodoVo todoVo);
}
