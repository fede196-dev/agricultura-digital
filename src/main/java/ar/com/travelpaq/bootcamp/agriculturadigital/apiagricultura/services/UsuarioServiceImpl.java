package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.services;

import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.entities.UsuarioEntity;
import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.models.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//public class UsuarioServiceImpl implements UserDetailsService {
public class UsuarioServiceImpl  {

    @Autowired
    UsuarioRepository usuarioRepository;

//
//    public UserDetails loadUserByUsername(String dni) throws UsernameNotFoundException {
//        UsuarioEntity us = usuarioRepository.findByDni(dni);
//
//        List<GrantedAuthority> roles = new ArrayList<>();
//        roles.add(new SimpleGrantedAuthority("ADMIN"));
//        UserDetails userDet = new User(us.getDni(),us.getPassword(),roles);
//
//
//        return userDet;
//    }

    public List<UsuarioEntity> findAll() {
        List<UsuarioEntity> usuarioEntities = usuarioRepository.findAll();

        return usuarioEntities;
    }
//
//    public UsuarioEntity add(UsuarioEntity usuarioEntity)  {
//
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//
//        usuarioEntity.setPassword(encoder.encode(usuarioEntity.getPassword()));
//
//        usuarioEntity = usuarioRepository.save(usuarioEntity);
//
//
//
//        return usuarioEntity;
//    }


}
