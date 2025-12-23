package module6Generics;

public class Logger{
    public static <T> void log(T data){
        System.out.println("Log : "+data);
    }
}
