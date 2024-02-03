package com.kartik.facetofacecall;

import com.kartik.facetofacecall.model.User;
import com.kartik.facetofacecall.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FaceToFaceCallApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaceToFaceCallApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            UserService service
    ){
        return args -> {
            service.register(User.builder()
                    .username("Kartik")
                    .email("kartik@mail.com")
                    .password("aaa")
                    .build());

            service.register(User.builder()
                    .username("John")
                    .email("john@mail.com")
                    .password("aaa")
                    .build());

            service.register(User.builder()
                    .username("Anny")
                    .email("anna@mail.com")
                    .password("aaa")
                    .build());
        };
    }
}
