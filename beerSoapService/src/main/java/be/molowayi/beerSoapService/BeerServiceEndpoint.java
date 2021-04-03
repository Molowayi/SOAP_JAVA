package be.molowayi.beerSoapService;

import be.molowayi.beerSoapService.domain.Beer;
import be.molowayi.beerSoapService.domain.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@Service
@WebService(serviceName = "BeerService")
public class BeerServiceEndpoint {
    @Autowired
    private BeerService beerService;

    @Autowired
    private BeerRepository beerRepository;

    public void orderBeer(int id, int number) throws InvalidBeerException, InvalidNumberException {
        beerService.orderBeer(id, number);

    }

    public Beer getBeerById(int id){
        return beerRepository.findOne(id);
    }
}
