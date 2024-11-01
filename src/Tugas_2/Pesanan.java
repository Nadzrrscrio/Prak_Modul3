package Tugas_2;

/**
 * Mewakili pesanan di restoran, termasuk jumlah dari item menu yang dipesan.
 * Kelas ini merupakan extends kelas MenuItem.
 */
public class Pesanan extends MenuItem {
    private int quantity;

    /**
     * Membuat objek Pesanan dengan nama item, harga item, dan jumlah yang ditentukan.
     *
     * @param itemName  nama item yang dipesan
     * @param itemPrice harga item yang dipesan
     * @param quantity  jumlah item yang dipesan
     */
    public Pesanan(String itemName, double itemPrice, int quantity) {
        super(itemName, itemPrice);
        this.setQuantity(quantity);
    }

    /**
     * Mengatur jumlah dari item yang dipesan.
     *
     * @param quantity jumlah item yang dipesan
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Membuat dan menampilkan struk untuk pesanan ini.
     */
    public void generateReceipt() {
        System.out.println("Makanan: " + getItemName());
        System.out.println("Harga per item: Rp" + getItemPrice());
        System.out.println("Jumlah: " + getQuantity());
        System.out.println("Total: Rp" + calculateTotal());
    }

    /**
     * Menghitung total harga untuk pesanan berdasarkan harga item dan jumlah.
     *
     * @return total harga pesanan
     */
    private double calculateTotal() {
        return getItemPrice() * quantity;
    }

    /**
     * Mengambil jumlah dari item yang dipesan.
     *
     * @return jumlah item yang dipesan
     */
    public int getQuantity() {
        return quantity;
    }
}
