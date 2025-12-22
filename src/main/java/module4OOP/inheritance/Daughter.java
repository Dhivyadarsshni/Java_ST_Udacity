package module4OOP.inheritance;

public class Daughter extends Mother{
    public void display(){
        System.out.println("Im the daughter! ");
    }

    public static void main(String[] args) {
        Grandma g = new Grandma();
        g.display();

        Mother m = new Mother();
        m.display();

        Aunt a = new Aunt();
        a.display();

        Grandma au = new Aunt();
        au.display();

        Daughter d = new Daughter();
        d.display();
    }

}
