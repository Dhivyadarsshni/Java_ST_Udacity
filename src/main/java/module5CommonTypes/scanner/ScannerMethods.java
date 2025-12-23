package module5CommonTypes.scanner;

import java.util.Scanner;

public class ScannerMethods{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a integer : ");
        int i = sc.nextInt();
        System.out.println("Integer is "+i);

        System.out.println("Enter a float : ");
        float f = sc.nextFloat();
        System.out.println("Float is "+f);

        System.out.println("Enter a double : ");
        double d = sc.nextDouble();
        System.out.println("Double is "+d);

        System.out.println("Enter a sentence : ");
        String word = sc.next();
        System.out.println("First word is "+word);

        sc.nextLine(); //reads the next empty line

        System.out.println("Enter a sentence : ");
        String name = sc.nextLine();
        System.out.println("Sentence is "+name);

        System.out.println("Enter a character : ");
        char c = sc.next().charAt(0);
        System.out.println("Character is "+c);

        System.out.println("Enter a Boolean value : ");
        System.out.println("Checking if the next word is a boolean ");
        boolean check = sc.hasNextBoolean();
        boolean b = sc.nextBoolean();
        System.out.println("Boolean value is "+b +" boolean check: "+check);




    }

}
