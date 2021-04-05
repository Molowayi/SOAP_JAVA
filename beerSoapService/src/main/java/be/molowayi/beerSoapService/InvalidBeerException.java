package be.molowayi.beerSoapService;

public class InvalidBeerException extends Exception {
    public InvalidBeerException(String s) {
        System.out.println(s);
    }
    public InvalidBeerException() {
    }
}
