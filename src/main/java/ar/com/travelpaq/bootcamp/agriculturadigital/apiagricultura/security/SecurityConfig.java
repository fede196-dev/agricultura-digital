//package ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.security;
//
//
//import ar.com.travelpaq.bootcamp.agriculturadigital.apiagricultura.services.UsuarioServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//
//
//    @Autowired
//    private UsuarioServiceImpl usuarioServiceImpl;
//
//
//    @Autowired
//    private BCryptPasswordEncoder bCrypt;
//
//
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder(){
//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        return bCryptPasswordEncoder;
//    }
//
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth)
//            throws Exception{
//        auth.userDetailsService(usuarioServiceImpl).passwordEncoder(bCrypt);
//    }
//
//
//    @Override
//    protected void configure (HttpSecurity http) throws Exception{
//        http
//                .httpBasic()
//                .and()
//                .authorizeRequests()
//                .antMatchers(HttpMethod.OPTIONS,"/**")
//                .permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .csrf().disable()
//                .formLogin().disable();;
//    }
//
//}
