package Tugas_1;

import Tugas_1.Menu;

public class Order {
    private Menu item;
    private int quantity;

    public Order(Menu item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }
    public double calculateTotalPrice() {
        return item.getPrice() * quantity;
    }
    public String toString() {
        return item.getName() + " x " + quantity + " = " + calculateTotalPrice();
    }
}
