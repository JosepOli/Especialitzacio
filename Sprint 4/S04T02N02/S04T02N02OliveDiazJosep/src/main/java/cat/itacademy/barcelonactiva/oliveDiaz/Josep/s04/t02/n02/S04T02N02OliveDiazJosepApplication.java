package cat.itacademy.barcelonactiva.oliveDiaz.Josep.s04.t02.n02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("cat.itacademy.barcelonactiva.oliveDiaz.Josep.s04.t02.n02.model.domain")
@ComponentScan({ "cat.itacademy.barcelonactiva.oliveDiaz.Josep.s04.t02.n02.model.repository",
		"cat.itacademy.barcelonactiva.oliveDiaz.Josep.s04.t02.n02.model.services",
		"cat.itacademy.barcelonactiva.oliveDiaz.Josep.s04.t02.n02.controllers" })
public class S04T02N02OliveDiazJosepApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T02N02OliveDiazJosepApplication.class, args);
	}

}
