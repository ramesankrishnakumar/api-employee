package home.krishna.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication @EnableDiscoveryClient
public class ApiEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiEmployeeApplication.class, args);
	}

}
