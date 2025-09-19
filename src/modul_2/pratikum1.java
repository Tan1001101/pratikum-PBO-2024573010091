package modul_2;

public class pratikum1 {
    public static void main(String[] args) {
        int umur = 19;
        double tinggi = 175;
        char grade = 'B';
        boolean lulus = true;
        String nama = "Fathan";

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + "tahun");
        System.out.println("Tinggi: " + tinggi + "cm");
        System.out.println("Grade: " + grade);
        System.out.println("Lulus: " + lulus);

        int a = 10;
        int b = 3;

        System.out.println("\n==== operasi aritmatika====");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));

        System.out.println("\n==== casting tipe data ====");
        double nilaidouble = 9.8;
        int nilaiint = (int) nilaidouble;

        System.out.println("nilai double= " + nilaidouble);
        System.out.println(("nilai int= " + nilaiint));

        byte btyeVar = 50;
        short shortVar = 100;
        int hasil = btyeVar + shortVar;
        System.out.println("byte + short =" + hasil);
    }
}
