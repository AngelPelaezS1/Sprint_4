package cat.itacademy.s04.t02.n02.exception;

public class InvalidFruitException extends RuntimeException{
    public InvalidFruitException(String message){
        super (message);
    }
}
