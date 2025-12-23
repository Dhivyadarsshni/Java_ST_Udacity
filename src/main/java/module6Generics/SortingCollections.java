package module6Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Students implements Comparable<Students> {

    int id;
    String name;
    int marks;

    Students(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Natural ordering → by marks (ascending)

    /**
     * Internally, Integer.compare(a, b) does:
     *
     * returns negative if a < b
     *
     * returns zero if a == b
     *
     * returns positive if a > b
     *
     * ✔ The exact number does not matter
     * ✔ Only the sign matters (< 0, 0, > 0)
     *
     * @param s the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Students s) {
        return Integer.compare(this.marks, s.marks);
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ", Marks: " + marks + ")";
    }
}

public class SortingCollections {

    public static void main(String[] args) {

        // 🔹 Create list of students
        List<Students> students = new ArrayList<>();
        students.add(new Students(1, "Ace", 85));
        students.add(new Students(2, "Luffy", 92));
        students.add(new Students(3, "Sanji", 88));
        students.add(new Students(4, "Zoro", 90));

        System.out.println("Original List:");
        System.out.println(students);

        //Sorting using Comparable (Natural Order)
        //refer the above class
        Collections.sort(students);
        System.out.println("\nSorted by Marks (Ascending - Comparable):");
        System.out.println(students);

        //Sorting using Comparator (by Name)
        /**
         * (s1, s2) -> s1.name.compareTo(s2.name)
         * Logic (plain English)
         *
         * “Take the name from both students and compare them alphabetically.”
         *
         * This uses String.compareTo(), not numbers.
         */
        Collections.sort(students, Comparator.comparing(s -> s.name));
        System.out.println("\nSorted by Name (Comparator):");
        System.out.println(students);

        //Sorting using Comparator (by Marks Descending)
        /**
         * (s1, s2) -> Integer.compare(s2.marks, s1.marks)
         * Logic (plain English)
         *
         * “If student2 has more marks than student1, put student2 first.” - for descending
         *
         * Order of arguments is reversed
         */
        Collections.sort(students, (s1, s2) ->
                Integer.compare(s2.marks, s1.marks));
        System.out.println("\nSorted by Marks (Descending - Comparator):");
        System.out.println(students);

        //Sorting Simple Collection (Strings)
        List<String> pirates = new ArrayList<>();
        pirates.add("Ace");
        pirates.add("Luffy");
        pirates.add("Sanji");
        pirates.add("Zoro");

        Collections.sort(pirates);
        System.out.println("\nSorted Pirate Names (Natural Order):");
        System.out.println(pirates);
    }
}

