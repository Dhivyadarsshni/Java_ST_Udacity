package module5CommonTypes.exceptionHandling;

//throw is a keyword used to explicitly create and hand over an exception object to the JVM.

/**
 * Step-by-step execution:
 *
 * i == 0 → ✅ true
 *
 * You create an exception object
 *
 * You throw it immediately
 *
 * Normal execution stops right there
 *
 * JVM looks for a matching catch
 *
 * catch (ArithmeticException e) is found
 *
 * Control moves to catch
 *
 * Used inside method
 *
 * Throws ONE exception
 *
 * Creates exception object
 */
public class ThrowKeyword {
    public static void main(String[] args) {
        int i =0;
        int j =0;
        try {
            if(i==0){
                throw new ArithmeticException("Gotcha! ");
            }
            j /= i;
        }catch (ArithmeticException e){
            System.out.println("Uh oh !");
            System.out.println(e.getMessage());
        }
        System.out.println("Ended");
    }
}
