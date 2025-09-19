package modul_1.DataDiri;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataDiri {
    public static void main(String[] args){
        String nama = "Fathan Al Ghifari";
        String nim = "2024573010091";
        int umur = 19;
        String hobi = "Nonton";
        String jurusan = "Teknologi Informasi & Komputer";
        String prodi = "Teknik Informatika";

        LocalDate tanggal = LocalDate.of(2006,8,24);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String tanggalLahir = tanggal.format(myFormatObj);

        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Pordi: " + prodi);
        System.out.println("Umur: " + umur);
        System.out.println("Hobi: " + hobi);
        System.out.println("Tanggal Lahir:  " + tanggalLahir);
    }

}
