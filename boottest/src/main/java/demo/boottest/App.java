package demo.boottest;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@EnableAutoConfiguration
public class App {
	@RequestMapping("/")
	String home() {
		return "Hell JJ2";
	}

//	public static void main(String[] args) throws Exception {
//		SpringApplication app = new SpringApplication(App.class);
//		app.setBannerMode(Banner.Mode.OFF);
//		app.run(args);
//	}
}
