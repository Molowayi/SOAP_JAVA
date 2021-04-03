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
            throw new InvalidBeerException();
        }

        int beerInStock;
        beerInStock = beerRepository.countBeersById(id);
        if(beerInStock < number) {
            throw new InvalidNumberException();
        }
    }

    @Override
    public Beer getBeerById(int id) {
        return beerRepository.findOne(id);
    }

}
