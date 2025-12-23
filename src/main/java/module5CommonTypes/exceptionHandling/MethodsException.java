package module5CommonTypes.exceptionHandling;

public class MethodsException {
    public static void main(String[] args) {
        int i = 0;
        int j ;
        try{
            j = 18/i;
        }
        catch (Exception e){
            System.out.println("e: "+e);
            System.out.println("getMessage(): "+e.getMessage());
            System.out.println("LocalizedMessage(): "+e.getLocalizedMessage());
            System.out.println("getClass(): "+ e.getClass());
            System.out.println("toString(): "+e.toString());
            System.out.println("printStackTrace(): ");
            e.printStackTrace();
        }
    }
}
