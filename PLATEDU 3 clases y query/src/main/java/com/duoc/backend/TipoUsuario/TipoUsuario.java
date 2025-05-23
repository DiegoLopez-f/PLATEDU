package com.duoc.backend.TipoUsuario;

import java.util.List;

import com.duoc.backend.Usuario.Usuario;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_usuario")

public class TipoUsuario {
    @Id
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "tipoUsuario")
    private List<Usuario> usuarios;
    
    // Getters and Setters
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
