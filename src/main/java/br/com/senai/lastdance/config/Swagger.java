package br.com.senai.lastdance.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "The last dance Lemonadous",
        description = "E-mail para contato: saldanhar494@gmail.com"
    )
)
public class Swagger {
    
}
