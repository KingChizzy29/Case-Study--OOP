import java.util.Scanner;

public class CustomerDetails {

    public static Scanner input = new Scanner(System.in);
    private String custName;
    private String custGender;
    private int custAge;
    private int custStudNum;
    public String setCustName(String custName) {
        System.out.print("Enter your name: ");
        custName = input.nextLine();
        this.custName = custName;
        return this.custName;
    }

    public String getCustName() {
        return custName;
    }

    public String setCustGender(String custGender) {
        this.custGender = custGender;
        custGender = input.nextLine();
        return custGender;
    }

    public String getCustGender() {
        return custGender;
    }

    public int setCustAge(int custAge) {
        System.out.print("Enter your age: ");
        this.custAge = custAge;
        return custAge;
    }

    public int getCustAge() {
        return custAge;
    }

    public int setCustStudNum(int custStudNum) {
        System.out.println("Enter your Customer/Student Number: ");
        this.custStudNum = custStudNum;
        return custStudNum;
    }

    public int getCustStudNum() {
        return custStudNum;
    }

    public static void CustomerInformation(){


    }
}
