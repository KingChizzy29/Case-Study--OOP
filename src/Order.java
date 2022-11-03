import java.util.Scanner;
import java.util.ArrayList;
//
public class Order extends CustomerInfo {

        public static ArrayList<String> orderBought = new ArrayList<String>();

        public static int amount;
        public static int totalItems;
        public static int choiceType, choiceProduct;
        public static int quantityPurchased ;
        public static double totalPayment;

        public static void takeOrder() {


                Reward checkReward = new Reward();
                Scanner input = new Scanner(System.in);
                String again;

                System.out.println("-------------------------------");
                System.out.println("What would you like to order?");
                System.out.print("Press 1 for [Silog Rice Meals], Press 2 for [Snacks], Press 3 for [Drinks]: ");
                choiceType = input.nextInt();
                System.out.println("---------------------------------------------------------------------------------------------------");
                //Option for Silog Rice Meals

                if (choiceType == 1) {

                        System.out.print("Press 1 (Tapsilog), Press 2 (Tocilog), Press 3 (Longsilog), Press 4 (Porksilog), and Press 5 to Cancel: ");
                        choiceProduct = input.nextInt();
                        //conditions
                        totalItems = quantityPurchased + quantityPurchased;//Total Items for Reward
                        if (choiceProduct == 1) {
                                System.out.println("You have chosen Tapsilog");
                                System.out.print("How many Tapsilog do you want to Buy? :");
                                quantityPurchased = input.nextInt();
                                totalPayment = totalPayment + (quantityPurchased * Menu.PriceSRM[0]);
                                amount = quantityPurchased * Menu.PriceSRM[0];
                                orderBought.add(Menu.SRM[0] + "        " + quantityPurchased +"        " + Menu.PriceSRM[0] + "        "+ amount);

                                System.out.println("+++  Do you want to buy again?  +++");
                                System.out.print("Press [Y] for Yes and [N] for No : ");
                                again = input.next();
                                if (again.equalsIgnoreCase("Y")) {
                                        takeOrder();//call the method you to create
                                } else {
                                        checkReward.checkValidityDiscount();
                                        Receipt.PrintReceipt();
                                }

                        } else if (choiceProduct == 2) {

                                System.out.println("You have chosen Tocilog");
                                System.out.print("How many Tocilog you want to Buy? :");
                                quantityPurchased = input.nextInt();
                                totalPayment = totalPayment + (quantityPurchased * Menu.PriceSRM[1]);
                                amount = quantityPurchased * Menu.PriceSRM[1];
                                orderBought.add(Menu.SRM[1] + "        " + quantityPurchased +"        " + Menu.PriceSRM[1] + "        "+ amount);

                                System.out.println("+++  Do you want to buy again?  +++");
                                System.out.print("Press [Y] for Yes and [N] for No : ");
                                again = input.next();
                                if (again.equalsIgnoreCase("Y")) {
                                        takeOrder();//call the method you to create
                                } else {
                                        checkReward.checkValidityDiscount();
                                        Receipt.PrintReceipt();
                                }
                        } else if (choiceProduct == 3) {

                                System.out.println("You have chosen Longsilog");
                                System.out.print("How many Longsilog you want to Buy? :");
                                quantityPurchased = input.nextInt();
                                totalPayment = totalPayment + (quantityPurchased * Menu.PriceSRM[2]);
                                amount = quantityPurchased * Menu.PriceSRM[0];
                                orderBought.add(Menu.SRM[2] + "        " + quantityPurchased +"        " + Menu.PriceSRM[2] + "        "+ amount);

                                System.out.println("+++  Do you want to buy again?  +++");
                                System.out.print("Press [Y] for Yes and [N] for No : ");
                                again = input.next();
                                if (again.equalsIgnoreCase("Y")) {
                                        takeOrder();//call the method you to create
                                } else {
                                        checkReward.checkValidityDiscount();
                                        Receipt.PrintReceipt();
                                }

                        } else if (choiceProduct == 4) {

                                System.out.println("You have chosen Longsilog");
                                System.out.print("How many Longsilog you want to Buy? :");
                                quantityPurchased = input.nextInt();
                                totalPayment = totalPayment + (quantityPurchased * Menu.PriceSRM[3]);
                                amount = quantityPurchased * Menu.PriceSRM[3];
                                orderBought.add(Menu.SRM[3] + "        " + quantityPurchased +"        " + Menu.PriceSRM[3] + "        "+ amount);

                                System.out.println("+++  Do you want to buy again?  +++");
                                System.out.print("Press [Y] for Yes and [N] for No : ");
                                again = input.next();
                                if (again.equalsIgnoreCase("Y")) {
                                        takeOrder();//call the method you to create
                                } else {
                                        checkReward.checkValidityDiscount();
                                        Receipt.PrintReceipt();
                                }
                        } else if (choiceProduct == 5) {
                                System.exit(0);//close program
                        } else {
                                System.out.println("Choose 1 to 5 only!");
                                takeOrder();
                        }
                        //Option for Snacks
                } else if (choiceType == 2) {
                        System.out.print("Press 1 (Lugaw), Press 2 (Palabok), Press 3 (Siomai), Press 4 (Burger), and Press 5 to Cancel: ");
                        choiceProduct = input.nextInt();
                        //conditions
                        if (choiceProduct == 1) {
                                System.out.println("You have chosen Lugaw");
                                System.out.print("How many Lugaw do you want to Buy? :");
                                quantityPurchased = input.nextInt();
                                totalPayment = totalPayment + (quantityPurchased * Menu.PriceSnacks[0]);
                                amount = quantityPurchased * Menu.PriceSnacks[0];
                                orderBought.add(Menu.Snacks[0] + "        " + quantityPurchased +"        " + Menu.PriceSnacks[0] + "        "+ amount);

                                System.out.println("+++  Do you want to buy again?  +++");
                                System.out.print("Press [Y] for Yes and [N] for No : ");
                                again = input.next();
                                if (again.equalsIgnoreCase("Y")) {
                                        takeOrder();//call the method you to create
                                } else {
                                        checkReward.checkValidityDiscount();
                                        Receipt.PrintReceipt();
                                }

                        } else if (choiceProduct == 2) {
                                System.out.println("You have chosen Palabok");
                                System.out.print("How many Palabok do you want to Buy? :");
                                quantityPurchased = input.nextInt();
                                totalPayment = totalPayment + (quantityPurchased * Menu.PriceSnacks[1]);
                                amount = quantityPurchased * Menu.PriceSnacks[1];
                                orderBought.add(Menu.Snacks[1] + "        " + quantityPurchased +"        " + Menu.PriceSnacks[1] + "        "+ amount);

                                System.out.println("+++  Do you want to buy again?  +++");
                                System.out.print("Press [Y] for Yes and [N] for No : ");
                                again = input.next();
                                if (again.equalsIgnoreCase("Y")) {
                                        takeOrder();//call the method you to create
                                } else {
                                        checkReward.checkValidityDiscount();
                                        Receipt.PrintReceipt();
                                }
                        } else if (choiceProduct == 3) {
                                System.out.println("You have chosen Siomai");
                                System.out.print("How many Siomai do you want to Buy? :");
                                quantityPurchased = input.nextInt();
                                totalPayment = totalPayment + (quantityPurchased * Menu.PriceSnacks[2]);
                                amount = quantityPurchased * Menu.PriceSnacks[2];
                                orderBought.add(Menu.Snacks[2] + "        " + quantityPurchased +"        " + Menu.PriceSnacks[2] + "        "+ amount);

                                System.out.println("+++  Do you want to buy again?  +++");
                                System.out.print("Press [Y] for Yes and [N] for No : ");
                                again = input.next();
                                if (again.equalsIgnoreCase("Y")) {
                                        takeOrder();//call the method you to create
                                } else {
                                        checkReward.checkValidityDiscount();
                                        Receipt.PrintReceipt();
                                }

                        } else if (choiceProduct == 4) {
                                System.out.println("You have chosen Burger");
                                System.out.print("How many Burger do you want to Buy? :");
                                quantityPurchased = input.nextInt();
                                totalPayment = totalPayment + (quantityPurchased * Menu.PriceSnacks[3]);
                                amount = quantityPurchased * Menu.PriceSnacks[3];
                                orderBought.add(Menu.Snacks[3] + "        " + quantityPurchased +"        " + Menu.PriceSnacks[3] + "        "+ amount);

                                System.out.println("+++  Do you want to buy again?  +++");
                                System.out.print("Press [Y] for Yes and [N] for No : ");
                                again = input.next();
                                if (again.equalsIgnoreCase("Y")) {
                                        takeOrder();//call the method you to create
                                } else {
                                        checkReward.checkValidityDiscount();
                                        Receipt.PrintReceipt();
                                }
                        } else if (choiceProduct == 5) {
                                System.exit(0);//close program
                        } else {
                                System.out.println("Choose 1 to 4 only!");
                                takeOrder();
                        }
                        //Option for Drinks
                } else if (choiceType == 3) {

                        System.out.print("Press 1 (Coke), Press 2 to (Water), Press 3 to (Juice), and Press 4 to Cancel: ");

                        choiceProduct = input.nextInt();

                        if (choiceProduct == 1) {
                                System.out.println("You have chosen Coke");
                                System.out.print("How many Coke do you want to Buy? :");
                                quantityPurchased = input.nextInt();
                                totalPayment = totalPayment + (quantityPurchased * Menu.PriceDrinks[0]);
                                amount = quantityPurchased * Menu.PriceDrinks[0];
                                orderBought.add(Menu.Drinks[0] + "        " + quantityPurchased +"        " + Menu.PriceDrinks[0] + "        "+ amount);

                                System.out.println("+++  Do you want to buy again?  +++");
                                System.out.print("Press [Y] for Yes and [N] for No : ");
                                again = input.next();
                                if (again.equalsIgnoreCase("Y")) {
                                        takeOrder();//call the method you to create
                                } else {
                                        checkReward.checkValidityDiscount();
                                        Receipt.PrintReceipt();
                                }

                        } else if (choiceProduct == 2) {
                                System.out.println("You have chosen Water");
                                System.out.print("How many Water do you want to Buy? :");
                                quantityPurchased = input.nextInt();
                                totalPayment = totalPayment + (quantityPurchased * Menu.PriceDrinks[1]);
                                amount = quantityPurchased * Menu.PriceDrinks[1];
                                orderBought.add(Menu.Drinks[1] + "        " + quantityPurchased +"        " + Menu.PriceDrinks[1] + "        "+ amount);

                                System.out.println("+++  Do you want to buy again?  +++");
                                System.out.print("Press [Y] for Yes and [N] for No : ");
                                again = input.next();
                                if (again.equalsIgnoreCase("Y")) {
                                        takeOrder();//call the method you to create
                                } else {
                                        checkReward.checkValidityDiscount();
                                        Receipt.PrintReceipt();
                                }
                        } else if (choiceProduct == 3) {
                                System.out.println("You have chosen Juice");
                                System.out.print("How many Juice do you want to Buy? :");
                                quantityPurchased = input.nextInt();
                                totalPayment = totalPayment + (quantityPurchased * Menu.PriceDrinks[2]);
                                amount = quantityPurchased * Menu.PriceDrinks[2];
                                orderBought.add(Menu.Drinks[2] + "        " + quantityPurchased +"        " + Menu.PriceDrinks[2] + "        "+ amount);

                                System.out.println("+++  Do you want to buy again?  +++");
                                System.out.print("Press [Y] for Yes and [N] for No : ");
                                again = input.next();
                                if (again.equalsIgnoreCase("Y")) {
                                        takeOrder();//call the method you to create
                                } else {
                                        checkReward.checkValidityDiscount();
                                        Receipt.PrintReceipt();
                                }
                        } else if (choiceProduct == 5) {
                                System.exit(0);//close program
                        } else {
                                System.out.println("Choose 1 to 4 only!");
                                takeOrder();
                        }
                }
        }

        public static void main(String[] args) {
        takeOrder();
        }

}
