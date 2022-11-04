public class Menu {

    private final String Title1 = "CCS CAFETERIA WHOLE MENU ";

    public String getTitle1() {
        return Title1;
    }

    private final String  Title2 = "The Silog Rice Meals";
    private final String Title3 = "Snacks";
    private final String Title4 = "Drinks";

    public static  String Border = "+===================================+";
    public static String Division = "------------------------------";

    //Silog

    public static final String[] SRM = {"Tapsilog", "Tocilog  ", "Longsilog", "Porksilog"};

    //Price Silog
    public static final int[] PriceSRM = {45, 35, 45, 30};

    //Snacks
    public static final String[] Snacks = {"Lugaw   ", "Palabok ", "Siomai  ", "Burger   "};

    //Price for Snacks
    public static final int[] PriceSnacks = {20, 30, 15, 20};

    //Drinks
    public static final String[] Drinks = {"Coke     ", "Water   ", "Juice    "};

    //Price for Drinks
    public static final int[] PriceDrinks = {20, 20, 20};

    public void printMenu() {

        System.out.println(Border);
        System.out.println("\t" + Title1);
        System.out.println("\t" + Title2);

        for (var i = 0; i < SRM.length; ++i) {
            System.out.println("\t" + SRM[i] + "       P" + PriceSRM[i]);
        }
        System.out.println(Division);
        System.out.println("\t      " + Title3);

        for (var i = 0; i < Snacks.length; ++i) {
            System.out.println("\t" + Snacks[i] + "       P" + PriceSnacks[i]);
        }
        System.out.println(Division);
        System.out.println("\t      " + Title4);

        for (var i = 0; i < Drinks.length; ++i) {
            System.out.println("\t" + Drinks[i] + "       P" + PriceDrinks[i]);
        }
        System.out.println(Border);

        Order.takeOrder();
    }
}
