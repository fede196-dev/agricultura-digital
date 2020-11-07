package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.controllers;

import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities.UsuarioEntity;
import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.services.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {



    @Autowired
    UsuarioServiceImpl usuariosService;
    @GetMapping(value = "/list")
    public List<UsuarioEntity> index() {

        return usuariosService.findAll();
    }
//
//    @PostMapping(value = "/add")
//    public UsuarioEntity add(@RequestBody UsuarioEntity usuarioEntity) {
//        return usuariosService.add(usuarioEntity);
//    }
}