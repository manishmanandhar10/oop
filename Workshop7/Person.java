package Workshop7;

public class Person {
    protected String personID;
    protected String name;
    protected int age;
    protected String gender;
    protected String address;
    protected String contactDetails;

    public void viewPersonalDetails() {
        System.out.println("ID: " + personID + ", Name: " + name + ", Age: " + age);
    }
}

