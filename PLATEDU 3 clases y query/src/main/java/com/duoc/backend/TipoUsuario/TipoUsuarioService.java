package com.duoc.backend.TipoUsuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TipoUsuarioService {

    @Autowired
    private TipoUsuarioRepository tipoUsuarioRepository;

    public List<TipoUsuario> getAllTipoUsuarios() {
        return tipoUsuarioRepository.findAll();
    }

    public TipoUsuario getTipoUsuarioById(Long id) {
        return tipoUsuarioRepository.findById(id).orElse(null);
    }

    public TipoUsuario createTipoUsuario(TipoUsuario tipoUsuario) {
        return tipoUsuarioRepository.save(tipoUsuario);
    }

    public TipoUsuario updateTipoUsuario(Long id, TipoUsuario tipoUsuarioDetails) {
        TipoUsuario tipoUsuario = getTipoUsuarioById(id);
        if (tipoUsuario != null) {
            tipoUsuario.setNombre(tipoUsuarioDetails.getNombre());
            return tipoUsuarioRepository.save(tipoUsuario);
        }
        return null;
    }

    public void deleteTipoUsuario(Long id) {
        tipoUsuarioRepository.deleteById(id);
    }
}