package workshop1;

class Person {
    String name;
    int age;

    // Constructor that takes both name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor that takes only name (default age set to 30)
    public Person(String name) {
        this.name = name;
        this.age = 21;  // Default age
    }

    // Method to print person details
    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class qn15 {
    public static void main(String[] args) {
        // Creating Person objects using different constructors
        Person person1 = new Person("Arpan", 20);  // Constructor with name and age
        Person person2 = new Person("Aakriti");        // Constructor with only name

        // Printing their details
        System.out.println("Person 1 Details:");
        person1.printDetails();  // Prints name and age of person1

        System.out.println("Person 2 Details:");
        person2.printDetails();  // Prints name and default age of person2
    }
}
