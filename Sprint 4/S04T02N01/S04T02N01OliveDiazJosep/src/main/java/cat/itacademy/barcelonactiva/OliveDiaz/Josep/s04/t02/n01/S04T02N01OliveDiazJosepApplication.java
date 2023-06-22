package cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.model.domain")
@ComponentScan({"cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.model.repository", "cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.model.services", "cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.controllers"})
public class S04T02N01OliveDiazJosepApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T02N01OliveDiazJosepApplication.class, args);
	}

}
