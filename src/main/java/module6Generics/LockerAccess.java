package module6Generics;

public class LockerAccess {
    public static void main(String[] args) {
        Locker<Integer> cash = new Locker<>();

        cash.setItem(1000000);

        Locker<String> propertyDoc = new Locker<>();

        propertyDoc.setItem("Property Documents");

        System.out.println(cash.getItem());
        System.out.println(propertyDoc.getItem());
    }
}
