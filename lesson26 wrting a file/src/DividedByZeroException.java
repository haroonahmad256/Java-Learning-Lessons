public class DividedByZeroException extends Exception{
    public DividedByZeroException(){
        super("Numerator can't be zero");
    }
    DividedByZeroException(String msg){
        super(msg);
    }
}
