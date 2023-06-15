package cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.S04T02N01OliveDiazJosep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.S04T02N01OliveDiazJosep.model.domain",
		"cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.S04T02N01OliveDiazJosep.model.repository" })
@EntityScan("cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.S04T02N01OliveDiazJosep.model.domain")

public class S04T02N01OliveDiazJosepApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T02N01OliveDiazJosepApplication.class, args);
	}

}
