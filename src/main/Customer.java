package main;

public class Customer {
    private String name;
    private char gender;
    private int age;
    private long id;

    public Customer(String name, char gender, int age, long id) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
    }

    public void printDetails() {
        System.out.println("-----------------------------------------------");
        System.out.println("The entered information:");
        System.out.println("Your Name is: " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Age is: " + age);
        System.out.println("Enter your Customer/Student Number is: " + id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
