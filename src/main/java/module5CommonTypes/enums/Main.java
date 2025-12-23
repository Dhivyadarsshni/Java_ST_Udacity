package module5CommonTypes.enums;

public class Main {
    public static void main(String[] args) {

        //as array
        Trafficlight[] tl = Trafficlight.values();

        for(Trafficlight t : tl){
            System.out.println(t +" "+ t.ordinal());
        }

        //if else
        Trafficlight t = Trafficlight.GREEN;

        if(t==Trafficlight.GREEN){
            System.out.println("It's Green, You can go!");
        }
        else if(t==Trafficlight.YELLOW){
            System.out.println("It's Yellow, Wait");
        }
        else if(t==Trafficlight.RED){
            System.out.println("It's Red, You should stop");
        }
        else{
            System.out.println("Invalid choice");
        }

        //switch
        Trafficlight t2 = Trafficlight.RED;

        switch (t2){
            case RED:
                System.out.println("It's Red, You should stop");
                break;
            case YELLOW:
                System.out.println("It's Yellow, Wait");
                break;
            case GREEN:
                System.out.println("It's Green, You can go!");
                break;
        }
    }
}
