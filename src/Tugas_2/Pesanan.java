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
     * Menghitung total harga setelah diskon dan pajak.
     *
     * @return total harga setelah pajak
     */
    private double calculateTotal() {
        double total = getItemPrice() * quantity;
        total = applyDiscount(total);
        return applyTax(total);
    }
    /**
     * Memberikan diskon 10% jika kuantitas pesanan melebihi 5.
     *
     * @param total harga total sebelum diskon
     * @return harga setelah diskon (jika berlaku)
     */
    private double applyDiscount(double total) {
        if (quantity > 5) {
            total *= 0.9; // Diskon 10%
        }
        return total;
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


//git init
//git add .
//git commit -m "kode pertama"
//git remote add origin
//git push -u origin main
//
//-membuat branch untuk fitur tambahan
//git checkout -b fitur-diskon
//
//-implementasi fitur/kode tambahan
//(tambahkan kode)
//
//-commit perubahan di branch fitur
//git add .
//git commit -m "tambah"
//
//-merge branch fitur ke branch (main)
//git checkout main
//git merge fitur-diskon
//git push origin main
//
//-delete
//git branch -d fitur-diskong
