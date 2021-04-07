package be.molowayi.beerSoapClient;

import be.molowayi.beerSoapClient.client.Beer;
import be.molowayi.beerSoapClient.client.BeerServiceEndpoint;
import be.molowayi.beerSoapClient.client.InvalidBeerException_Exception;
import be.molowayi.beerSoapClient.client.InvalidNumberException_Exception;
import be.molowayi.spring.hello.client.HelloServiceEndpoint;
import javafx.scene.Parent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class BeerSoapClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 	SpringApplication.run(BeerSoapClientApplication.class, args);


	BeerServiceEndpoint helloService = ctx.getBean("hello", BeerServiceEndpoint.class );
		Beer response = helloService.getBeerById(22);
		System.out.println(response);
		try {
			helloService.orderBeer(5,5);
		} catch (InvalidBeerException_Exception e) {
			e.printStackTrace();
		} catch (InvalidNumberException_Exception e) {
			e.printStackTrace();
		}
	}

	@Bean
	public JaxWsPortProxyFactoryBean hello() throws MalformedURLException {
		JaxWsPortProxyFactoryBean proxy = new JaxWsPortProxyFactoryBean();
		proxy.setServiceInterface(BeerServiceEndpoint.class);
		proxy.setWsdlDocumentUrl(new URL("http://localhost:8079/BeerService?wsdl"));
		proxy.setNamespaceUri("http://beerSoapService.molowayi.be/");
		proxy.setServiceName("BeerService");
		proxy.setPortName("BeerServiceEndpointPort");
		return proxy;

	}
}

// wsimport -s src\main\java -p be.molowayi.beerSoapClient.client http:\\localhost:8079/BeerService?wsdl
