package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.controllers;

import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities.UsuarioEntity;
import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {



    @Autowired
    UsuarioService usuariosService;
    @GetMapping(value = "list")
    public List<UsuarioEntity> index() {

        return usuariosService.findAll();
    }

    @PostMapping(value = "add")
    public UsuarioEntity add(@RequestBody UsuarioEntity usuarioEntity) {
        return usuariosService.add(usuarioEntity);
    }
}