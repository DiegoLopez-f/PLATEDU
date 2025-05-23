package com.duoc.backend.Curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    public Curso getCursoById(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    public Curso createCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Curso updateCurso(Long id, Curso cursoDetails) {
        Curso curso = getCursoById(id);
        if (curso != null) {
            curso.setNombre(cursoDetails.getNombre());
            return cursoRepository.save(curso);
        }
        return null;
    }

    public void deleteCurso(Long id) {
        cursoRepository.deleteById(id);
    }
}

