package com.project.kafkaproject;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Spring Boot Rest API Documentation",
                description = "Spring Boot Rest API Documentation",
                version = "v1.0",
                contact = @Contact(
                        name = "Berker",
                        email = "javaguides@gmail.com",
                        url = "https://www.javaguide.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.javaguide.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Spring Boot User Management Documentation",
                url = "https://www.javaguide.com/user_management.html"
        )
)
public class KafkaProjectApplication {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(KafkaProjectApplication.class, args);
    }

}
