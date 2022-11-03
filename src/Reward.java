//Extends Order to access variable in order method
public class Reward extends Order {

    private int voucher1 = 10;
    private int voucher2 = 20;
    private int voucher3 = 30;

    public void checkValidityDiscount() {

        CustomerInfo getCustomerInfo = new CustomerInfo();

        System.out.println(" ");
        System.out.println("============Checking available voucher================");

        if (Order.totalItems == 10) {
            totalPayment = totalPayment / voucher1;
            System.out.println("Congrats dear customer "  + getCustomerInfo +" you are eligible for the 10% voucher!!!");
        } else if (Order.totalItems == 20) {
            totalPayment = totalPayment / voucher2;
            System.out.println("Congrats dear customer " + " you are eligible for the 20% voucher!!!");
        } else if (Order.totalItems == 30) {
            totalPayment = totalPayment / voucher3;
            System.out.println("Congrats dear customer " + " you are eligible for the 30% voucher!!!");
        } else {
            System.out.println(" ");
            System.out.println("\t\t   Sorry dear customer " + " \nYou are not eligible to get a reward for our voucher!");
        }
    }

}
