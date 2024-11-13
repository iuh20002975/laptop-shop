package iuh.fit.se;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LaptopshopApplication {

	public static void main(String[] args) {

		ApplicationContext laptopshop = SpringApplication.run(LaptopshopApplication.class, args);
		for (String s : laptopshop.getBeanDefinitionNames()) {
			System.out.println(s);
		}

	}

}
