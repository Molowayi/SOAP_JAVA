package be.molowayi.beerSoapClient;

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

		HelloServiceEndpoint helloService = ctx.getBean("hello", HelloServiceEndpoint.class );
		String response = helloService.sayHello("World");
		System.out.println(response);
	}

	@Bean
	public JaxWsPortProxyFactoryBean hello() throws MalformedURLException {
		JaxWsPortProxyFactoryBean proxy = new JaxWsPortProxyFactoryBean();
		proxy.setServiceInterface(HelloServiceEndpoint.class);
		proxy.setWsdlDocumentUrl(new URL("http://localhost:8079/HelloService?wsdl"));
		proxy.setNamespaceUri("http://beerSoapService.molowayi.be/");
		proxy.setServiceName("HelloService");
		proxy.setPortName("HelloServiceEndpointPort");
		return proxy;

	}
}
