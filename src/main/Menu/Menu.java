package main.Menu;

import java.util.ArrayList;

public class Menu {
    private final String TITLE = "CCS CAFETERIA WHOLE MENU ";
    private final String CATEGORY1 = "The Silog Rice Meals";
    private final String CATEGORY2 = "Snacks";
    private final String CATEGORY3 = "Drinks";
    private final String BORDER = "+===================================+";
    private final String DIVISION = "------------------------------";
    private ArrayList<MenuItem> silogRiceMeals = new ArrayList<>();
    private ArrayList<MenuItem> snacks = new ArrayList<>();
    private ArrayList<MenuItem> drinks = new ArrayList<>();

    public Menu() {
        loadMenuItems();
    }

    public void loadMenuItems() {
        addToMenu("Tapsilog", 45, 1);
        addToMenu("Tocilog", 35, 1);
        addToMenu("Longsilog", 45, 1);
        addToMenu("Porksilog", 35, 1);
        addToMenu("Lugaw", 20, 2);
        addToMenu("Palabok", 30, 2);
        addToMenu("Siomai", 15, 2);
        addToMenu("Burger", 20, 2);
        addToMenu("Coke", 20, 3);
        addToMenu("Water", 20, 3);
        addToMenu("Juice", 20, 3);
    }

    public void addToMenu(String name, int price, int category) {
        MenuItem menuItem = new MenuItem(name, price);
        if (category == 1) {
            silogRiceMeals.add(menuItem);
        }else if(category == 2) {
            snacks.add(menuItem);
        }else if(category == 3) {
            drinks.add(menuItem);
        }
    }

    public void printMenu() {
        System.out.println(BORDER);
        System.out.println("\t" + TITLE);

        System.out.println("\t" + CATEGORY1);
        for (var i = 0; i < silogRiceMeals.size(); ++i) {
            MenuItem menuItem = silogRiceMeals.get(i);
            System.out.println("\t" + menuItem.getName() + "       P" + menuItem.getPrice());
        }

        System.out.println(DIVISION);

        System.out.println("\t      " + CATEGORY2);
        for (var i = 0; i < snacks.size(); ++i) {
            MenuItem menuItem = snacks.get(i);
            System.out.println("\t" + menuItem.getName() + "       P" + menuItem.getPrice());
        }

        System.out.println(DIVISION);

        System.out.println("\t      " + CATEGORY3);
        for (var i = 0; i < drinks.size(); ++i) {
            MenuItem menuItem = drinks.get(i);
            System.out.println("\t" + menuItem.getName() + "       P" + menuItem.getPrice());
        }
    }

}
