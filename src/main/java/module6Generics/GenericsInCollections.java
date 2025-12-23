package module6Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInCollections {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(97,"Dhivya",98));
        students.add(new Student(77,"Harish",99));
        students.add(new Student(90,"Mayugha",100));
        students.add(new Student(23,"Ruth",98));
        students.add(new Student(25,"Eniyan",99));

        for(Student s : students){
            System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
        }

        for (Student s : students){
            System.out.println(s.toString());
        }
    }
}

