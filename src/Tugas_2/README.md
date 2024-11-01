# Restaurant Ordering System

Sistem pemesanan restoran sederhana ini dibuat dengan Java, memungkinkan pengguna untuk membuat pesanan, menghitung total harga, dan menghasilkan nota pembayaran. Proyek ini menerapkan prinsip OOP (Object-Oriented Programming) dan menggunakan *inheritance* untuk memperluas kelas menu item menjadi kelas pesanan.

## Deskripsi Proyek

Proyek ini terdiri dari tiga kelas utama:
- `MenuItem`: Mewakili item menu dasar dengan atribut nama item dan harga.
- `Pesanan`: Kelas turunan dari `MenuItem` yang berfungsi untuk membuat pesanan, menentukan jumlah item yang dipesan, dan menghitung total harga berdasarkan diskon dan pajak.
- `Main`: Kelas yang berisi metode `main()` sebagai titik masuk aplikasi, di mana pengguna dapat membuat pesanan dan melihat nota pembayaran di terminal.

### Fitur Utama

1. **Pemesanan**: Menambahkan item menu dengan jumlah yang dipesan.
2. **Nota**: Menampilkan detail pesanan, termasuk nama item, harga per item, jumlah item, dan total harga setelah diskon dan pajak.

## Prasyarat

- **Java**: Pastikan Java Development Kit (JDK) telah terpasang. Proyek ini dibangun menggunakan JDK versi 8 atau yang lebih baru.
- **Git**: (Opsional) Jika ingin mengelola kode ini melalui Git, pastikan Git telah terinstal di sistem Anda.
