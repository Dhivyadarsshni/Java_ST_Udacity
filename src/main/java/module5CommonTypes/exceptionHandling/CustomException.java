package module5CommonTypes.exceptionHandling;

public class CustomException extends Exception {
    public CustomException(String message){
        super(message);
    }

    public static void main(String[] args) {
        int j = 0 ;
        try{
            if(j==0){
                throw new CustomException("hehe!");
            }
        }
        catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }
}
