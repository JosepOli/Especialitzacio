package cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n02.configuration;

import org.springframework.context.annotation.*;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors
						.basePackage("cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n02.controllers"))
				.paths(PathSelectors.any()).build();
	}
}
