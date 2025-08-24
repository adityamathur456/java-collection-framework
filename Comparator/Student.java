import java.util.*;

// Student class
class Student {
    private String name;
    private int age;
    private double marks;

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getMarks() { return marks; }

    @Override
    public String toString() {
        return name + " | Age: " + age + " | Marks: " + marks;
    }
}

// Comparator for sorting by Name
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

// Comparator for sorting by Age
class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}

// Comparator for sorting by Marks (descending order)
class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getMarks(), s1.getMarks()); // descending
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Aman", 21, 85.5));
        students.add(new Student("Riya", 20, 92.0));
        students.add(new Student("Karan", 23, 75.0));
        students.add(new Student("Megha", 22, 89.3));

        System.out.println("Original List:");
        students.forEach(System.out::println);

        // Sort by Name
        Collections.sort(students, new NameComparator());
        System.out.println("\nSorted by Name:");
        students.forEach(System.out::println);

        // Sort by Age
        Collections.sort(students, new AgeComparator());
        System.out.println("\nSorted by Age:");
        students.forEach(System.out::println);

        // Sort by Marks
        Collections.sort(students, new MarksComparator());
        System.out.println("\nSorted by Marks (Descending):");
        students.forEach(System.out::println);
    }
}
