package org.spring.mvc.lesson50securityweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity(debug = true)
@EnableMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class AppSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(registry ->
                {
                       registry.requestMatchers("/", "/error", "/finish", "/sec").permitAll()
                               .requestMatchers("/user").hasRole("USER")
                               .requestMatchers("/admin").hasRole("ADMIN")
                               .requestMatchers("/order").authenticated()
                               .requestMatchers("/removed").denyAll();
                })
                .formLogin(cust -> {
                    cust    .usernameParameter("login")
                            .passwordParameter("cred")
                            .loginProcessingUrl("/my-login")
                            .loginPage("/")
                            .failureHandler((request, response, exception) -> {
                                request.setAttribute("error", "invalid login or password");
                                request.getRequestDispatcher("/error").forward(request, response);
                            })
                            .successHandler((request, response, authentication) -> {
                                System.out.println("");
                            });
                })
                .logout(cust -> {
                    cust.invalidateHttpSession(true)
                            .logoutUrl("/my-logout")
                            .logoutSuccessHandler((request, response, authentication) -> {
                                request.getRequestDispatcher("/finish").forward(request, response);
                            })
                            .logoutSuccessUrl("/finish");
                })
                .csrf(AbstractHttpConfigurer::disable)
                .cors(AbstractHttpConfigurer::disable)
                .build();
    }

//    @Bean
//    public InMemoryUserDetailsManager userDetailsManager(PasswordEncoder passwordEncoder) {
//        return new InMemoryUserDetailsManager(
//                User.builder().username("user1").password(passwordEncoder.encode("pass1")).authorities("read", "write").roles("USER").build(),
//                User.builder().username("user2").password("pass2").build()
//        );
//    }

    @Bean
    public JdbcUserDetailsManager userDetailsManager() {
        return new JdbcUserDetailsManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }


}