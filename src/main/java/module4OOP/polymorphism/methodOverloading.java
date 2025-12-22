package module4OOP.polymorphism;


//already we have so many overridden methods in inheritance and abstract class
//so thats the eg for method overriding - runtime polymorphism
//also this eg
//Parentclass obj = new Childclass();
//so now the obj uses the methods of childclass - so runtime polymorphism

//compile time polymorphism
public class methodOverloading {

    public int add (int a , int b ){
        return a+b;
    }

    public double add(double a,double b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {

        methodOverloading m = new methodOverloading();

        System.out.println(m.add(1,2));

        System.out.println(m.add(7.0,3.0));

        System.out.println(m.add(7,0,0));

    }
}
