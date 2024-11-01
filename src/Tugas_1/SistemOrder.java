package Tugas_1;

import java.util.ArrayList;
import java.util.List;

public class SistemOrder {
    private List<Order> orderList;
    public SistemOrder() {
        orderList = new ArrayList<>();
    }
    public void addOrderItem(Menu item, int quantity) {
        orderList.add(new Order(item, quantity));
    }
    public double calculateTotalBill() {
        double total = 0;
        for (Order order : orderList) {
            total += order.calculateTotalPrice();
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("============Mr. SPICY=============");
        System.out.println("========= Nota Pemesanan =========");
        for (Order order : orderList) {
            System.out.println(order);
        }
        System.out.println("Total: " + calculateTotalBill());
        System.out.println("==================================");
    }
    public static void main(String[] args) {
        Menu mieGledek = new Menu("Mie Gledek", 20000);
        Menu NasiMumi = new Menu("Nasi mumi", 25000);
        Menu AyamKampusNegeri = new Menu("Ayam Kampus Negeri", 30000);
        Menu MojitoAjinomoto = new Menu("Mojito Ajinomoto", 20000);

        SistemOrder orderSystem = new SistemOrder();

        orderSystem.addOrderItem(mieGledek, 2);
        orderSystem.addOrderItem(NasiMumi, 1);
        orderSystem.addOrderItem(AyamKampusNegeri, 1);
        orderSystem.addOrderItem(MojitoAjinomoto, 3);
        orderSystem.printReceipt();
    }
}
