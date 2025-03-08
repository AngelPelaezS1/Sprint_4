package cat.itacademy.s04.t02.n03.exception;

public class FruitDoesntExistException extends RuntimeException{
    public FruitDoesntExistException(String message){
        super(message);
    }
}
