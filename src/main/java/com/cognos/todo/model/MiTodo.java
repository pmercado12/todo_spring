package com.cognos.todo.model;

public class MiTodo {
    private int id;
    private String descripcion;

    public MiTodo() {
    }

    public MiTodo(String descripcion) {
        this.id = (int) (Math.random() * 10000);
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "MiTodo{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
