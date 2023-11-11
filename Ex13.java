
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringListOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of words: ");
        int numberOfWords = scanner.nextInt();

        List<String> wordsList = new ArrayList<>();

        for (int i = 0; i < numberOfWords; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            wordsList.add(scanner.next());
        }

        // Display all words
        System.out.println("All words: " + wordsList);

        // Display words with all plurals capitalized
        List<String> pluralCapitalizedList = capitalizePlurals(wordsList);
        System.out.println("Plurals capitalized: " + pluralCapitalizedList);

        // Display words in reverse order
        List<String> reversedList = reverseList(wordsList);
        System.out.println("Reversed order: " + reversedList);

        // Display words with plural words removed
        List<String> withoutPluralsList = removePlurals(wordsList);
        System.out.println("Without plurals: " + withoutPluralsList);

        scanner.close();
    }

    private static List<String> capitalizePlurals(List<String> words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.endsWith("s") || word.endsWith("S")) {
                result.add(word.toUpperCase());
            } else {
                result.add(word);
            }
        }
        return result;
    }

    private static List<String> reverseList(List<String> words) {
        List<String> result = new ArrayList<>(words);
        java.util.Collections.reverse(result);
        return result;
    }

    private static List<String> removePlurals(List<String> words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (!word.endsWith("s") && !word.endsWith("S")) {
                result.add(word);
            }
        }
        return result;
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private double cgpa;

    public Student(String name, int rollNo, double cgpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + ", cgpa=" + cgpa + '}';
    }
}

public class StudentComparatorExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();

            students.add(new Student(name, rollNo, cgpa));
        }

        // Sort students by name in descending order using Comparator
        Collections.sort(students, Comparator.comparing(Student::getName).reversed());

        System.out.println("\nStudents sorted by name in descending order:");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
