    package module5CommonTypes.exceptionHandling;

/**
 *  This throws ArithmeticException (division by zero)
 *  As soon as this happens:
 * The JVM immediately jumps to catch
 * The remaining lines are NOT executed
 *
 * all the types (arithmetic,nullpointer,arrayindex.. extends RuntimeException class
 * RuntimeException class extends Exception class
 * parent class should be written in the bottom
 *

 */

    public class TrywithMultipleCatch {
        public static void main(String[] args) {
            int i = 0;
            int j = 0;

            int[] arr = new int[5];

            String str = null;

            try{
                j = 18/i;

                System.out.println(arr[5]);

                System.out.println(str.length());

            }catch (ArithmeticException are)
            {
                are.printStackTrace();
            }
            catch (NullPointerException np){
                System.out.println(np.getLocalizedMessage());
            }
            catch (ArrayIndexOutOfBoundsException ae){
                System.out.println(ae.getMessage());
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
