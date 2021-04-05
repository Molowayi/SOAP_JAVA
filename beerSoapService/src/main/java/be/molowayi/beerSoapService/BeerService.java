package be.molowayi.beerSoapService;

import be.molowayi.beerSoapService.domain.Beer;
import be.molowayi.beerSoapService.domain.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BeerService implements I_BeerService {
    @Autowired
    private BeerRepository beerRepository;

    public void orderBeer(int id, int number) throws InvalidBeerException, InvalidNumberException {
        Optional<Beer> beer = Optional.ofNullable(getBeerById(id));
        if(!beer.isPresent()){
            throw new InvalidBeerException("The beer you ask for doen't exist. Check the id you gave");
        }

        int beerInStock;
        beerInStock = beerRepository.countBeersById(id);
        if(beerInStock < number) {
            throw new InvalidNumberException("There is no enough stock to satisfy your order.");
        }
    }

    @Override
    public Beer getBeerById(int id) {
        return beerRepository.findById(id);
    }

}
