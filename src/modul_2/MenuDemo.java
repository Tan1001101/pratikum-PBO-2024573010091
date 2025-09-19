package modul_2;

import java.util.Scanner;
public class MenuDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==== MENU PILIHAN ====");
        System.out.println("1. hitung luas persegi");
        System.out.println("2. hitung luas segitiga");
        System.out.println("3. hitung luas lingkaran");
        System.out.println("4. keluar");

        System.out.print("1pilih menu: ");
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                System.out.print("masukan sisi persegi: ");
                double sisi = input.nextDouble();
                double luasPersegi = sisi * sisi;
                System.out.println("luas persegi: " + luasPersegi);
                break;
            case 2:
                System.out.print("masukan alas segitiga: ");
                double alas = input.nextDouble();
                System.out.print("masukan tinggi segitiga: ");
                double tinggi = input.nextDouble();
                double luasSegitiga = 0.5 * alas * tinggi;
                System.out.println("luas segitiga: " + luasSegitiga);
                break;
            case 3:
                System.out.print("masukan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();
                double luasLingkaran = Math.PI * jariJari * jariJari;
                System.out.println("luas lingkaran: " + luasLingkaran);
                break;
            case 4:
                System.out.println("terima kasih telah menggunakan program ini");
                break;
            default:
                System.out.println("pilihan tidak valid");
        }
        input.close();
    }
}
