package module3Classes.abstractClass;

public class DhivyaEmp extends Employee{

    public DhivyaEmp(){
        setName("Dhivya");
    }

    @Override
    void work(){
        System.out.println("Hello I'm " +getName()+"\nMy work is to handle the main logic of the program and implement it");
    }
}
