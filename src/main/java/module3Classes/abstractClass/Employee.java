package module3Classes.abstractClass;

abstract public class Employee {
    //This is a user defined class
    //im going to make it  abstract class
    //by integrating both concrete and abstract methods

    private String name;

    protected void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    abstract void work();

    void worksIn(){
        System.out.println("He/She works in Accenture");
    }


}
