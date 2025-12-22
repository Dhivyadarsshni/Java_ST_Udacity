package module3Classes.abstractClass;

public class HarishEmp extends Employee{
    public HarishEmp(){
        setName("Harish");
    }
    @Override
    void work(){
        System.out.println("Hi, I'm "+ getName()+"\nIm responsible for the deployment of the project");
    }
}
