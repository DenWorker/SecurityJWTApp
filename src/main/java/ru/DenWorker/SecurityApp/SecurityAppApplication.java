package ru.DenWorker.SecurityApp;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SecurityAppApplication {


    //http://localhost:8080/auth/registration
    //http://localhost:8080/auth/login
    //http://localhost:8080/showUserInfo
    public static void main(String[] args) {
        SpringApplication.run(SecurityAppApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
