import java.util.Scanner;

public class CustomerInfo {

    private String custName;
    private String custGender;
    private int custAge;
    private long custStudNum;

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustGender() {
        return custGender;
    }

    public void setCustGender(String custGender) {
        this.custGender = custGender;
    }

    public int getCustAge() {
        return custAge;
    }

    public void setCustAge(int custAge) {
        this.custAge = custAge;
    }

    public long getCustStudNum() {
        return custStudNum;
    }

    public void setCustStudNum(long custStudNum) {
        this.custStudNum = custStudNum;
    }

    //Set the information for the object Customer
    public static void enterDetails() {

        Scanner input = new Scanner(System.in);
        String name, gender;
        int age, custStudNumber;

        CustomerInfo customer = new CustomerInfo();

        Menu physicalMenu = new Menu();

        //Enter customer information
        System.out.println("=====================================");
        System.out.println("Welcome to CCS CAFETERIA ORDER SYSTEM\n (Please enter your information Below)");

        System.out.print("Your Name is: ");
        name = input.nextLine();
        customer.setCustName(name);

        System.out.print("Your Gender is: ");
        gender = input.nextLine();
        customer.setCustGender(gender);

        System.out.print("Age is: ");
        age = input.nextInt();
        customer.setCustAge(age);

        System.out.print("Enter your Customer/Student Number is: ");
        custStudNumber = input.nextInt(); input.nextLine();
        customer.setCustStudNum(custStudNumber);

        customer.savedCustInfo();//Display saved customer information

        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("Press [Y] to proceed to Menu? and Press [N] to enter your details again: ");
        String again = input.nextLine();
        if (again.equalsIgnoreCase("Y")) {
            physicalMenu.printMenu();
        } else {
            enterDetails();
        }
    }

    //Print the entered details
    public void savedCustInfo() {
        System.out.println("-----------------------------------------------");
        System.out.println("The entered information:");
        System.out.println("Your Name is: " + getCustName());
        System.out.println("Gender : " + getCustGender());
        System.out.println("Age is: " + getCustAge());
        System.out.println("Enter your Customer/Student Number is: " + getCustStudNum());

    }

}
