package modul_3;

public class ArraySatuDimensi {
    public static void main(String[] args){
        int[] nilai = {91, 85, 78, 88, 92};
        String[] nama = {"Andi", "Budi", "Cici", "Dodi", "Emily"};
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        System.out.println("jumlah siswa: " + nama.length);

        System.out.println("nama siswa pertama: " + nama[0]);
        System.out.println("nilai siswa pertama: " + nilai[0]);

        System.out.println("\n nilai semua siswa:");
        for(int i = 0; i < nama.length; i++){
            System.out.println((i+1) + ". " + nama[i] + " - nilai: " + nilai[i]);
        }

        for(int i = 1; i < nilai.length;i++){
            if(nilai[i] > tertinggi){
                tertinggi = nilai[i];
            }
            if(nilai[i] < terendah){
                terendah = nilai[i];
            }
        }
        System.out.println("\n nilai tertinggi: " + tertinggi);
        System.out.println(" nilai teredah: " + terendah);
    }
}
