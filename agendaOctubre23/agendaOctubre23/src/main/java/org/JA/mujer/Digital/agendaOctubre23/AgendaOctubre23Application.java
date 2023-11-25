package org.JA.mujer.Digital.agendaOctubre23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.dialect.springdata.SpringDataDialect;


@SpringBootApplication
public class AgendaOctubre23Application {

	public static void main(String[] args) {SpringApplication.run(AgendaOctubre23Application.class, args);
	}

	@Bean
	public SpringDataDialect springDataDialect() {
		return new SpringDataDialect();
	}


}
