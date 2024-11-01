package Tugas_2;

/**
 * Mewakili sebuah item di menu restoran.
 */
public class MenuItem {
    private String itemName;
    private double itemPrice;

    /**
     * Membuat sebuah objek MenuItem dengan nama dan harga yang ditentukan.
     *
     * @param itemName  nama dari item menu
     * @param itemPrice harga dari item menu
     */
    public MenuItem(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    /**
     * Mengambil nama dari item menu.
     *
     * @return nama item menu
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Mengambil harga dari item menu.
     *
     * @return harga item menu
     */
    public double getItemPrice() {
        return itemPrice;
    }
}
