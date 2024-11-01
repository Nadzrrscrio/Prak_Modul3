package Tugas_2;

/**
 * Kelas utama untuk menjalankan aplikasi.
 * Menampilkan pembuatan pesanan dan pembuatan struk.
 */
public class Main {

    /**
     * Metode utama untuk menjalankan aplikasi.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Pesanan order1 = new Pesanan("Burger", 5.99, 2);
        order1.generateReceipt();
    }
}
