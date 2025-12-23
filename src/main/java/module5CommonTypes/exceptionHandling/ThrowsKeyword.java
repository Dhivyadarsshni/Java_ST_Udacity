package module5CommonTypes.exceptionHandling;

/**
 * throws is a keyword used in a method declaration
 * to indicate that the method might pass an exception
 * to its caller instead of handling it itself.
 */
class Classcaller{
    public void show() throws ClassNotFoundException{
        Class.forName("module4OOP.interfaces.Engineer");
    }
}
public class ThrowsKeyword {
    public static void main(String[] args) {
        Classcaller obj = new Classcaller();
        try{
            obj.show();
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
