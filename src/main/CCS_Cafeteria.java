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
        Customer customer = null;
        String name = null;
        char gender = 'a';
        int age = 0;
        long id = 0l;

        System.out.println("(Please enter your information Below)");

        System.out.print("Your Name is: ");
        name = input.nextLine();

        while(true) {
            try {
                System.out.print("Your Gender is (M/F): ");
                gender = input.nextLine().charAt(0);

                if(gender == 'M' || gender == 'F') {
                    break;
                }else{
                    throw new Exception();
                }
            } catch(Exception e) {
                System.out.println("Error: Invalid Input");
            }
        }

        while(true) {
            try {
                System.out.print("Age is: ");
                age = Integer.parseInt(input.nextLine());

                if(age <= 0) {
                    throw new Exception();
                } else{
                    break;
                }
            }catch (Exception e) {
                System.out.println("Error: Invalid Input");
                age = 0;
            }
        }

        while(true) {
            try {
                System.out.print("Enter your Customer/Student Number is: ");
                id = Long.parseLong(input.nextLine());

                if(id <= 0) {
                    throw new Exception();
                } else{
                    break;
                }
            }catch (Exception e) {
                System.out.println("Error: Invalid Input");
            }
        }

        try {
            customer = new Customer(name, gender, age, id);
            customer.printDetails();
        }catch (Exception e) {
            System.out.println("Error: Incorrect Input \nPlease try again");
            setCustomerDetails();
        }

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
