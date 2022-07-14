package lab12_oop_exceptions.restaurantTask;

public class NoSuchAPersonException  extends RuntimeException{

    public NoSuchAPersonException(String message){
        super(message);
    }
}
