package be.molowayi.beerSoapService.drafts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by JLVH on 27-03-21.
 */
@Service
@WebService(serviceName = "HelloService")
// Optionnel annotation
@SOAPBinding
public class HelloServiceEndpoint {
    @Autowired
    private Hello helloService;

    // Optional annotations
    @WebMethod
    @WebResult
    public String sayHello(@WebParam String name){
        return helloService.sayHello(name);
    }
}
