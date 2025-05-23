package com.duoc.backend.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.backend.Curso.Curso;
import com.duoc.backend.Curso.CursoRepository;
import com.duoc.backend.TipoUsuario.TipoUsuario;
import com.duoc.backend.TipoUsuario.TipoUsuarioRepository;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private TipoUsuarioRepository tipoUsuarioRepository;

    public List<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }
    public List<Usuario> obtenerPorCurso(Integer cursoId) {
        return usuarioRepository.findUsuariosByCurso(cursoId);
    } //metodo personalizado con query

    public Usuario obtenerPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario crear(Usuario usuario) {
        Curso curso = cursoRepository.findById(usuario.getCurso().getId())
            .orElseThrow(() -> new RuntimeException("Curso no encontrado"));
        TipoUsuario tipoUsuario = tipoUsuarioRepository.findById(usuario.getTipoUsuario().getId())
            .orElseThrow(() -> new RuntimeException("TipoUsuario no encontrado"));

        usuario.setCurso(curso);
        usuario.setTipoUsuario(tipoUsuario);
        
        return usuarioRepository.save(usuario);
    }

    public Usuario actualizar(Long id, Usuario usuarioDetalles) {
        Usuario usuario = usuarioRepository.findById(id).orElse(null);
        if (usuario == null) return null;

        usuario.setDvrun(usuarioDetalles.getDvrun());
        usuario.setNumrun(usuarioDetalles.getNumrun());
        usuario.setPnombre(usuarioDetalles.getPnombre());
        usuario.setSnombre(usuarioDetalles.getSnombre());
        usuario.setPapellido(usuarioDetalles.getPapellido());
        usuario.setSapellido(usuarioDetalles.getSapellido());
        usuario.setGenero(usuarioDetalles.getGenero());
        usuario.setFechaNacimiento(usuarioDetalles.getFechaNacimiento());
        usuario.setFecha_contrato(usuarioDetalles.getFecha_contrato());
        usuario.setEmail(usuarioDetalles.getEmail());
        usuario.setTelefono(usuarioDetalles.getTelefono());
        usuario.setPasswd(usuarioDetalles.getPasswd());
        usuario.setFechaRegistro(usuarioDetalles.getFechaRegistro());
        usuario.setEstado(usuarioDetalles.getEstado());

        return usuarioRepository.save(usuario);
    }

    public void eliminar(Long id) {
        usuarioRepository.deleteById(id);
    }
}
