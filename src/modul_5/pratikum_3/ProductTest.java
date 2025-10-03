package modul_5.pratikum_3;

import java.util.Scanner;
public class ProductTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("SISTEM MANAJEMEN PRODUK\n");

        //  Membuat dua produk dengan PIN admin
        Product laptop = new Product("Laptop ASUS", 8500000, 15, "1234");
        Product mouse = new Product("Mouse Logitech", 150000, 50, "1234");

        System.out.println("\nPRODUK BERHASIL DIBUAT");
        laptop.tampilkanInfo();
        mouse.tampilkanInfo();

        //  TEST READ-ONLY PROPERTIES

        System.out.println("TEST READ-ONLY PROPERTIES");
        System.out.println("Product ID (read-only): " + laptop.getProductId());
        System.out.println("Created At (read-only): " + laptop.getCreatedAt());
        System.out.println(" Properti ini TIDAK BISA diubah setelah dibuat\n");


        //  TEST READ-WRITE PROPERTIES

        System.out.println("TEST READ-WRITE PROPERTIES");

        // Test 1: Ubah harga tanpa PIN (akan gagal)
        System.out.println("\n1️. Mencoba ubah harga dengan PIN salah:");
        laptop.setHarga(9000000, "0000");

        // Test 2: Ubah harga dengan PIN benar
        System.out.println("\n2️. Ubah harga dengan PIN benar:");
        laptop.setHarga(9000000, "1234");

        // Test 3: Ubah nama
        System.out.println("\n3. Ubah nama produk:");
        laptop.setNama("Laptop ASUS ROG", "1234");

        // Test 4: Ubah stok
        System.out.println("\n 4.Ubah stok:");
        laptop.setStok(20, "1234");


        //  TEST WRITE-ONLY PROPERTY

        System.out.println("\nTEST WRITE-ONLY PROPERTY (PIN)");
        System.out.println("PIN tidak bisa dibaca (tidak ada getter).");
        System.out.println("Hanya bisa diubah dengan validasi PIN lama:");
        // Ubah PIN dengan benar
        laptop.changeAdminPin("1234", "5678");
        // Ubah PIN dengan salah (akan gagal)
        laptop.changeAdminPin("0000", "9999");


        //  TEST COMPUTED PROPERTIES

        System.out.println("\nTEST COMPUTED PROPERTIES");
        System.out.printf("Total Nilai Laptop : Rp %.2f%n", laptop.getTotalNilai());
        System.out.println("Status Stok Laptop : " + laptop.getStatusStok());
        System.out.printf("Total Nilai Mouse  : Rp %.2f%n", mouse.getTotalNilai());
        System.out.println("Status Stok Mouse  : " + mouse.getStatusStok());

        //  TEST BUSINESS METHODS

        System.out.println("\nTEST BUSINESS METHODS");

        // Tambah stok laptop
        System.out.println("\n 1. Tambah stok laptop:");
        laptop.tambahStok(10, "5678"); // PIN sudah diganti ke 5678

        // Kurangi stok mouse
        System.out.println("\n 2. Kurangi stok mouse (penjualan):");
        mouse.kurangiStok(45, "1234");

        // Kurangi stok mouse lagi hingga menipis
        System.out.println("\n 3. Kurangi stok mouse lagi (stok akan menipis):");
        mouse.kurangiStok(4, "1234");

        // Coba kurangi stok lebih dari yang tersedia
        System.out.println("\n 4. Coba kurangi stok lebih dari tersedia:");
        mouse.kurangiStok(10, "1234");


        //  TAMPILKAN INFO AKHIR

        System.out.println("\nINFORMASI PRODUK SETELAH UPDATE:");
        laptop.tampilkanInfo();
        mouse.tampilkanInfo();

        //  RINGKASAN ENCAPSULATION

        System.out.println("RINGKASAN ENCAPSULATION ");
        System.out.println("----------------------------");
        System.out.println("READ-ONLY  : productId, createdAt   (tidak bisa diubah)");
        System.out.println("READ-WRITE : name, harga, stok      (bisa diubah dengan PIN atau dengan Validasi)");
        System.out.println("WRITE-ONLY : adminPin               (tidak bisa dibaca)");
        System.out.println("COMPUTED   : totalNilai, statusStok (dihitung otomatis)");
    }
}
