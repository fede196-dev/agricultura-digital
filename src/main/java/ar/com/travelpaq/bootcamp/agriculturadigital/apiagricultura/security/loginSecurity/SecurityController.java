package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.security.loginSecurity;


import org.springframework.web.bind.annotation.GetMapping;

public class SecurityController {

    @GetMapping({"/","/login"})
    public String index(){
        return "index";
    }

    @GetMapping({"/menu"})
    public String hello(){
        return "menu";
    }

    @GetMapping({"/user"})
    public String user(){
        return "user";
    }

    @GetMapping({"/admin"})
    public String admin(){
        return "admin";
    }



}
