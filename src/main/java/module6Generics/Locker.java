package module6Generics;

public class Locker<Generic> {
    private Generic item;

    void setItem(Generic item){
        this.item = item;
    }

    Generic getItem(){
        return item;
    }
}
