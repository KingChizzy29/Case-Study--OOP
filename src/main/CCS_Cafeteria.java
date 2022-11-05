package main;

import main.Menu.Menu;

import java.util.Scanner;

public class CCS_Cafeteria {
    private Scanner input;
    private Customer customer;
    private Menu menu;
    private Receipt receipt;

    public CCS_Cafeteria() {
        this.input = new Scanner(System.in);
        printWelcomeMessage();
        setCustomer();
        menu = new Menu();
        receipt = new Receipt(menu);
    }

    public void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("Welcome to CCS CAFETERIA ORDER SYSTEM");
    }

    public void setCustomer(){
        boolean isCustomerDetailsDone = false;

        while(!isCustomerDetailsDone) {
            this.customer = setCustomerDetails();
            isCustomerDetailsDone = isCustomerDetailsSatisfied();
        }
    }

    public Customer setCustomerDetails() {
        Customer customer;
        String name;
        char gender;
        int age;
        long id;

        System.out.println("(Please enter your information Below)");

        System.out.print("Your Name is: ");
        name = input.nextLine();

        System.out.print("Your Gender is: ");
        gender = input.nextLine().charAt(0);

        System.out.print("Age is: ");
        age = input.nextInt();

        System.out.print("Enter your Customer/Student Number is: ");
        id = input.nextLong(); input.nextLine();

        customer = new Customer(name, gender, age, id);
        customer.printDetails();

        return customer;
    }

    public boolean isCustomerDetailsSatisfied() {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("Press [Y] to proceed to Menu? and Press [N] to enter your details again: ");
        String again = input.nextLine();
        if (again.equalsIgnoreCase("Y")) {
            return true;
        } else {
            return false;
        }
    }
}
