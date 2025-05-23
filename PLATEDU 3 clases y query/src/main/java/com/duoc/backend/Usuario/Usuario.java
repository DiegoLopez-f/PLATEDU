package com.duoc.backend.Usuario;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.duoc.backend.Curso.Curso;
import com.duoc.backend.TipoUsuario.TipoUsuario;

@Entity
@Table(name = "usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "numrun", nullable = false)
    private Integer numrun;

    @Column(name = "dvrun", nullable = false)
    private String dvrun;

    @Column(name = "pnombre", nullable = false)
    private String pnombre;

    @Column(name = "snombre")
    private String snombre;

    @Column(name = "papellido", nullable = false)
    private String papellido;

    @Column(name = "sapellido")
    private String sapellido;

    @Column(name = "genero", nullable = false)
    private String genero;

    @Column(name = "fecha_contrato")
    private LocalDateTime fecha_contrato;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "passwd", nullable = false)
    private String passwd;

    @Column(name = "estado")
    private Boolean estado = true;

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro = LocalDateTime.now();
    

    // Relación con Curso
    @ManyToOne
    @JoinColumn(name = "curso_id") // clave foránea
    private Curso curso;

    // Relación con TipoUsuario
    @ManyToOne
    @JoinColumn(name = "tipo_usuario_id") // clave foránea
    private TipoUsuario tipoUsuario;



    //getters and setters
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumrun() {
        return numrun;
    }

    public void setNumrun(Integer numrun) {
        this.numrun = numrun;
    }

    public String getDvrun() {
        return dvrun;
    }

    public void setDvrun(String dvrun) {
        this.dvrun = dvrun;
    }

    public String getPnombre() {
        return pnombre;
    }

    public void setPnombre(String pnombre) {
        this.pnombre = pnombre;
    }

    public String getSnombre() {
        return snombre;
    }

    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }

    public String getPapellido() {
        return papellido;
    }

    public void setPapellido(String papellido) {
        this.papellido = papellido;
    }

    public String getSapellido() {
        return sapellido;
    }

    public void setSapellido(String sapellido) {
        this.sapellido = sapellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDateTime getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(LocalDateTime fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}