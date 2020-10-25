//package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura;
//
//import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities.UsuarioEntity;
//import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.repositories.UsuarioRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@SpringBootTest
//class ApiAgriculturaApplicationTests {
//
//	@Test
//	void contextLoads() {
//
//	}
//
//	@Autowired
//    private UsuarioRepository repo;
//	@Autowired
//    BCryptPasswordEncoder encoder;
//
//	@Test
//    void  CrearUsuario(){
//        UsuarioEntity us = new UsuarioEntity();
//        us.setId(1);
//        us.setPassword(encoder.encode("123"));
//        us.setDni("39651451");
//        us.setApellido("Godoy");
//        us.setNombre("Federico");
//        UsuarioEntity retorno = repo.save(us);
//
//        assert (retorno.getPassword().equalsIgnoreCase(us.getPassword()));
//
//
//    }
//}
