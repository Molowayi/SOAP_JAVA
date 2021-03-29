package be.molowayi.beerSoapService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@SpringBootApplication
public class BeerSoapServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeerSoapServiceApplication.class, args);
	}

	@Bean
	public SimpleJaxWsServiceExporter exporter() {
		SimpleJaxWsServiceExporter exporter = new SimpleJaxWsServiceExporter();
		exporter.setBaseAddress("http://localhost:8079/");
		return exporter;
	}
}
