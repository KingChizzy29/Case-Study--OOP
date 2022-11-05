package main;

import main.Menu.Menu;
import main.Menu.MenuItem;
import main.Menu.Order;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Receipt {
    private Scanner input;
    private boolean isOrderComplete;
    private final String TITLE = "CCS CAFETERIA WHOLE MENU";
    private final String ADDRESS = "Tarlac State University - San Isidro Campus";
    private final String PHONE_NUMBER = "09366590294";
    private LocalDateTime dateAndTime;
    private long id;
    private ArrayList<ArrayList<MenuItem>> menuItem = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private double totalAmount;

    private final String DIVISION = "------------------------------------------------------------";

    public Receipt(Menu menu) {
        input = new Scanner(System.in);
        addMenuReference(menu);

        this.isOrderComplete = false;
        while(!isOrderComplete) {
            takeOrder(isOrderComplete);
        }

        print();
    }

    public void addMenuReference(Menu menu){
        menuItem.add(menu.getSilogRiceMeals());
        menuItem.add(menu.getSnacks());
        menuItem.add(menu.getDrinks());
    }

    public void takeOrder(boolean isOrderComplete) {
        int categoryNum;
        int productNum;
        int orderQuantity;

        System.out.println("-------------------------------");
        System.out.println("What would you like to order?");
        System.out.print("Press 1 for [Silog Rice Meals], Press 2 for [Snacks], Press 3 for [Drinks]: ");
        categoryNum = input.nextInt();
        System.out.println(DIVISION);

        ArrayList<MenuItem> chosenCategory = menuItem.get(categoryNum- 1 );
        for(int i = 0; i < chosenCategory.size(); i++) {
            System.out.println("Press " + (i+1) + " for [" + chosenCategory.get(i).getName() +"]");

        }
        System.out.print("Enter choice: ");
        productNum = input.nextInt();input.nextLine();

        MenuItem chosenProduct = chosenCategory.get(productNum - 1);
        System.out.print("How many " + chosenProduct.getName() + " do you want to Buy? :");
        orderQuantity = input.nextInt();input.nextLine();

        String orderName = chosenProduct.getName();
        int orderPrice = chosenProduct.getPrice();
        Order order = new Order(orderName, orderPrice, orderQuantity);
        orders.add(order);

        System.out.println("+++  Do you want to buy again?  +++");
        System.out.print("Press [Y] for Yes and [N] for No : ");
        char addOtherOrder  = input.nextLine().charAt(0);

        if(addOtherOrder == 'N') {
            this.isOrderComplete = true;
        }
    }

    public void print() {
        this.id = generateId();
        this.dateAndTime = getDateAndTimeNow();
        this.totalAmount = getOrdersTotalAmount();

        printHeader();
        printOrders();
        printFooter();
    }

    public long generateId() {
        final int MIN = 10000;
        final int MAX = 10000000;
        int randomInt = (int)Math.floor(Math.random()*(MAX-MIN+1)+MIN);

        return randomInt;
    }

    public LocalDateTime getDateAndTimeNow() {
        return LocalDateTime.now();
    }

    public double getOrdersTotalAmount() {
        double total = 0;
        for (int i = 0;i < orders.size();i++) {
            int subtotal = orders.get(i).getAmount();
            total += subtotal;
        }

        return total;
    }

    public void printHeader() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        System.out.println("");
        System.out.println("=============== (Printing the Receipt) =============");
        System.out.println("\t\t\t  " + TITLE);
        System.out.println("\t\t\t    " + dateTimeFormatter.format(this.dateAndTime));
        System.out.println("       "+ ADDRESS);
        System.out.println("\t\t\t\t     " + PHONE_NUMBER);;
        System.out.println("\t\t\t       Bill no." + this.id);
        System.out.println(DIVISION);
    }

    public void printOrders() {
        System.out.println("\tProducts: \t\tQuantity \tPrice \tAmount");
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            String name = order.getName();
            int quantity = order.getQuantity();
            int price = order.getPrice();
            int amount = order.getAmount();

            System.out.println("\t"+ (i+1) + ".)" + name + "\t\t" + quantity + "\t\t\t" + price + "\t\t" + amount);
        }
    }

    public void printFooter() {
        System.out.println(DIVISION);
        System.out.println("\t    The total payment of your Product(s): " + this.totalAmount);
        System.out.println(DIVISION);
        System.out.println("\t\t    Thank you for dining with us \n\t\t\t  Eat as much as you like");
        System.out.println(DIVISION);
    }
}