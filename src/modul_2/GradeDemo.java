package modul_2;

import java.util.Scanner;
public class GradeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan nilai (0-100): ");
        int nilai = input.nextInt();

        char grade;
        String keterangan;

        if(nilai>= 85){
            grade = 'A';
            keterangan = "excelent";
        } else if (nilai>=75) {
            grade = 'B';
            keterangan = "good";
        } else if (nilai>=65) {
            grade = 'C';
            keterangan = "fair";
        } else if (nilai >= 55) {
            grade = 'D';
            keterangan = "poor";
        } else {
            grade = 'E';
            keterangan = "fail";
        }

        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + grade);
        System.out.println("keterangan: " + keterangan);

        input.close();
    }
}
