package br.com.senai.infoa.backend.projeto_empreendedor.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Biblioreca de personagem",
        version = "1.0",
        description = "API para o sistema de biblioteca de personagem. Permite gerenciar personagens, incluindo criação, história, atualização e exclusão de registros."
    )
)
public class Swagger {

}
