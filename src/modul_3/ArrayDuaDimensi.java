package modul_3;

import java.util.Scanner;

public class ArrayDuaDimensi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] nilaiSiswa =  new int[3][4];
        String[] namaSiswa = {"Andi", "Bobi", "Cia"};
        String[] mataPelajaran = {"Matematika", "Bahasa Indonesia", "IPA", "IPS"};

        System.out.println("=== input nilai siswa ===");
        for(int i = 0; i<3;i++){
            System.out.println("input nilai untuk " + namaSiswa[i] + ": ");
            for(int j = 0; j<4;j++){
                System.out.print(mataPelajaran[j] + ":");
                nilaiSiswa[i][j] = input.nextInt();
            }
            System.out.println();
        }

        System.out.println("=== tabel nilai siswa ===");
        System.out.printf("%-12s", "Nama");
        for(String mapel : mataPelajaran){
            System.out.printf("%-8s", mapel.substring(0, Math.min(7, mapel.length())));
        }
        System.out.println("rata rata");

        for(int i = 0 ;i<3;i++){
            System.out.printf("%-12s", namaSiswa[i]);
            int total = 0;
            for(int j = 0; j<4;j++){
                System.out.printf("%-8s", nilaiSiswa[i][j]);
                total += nilaiSiswa[i][j];
            }
            Double rataRata = total / 4.0;
            System.out.printf("%.2f\n", rataRata);
        }

    }
}
