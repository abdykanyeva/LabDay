package lab12_oop_exceptions.restaurantTask;

public class NoSuchAJobException extends RuntimeException {

    public NoSuchAJobException(String exceptionMsg){
        super(exceptionMsg); // displays the specified message as an exception message
    }
}
