package module4OOP.interfaces;

public class Engineer implements Coder,Tester{
    @Override
    public void code(){
        System.out.println("Engineer writes "+LINES_OF_CODE+" lines of code");
    }
    @Override
    public void test(){
        System.out.println("Engineer test using "+TOOL+" tool");
    }

}
