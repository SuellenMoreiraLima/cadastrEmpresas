package org.example.cadastroempresa;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class CadastroempresaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroempresaApplication.class, args);
	}

}
