package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.controllers;

import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.domain.VarUva;
import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.services.VarUvaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/uvas")

public class VarUvaController {
    @Autowired
    VarUvaService varUvaService;
    @GetMapping(value = "/list")

    public List<VarUva> index() {
        return varUvaService.findAll();
    }

    @PostMapping(value = "add")
    public VarUva add(@RequestBody VarUva varUva) {
        return varUvaService.add(varUva);
    }

    @DeleteMapping(value = "")
    public String delete(@RequestBody Long id){

        return varUvaService.delete(id);
    }

    @PutMapping (value = "")
    public String edit (@RequestBody VarUva varUva){
        return varUvaService.edit(varUva);
    }

}
