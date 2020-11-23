package com.cognos.todo.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Entity
@Table(name = "todo", catalog = "todo", schema = "public")
@XmlRootElement
public class Todo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtodo")
    private Long idTodo;
    @Column(name = "desctodo",length = 150)
    private String descTodo;

    public Long getIdTodo() {
        return idTodo;
    }

    public void setIdTodo(Long idTodo) {
        this.idTodo = idTodo;
    }

    public String getDescTodo() {
        return descTodo;
    }

    public void setDescTodo(String descTodo) {
        this.descTodo = descTodo;
    }
}
