public class LectureOOPOnline {
    public static void main(String[] args){
        try{
            float result = divisions(0,0);
        }
        catch(DividedByZeroException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static float divisions(float a, int b) throws DividedByZeroException{
        if(b==0){
            throw new DividedByZeroException("Kya kr dia bc");
        }
        return a/b;
    }
}
