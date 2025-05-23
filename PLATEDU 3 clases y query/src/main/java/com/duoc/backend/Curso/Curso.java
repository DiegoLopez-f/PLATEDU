package com.duoc.backend.Curso;

import java.util.List;

import com.duoc.backend.Usuario.Usuario;

import jakarta.persistence.*;

@Entity
@Table(name = "curso")

public class Curso {
    @Id
    private Long id;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "curso")
    private List<Usuario> usuarios;

    //getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}