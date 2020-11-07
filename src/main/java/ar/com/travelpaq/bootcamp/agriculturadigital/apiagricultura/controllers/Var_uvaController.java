//package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.controllers;
//
//
//import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities.UsuarioEntity;
//import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities.Var_uvaEntity;
//import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.services.UsuarioService;
//import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.services.Var_uvaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/uvas")
//
//public class Var_uvaController {
//
//    @Autowired
//    Var_uvaService var_uvaService;
//    @GetMapping(value = "/list")
//    public List<Var_uvaEntity> index() {
//
//        return var_uvaService.findAll();
//    }
//
//}
