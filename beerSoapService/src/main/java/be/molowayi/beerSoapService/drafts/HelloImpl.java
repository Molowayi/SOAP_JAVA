package be.molowayi.beerSoapService.drafts;

import org.springframework.stereotype.Service;

/**
 * Created by JLVH on 27-03-21.
 */
@Service("hello")
public class HelloImpl implements Hello {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
