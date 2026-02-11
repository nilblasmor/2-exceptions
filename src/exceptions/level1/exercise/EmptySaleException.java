package exceptions.level1.exercise;

public class EmptySaleException extends RuntimeException {
    public EmptySaleException() {
        super("To do a sale, first you need to add products");
    }
}
 