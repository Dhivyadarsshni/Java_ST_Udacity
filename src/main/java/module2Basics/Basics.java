package module2Basics;

public class Basics {

    public static void main(String[] args) {

        /*
            1. Keywords
         *There are 51 keywords in Java

         * assert, boolean,break, byte, case, catch, char, class, continue,
          default, do, double, else, enum, extends,
          final, finally, float, for, if, implements, import, instanceof,int, interface,
          long, native, new, null,
          package, private, protected, public, return, short, static, strictfp,
          super, switch, synchronized, this, throw, throws, transient, try,
          void, volatile, and while.
        */
        int isAKeyword = 7;

        /*
            2. Variables
         *sets a location in the memory where it stores the value in the declared datatype
          and
          an associated name to refer the location in the memory
         *follows static typing : where the datatype is bound to the variable and cannot later be changed
                                  but the values can be changed
        */
        char alphabet = 'D';
        alphabet = 'H';
        System.out.println("Variables eg: "+alphabet);

        /*
            3.Typecasting and Truncation
         * changing the types of the variables
         */
        //Automatic typecasting
        int i = 1;
        double d = i;
        System.out.println("Automatic typecasting");
        System.out.println(d);
        //manual typecasting
        double d2 = 7.3;
        int i2 = (int)d2;
        System.out.println("Manual typecasting");
        System.out.println(i2);
        /*
            4.literals
         *fixed values for the variables
         */
        char asciiVar = 65;
        System.out.println("Literals - ascii value of code 65 is : "+asciiVar);
        /*
            5.Conditional Statements
         *allows a program to make decisions and execute different code blocks based on a condition.
         *2 types of conditional statements
         */
        //if - else
        if(true){
            System.out.println("This is a true if statement");}
        else{
            System.out.println("This is a false if statement");
        }
        //switch - 3 types of definition
        int switchVar = 3;
        switch (switchVar){
            case 1,3,5,7,9 :
                System.out.println("Its an odd number within 10 in switch case");
                break;
            default:
                System.out.println("Its an even number within 10 in switch case ");
        }

        String result = switch(switchVar){
            case 3: yield "its 3 in switch case 2";
            default: yield "Bye";
        };
        System.out.println("Switch case 2: " +result);

        switch (switchVar){
            case 3 -> System.out.println("bye bye 3 n switch case 3 ");
            default -> System.out.println("bye");
        }
        /*
            6.Loops
         *to iterate or print or do some instructions multiple times.
         *we automate the task with start and end values
         *3 types of loops
         */
        //for
        for(int num = 0 ; num <= 5; num++){
            System.out.println("Number inside for loop: "+num);
        }
        //while
        int w = 3;
        while (w>=0){
            System.out.println("Im number "+w+" inside while");
            w--;
        }
        int dw = 0;
        //do while
        do{
            System.out.println("hello brothers and sisters , Im number "+ dw);
            dw++;
        }while (dw>0 && dw<=3);
        /*
            7.Methods
         *block of code that performs a specific task and can be reused whenever needed
         *must be defined at the class level
         */
        helloWorld(); //method calling
        /*
            8.Access Modifiers
         * controls the accessibility and visibility of the variable/method/class between classes
         * it doesn't work within methods - as we are writing this inside main method
         * public>protected>default>private
         */
            int balance = 1000;
        /*
            9.Arrays
        * fixed length data structures
        * accessed by index elements
        * limit should be predefined
         */
        int[] arrays = {1,2,3,4};
        System.out.println("In arrays : index 2 : " +arrays[2]);
        int [] numbers = new int[3];
        numbers[0]=5;numbers[1]=6;numbers[2]=7;
        System.out.println("In numbers : index 1 :"+numbers[1]);
        /**
         * 10. Javadocs
         * are structured documentation comments used to describe Java classes, methods, and fields.
         * this is a javadoc actually lol
         */

    }
    /*
            7.Methods
         *block of code that performs a specific task and can be reused whenever needed
         *must be defined at the class level
         */
    //method definition
    //cant define a method inside a function
    public static void helloWorld (){
        System.out.println("Hello world from method");
    }
}

//Javadocs Eg:

/**
 * module2.Calculator class performs basic arithmetic operations.
 *
 * @author Dhivs
 * @since 1.0
 */
class Calculator {

    /**
     * Adds two integers.
     *
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Divides two numbers.
     *
     * @param a dividend
     * @param b divisor
     * @return result of division
     * @throws ArithmeticException if b is zero
     */
    public int divide(int a, int b) {
        return a / b;
    }

    /**
     * This method is outdated.
     * Use {@link #add(int, int)} instead.
     *
     * @deprecated since version 2.0
     */
    public int oldAddMethod(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 5));
        System.out.println(calc.divide(10, 2));
    }
}

