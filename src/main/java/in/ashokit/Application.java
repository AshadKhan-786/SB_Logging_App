package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	// AAA-101
	public void m1() {
		int x = 10;
		// logic in-progress
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// AAA-102
	public void m2() {
		int z = 20;
		// logic completed
	}

}
