package be.molowayi.beerSoapService;

import be.molowayi.beerSoapService.domain.Beer;

public interface I_BeerService {
    public void orderBeer(int id, int number) throws InvalidBeerException, InvalidNumberException;

    public Beer getBeerById(int id);

}
