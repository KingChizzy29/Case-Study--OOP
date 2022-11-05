package main.Menu;

public class Order extends MenuItem {
    private int quantity;
    private int amount;

    public Order(String name, int price, int quantity) {
        super(name, price);
        this.quantity = quantity;
        computeAmount();
    }

    public void computeAmount() {
        amount = getPrice() * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAmount() {
        return amount;
    }
}
