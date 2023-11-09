package example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.builder.*;
import org.springframework.cloud.gateway.route.*;
import org.springframework.context.annotation.*;

@SpringBootApplication
public class GatewayApplication {
	@Bean
	public RouteLocator rl(RouteLocatorBuilder builder) {
		return builder.routes()
			.route("boot", r -> r.path("/spring-boot")
				.uri("http://127.0.0.1:8080")
			)
			.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
}
