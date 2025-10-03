package modul_3;

import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("masukan nama:");
        String nama = input.nextLine();
        System.out.println("masukan nim:");
        int nim = input.nextInt();

        Tes siswa = new Tes(nama,nim);

        System.out.println("nama: " + siswa.getNama());
        System.out.println("nim: " + siswa.getNim());
    }
}

