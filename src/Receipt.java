import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Receipt
{

    private final String ADDRESS = "Tarlac State University - San Isidro Campus";
    private final String PHONENUMBER = "09366590294";

    public static int o = 1;//numbering of products

    public static void PrintReceipt(){

        final String ADDRESS = "Tarlac State University - San Isidro Campus";
        final String PHONENUMBER = "09366590294";

        Menu layout = new Menu(); //To get layout of Menu

        final int MIN = 10000;
        final int MAX = 10000000;
        int random_int = (int)Math.floor(Math.random()*(MAX-MIN+1)+MIN); //Generate Bill Number

        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); //For the current date and time
        LocalDateTime now = LocalDateTime.now();

        //Header details
        System.out.println("");
        System.out.println("=============== (Printing the Receipt) =============");
        System.out.println("\t\t\t  " + layout.getTitle1());
        System.out.println("\t\t\t    " +DTF.format(now));
        System.out.println("       "+ ADDRESS);
        System.out.println("\t\t\t\t     " + PHONENUMBER);;
        System.out.println("\t\t\t       Bill no." + random_int);
        System.out.println(layout.Division+layout.Division);

        //Main Body
        System.out.println("\tProducts: \t\tQuantity \tPrice \tAmount");
        /*
        for (String i:Order.orderBought){
            System.out.println("\t"+ o++ + ".)" + i);
        }
         */
        for (int i = 0; i < Order.orderBought.size(); i++) {
            System.out.println("\t"+ o++ + ".)" + Order.orderBought.get(i));
        }

        //Footer
        System.out.println(layout.Division+layout.Division);
        System.out.println("\t    The total payment of your Product(s): " + Order.totalPayment);
        System.out.println(layout.Division+layout.Division);
        System.out.println("\t\t    Thank you for dining with us \n\t\t\t  Eat as much as you like");
        System.out.println("=========="+Menu.Border+"=========");

    }

    public static void main(String[] args) {
        PrintReceipt();
    }
}
