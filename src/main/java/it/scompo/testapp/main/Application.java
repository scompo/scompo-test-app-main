package it.scompo.testapp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Application main entry point and spring configuration.
 * 
 * @author mscomparin
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
	
	/**
	 * Main Entry point.
	 * 
	 * @param args the arguments.
	 */
	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(Application.class);
		
		app.setShowBanner(false);		
		app.run(args);
	}
}
