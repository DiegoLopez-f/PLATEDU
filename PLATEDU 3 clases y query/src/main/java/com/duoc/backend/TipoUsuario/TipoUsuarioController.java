package com.duoc.backend.TipoUsuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipos-usuario")
public class TipoUsuarioController {

    @Autowired
    private TipoUsuarioService tipoUsuarioService;

    @GetMapping
    public List<TipoUsuario> getAllTiposUsuario() {
        return tipoUsuarioService.getAllTipoUsuarios();
    }

    @PostMapping
    public TipoUsuario createTipoUsuario(@RequestBody TipoUsuario tipoUsuario) {
        return tipoUsuarioService.createTipoUsuario(tipoUsuario);
    }

    @GetMapping("/{id}")
    public TipoUsuario getTipoUsuarioById(@PathVariable Long id) {
        return tipoUsuarioService.getTipoUsuarioById(id);
    }

    @PutMapping("/{id}")
    public TipoUsuario updateTipoUsuario(@PathVariable Long id, @RequestBody TipoUsuario tipoUsuarioDetalles) {
        return tipoUsuarioService.updateTipoUsuario(id, tipoUsuarioDetalles);
    }

    @DeleteMapping("/{id}")
    public void deleteTipoUsuario(@PathVariable Long id) {
        tipoUsuarioService.deleteTipoUsuario(id);
    }
}