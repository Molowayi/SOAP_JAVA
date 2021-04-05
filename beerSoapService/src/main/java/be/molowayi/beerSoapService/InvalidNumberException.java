package be.molowayi.beerSoapService;

public class InvalidNumberException extends Exception {
    public InvalidNumberException(String s) {
        System.out.println(s);
    }
    public InvalidNumberException() {
    }
}
