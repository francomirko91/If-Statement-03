import java.util.Random;

public class Student {
    public String name;
    public int age;

    Student(String studentName, int studentAge) {
        this.name = studentName;
        this.age = studentAge;

    }

    Random random = new Random();


    void guessingAge() {
        int x = random.nextInt(35);
        System.out.println("I generated the random value " + x + " for " + name);
        if (age == x) {
            System.out.println("Age is equal to x");
        } else if (age < x) {
            System.out.println("Age is lower than x");

        } else {
            System.out.println("Age is greater than x");

        }


    }


}
