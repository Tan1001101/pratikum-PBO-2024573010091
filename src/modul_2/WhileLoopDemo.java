package modul_2;

import java.util.Scanner;
public class WhileLoopDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("=== while loop - tebak angka ===");
        int angkarahasia = 9;
        int tebakan = 0;

        while(tebakan != angkarahasia){
            System.out.print("tebak angka (1-10): ");
            tebakan = input.nextInt();

            if(tebakan < angkarahasia){
                System.out.println("terlalu kecil");
            } else if (tebakan > angkarahasia) {
                System.out.println("terlalu besar");
            }else{
                System.out.println("benar! angka rahasianya adalah: " + angkarahasia);
            }
        }

        System.out.println("\n=== do-while Loop - menu ===");
        int pilihan;

        do {
            System.out.println("\n1. tampilkan pesan");
            System.out.println("2. hitung faktorial");
            System.out.println("3. keluar");
            System.out.print("pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan){
                case 1:
                    System.out.println("hello world");
                    break;
                case 2:
                    System.out.print("masukan angka: ");
                    int n = input.nextInt();
                    long faktorial = 1;
                    for(int i =1; i <n ; i++){
                        faktorial *= i;
                    }
                    System.out.println("faktorial " + n + " = " + faktorial);
                    break;
                case 3:
                    System.out.println("terima kasih");
                    break;
                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }
        } while (pilihan != 3);
        input.close();
    }
}
