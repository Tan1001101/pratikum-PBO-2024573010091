package modul_2;

import java.util.Scanner;
public class NestedIfDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("masukan umur: ");
        int umur = input.nextInt();

        if(umur>= 0){
            if(umur<= 2){
                System.out.println("kategori: bayi");
            } else if (umur <= 5) {
                System.out.println("kategori: balita");
            } else if (umur <= 12) {
                System.out.println("kategori: anak-anak");
            } else if (umur <= 19) {
                System.out.println("kategori: remaja");
            } else if (umur <= 59) {
                System.out.println("kategori: dewasa");
            }else {
                System.out.println("kategori: lansia");
            }
        }else{
            System.out.println("umur tidak valid");
        }
        input.close();
    }
}
