package modul_3.latihan;

public class latihan1 {
    public static void main(String[] args){
        int[] nilai = {89, 90, 72, 67, 48, 82, 83, 99, 92, 70};
        int rata_rata;
        int sementara = 0;
        int tertingi = nilai[0];
        int terendah = nilai[0];

        for(int i = 0;i < nilai.length;i+=2){
            sementara = nilai[i] + nilai[i+1];
        }
        rata_rata = sementara / 2;
        for(int i = 1; i < nilai.length;i++){
            if(nilai[i] > tertingi){
                tertingi = nilai[i];
            }
            if(nilai[i] < terendah){
                terendah = nilai[i];
            }

        }
        System.out.println("nilai rata rata: " + rata_rata);
        System.out.println("nilai tertinggi: " + tertingi);
        System.out.println("nilai teredah: " + terendah);

    }
}
