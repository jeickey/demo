package demo.boottest;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App2 {

	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(App2.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
