package com.api.controlador;

import com.api.modelo.Foro;
import com.api.repositorio.ForoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/foros")
public class ForoControlador {

    @Autowired
    private ForoRepositorio foroRepositorio;

    @GetMapping
    public List<Foro> obtenerTodosLosForos() {
        return foroRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Foro> obtenerForoPorId(@PathVariable Long id) {
        return foroRepositorio.findById(id);
    }

    @PostMapping
    public Foro crearForo(@RequestBody Foro foro) {
        return foroRepositorio.save(foro);
    }

    @PutMapping("/{id}")
    public Foro actualizarForo(@PathVariable Long id, @RequestBody Foro foroActualizado) {
        return foroRepositorio.findById(id).map(foro -> {
            foro.setMensaje(foroActualizado.getMensaje());
            foro.setNombreCurso(foroActualizado.getNombreCurso());
            foro.setTituloCurso(foroActualizado.getTituloCurso());
            foro.setId(foroActualizado.getId());
            return foroRepositorio.save(foro);
        }).orElseThrow(() -> new RuntimeException("Foro no encontrado con id: " + id));
    }

    @DeleteMapping("/{id}")
    public String eliminarForo(@PathVariable Long id) {
        foroRepositorio.deleteById(id);
        return "Foro eliminado correctamente";
    }
}
