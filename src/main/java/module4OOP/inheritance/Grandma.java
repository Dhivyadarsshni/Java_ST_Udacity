package module4OOP.inheritance;

//followed hybrid inheritance
// which has a single level, multi level, and a hierarchical inheritance within in

public class Grandma {
    public void display(){
        System.out.println("Hi I'm your Grandma");
    }
}
/**
 * single level
 * Mother<- Daughter
 *
 * multi level
 * Grandma<-Mother<-Daughter
 *
 * hierarchical
 *      Grandma
 *      ^       ^
 *      |       |
 *   Mother    Aunt
 */