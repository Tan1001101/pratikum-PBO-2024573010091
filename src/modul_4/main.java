package modul_4;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------");
        System.out.println("                 SISTEM KARTU RENCANA STUDI (KRS)                 ");
        System.out.println("------------------------------------------------------------------");
        System.out.println("\nInput Data Mahasiswa:");
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Jurusan: ");
        String jurusan = input.nextLine();

        Mahasiswa mhs = new Mahasiswa(nama, nim, jurusan, 0.0);

        KartuRencanaStudi krs = new KartuRencanaStudi(mhs, 10);

        boolean running = true;

        while (running) {
            System.out.println("\n=================================");
            System.out.println("            MENU KRS             ");
            System.out.println("=================================");
            System.out.println("[1]. Tambah Mata Kuliah");
            System.out.println("[2]. Hapus Mata Kuliah");
            System.out.println("[3]. Input Nilai Mata Kuliah");
            System.out.println("[4]. Tampilkan KRS");
            System.out.println("[5]. Tampilkan Nilai Terbaik & Terburuk");
            System.out.println("[6]. Keluar");
            System.out.println("---------------------------------");
            System.out.print("Pilih menu: ");

            int pilihan;
            try {
                pilihan = input.nextInt();
            } catch (java.util.InputMismatchException e) {
                pilihan = -1;
            }
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- TAMBAH MATA KULIAH ---");
                    System.out.print("Kode Mata Kuliah: ");
                    String kode = input.nextLine();

                    System.out.print("Nama Mata Kuliah: ");
                    String namaMK = input.nextLine();

                    System.out.print("Jumlah SKS: ");
                    int sks;
                    try {
                        sks = input.nextInt();
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Input SKS tidak valid. Mata kuliah dibatalkan.");
                        input.nextLine();
                        break;
                    }
                    input.nextLine();

                    MataKuliah mk = new MataKuliah(kode, namaMK, sks);
                    krs.tambahMatakuliah(mk);
                    break;

                case 2:
                    System.out.println("\n --- hapus mata kuliah ---");
                    System.out.print("masukan kode mata kuliah yang ingin dihapus: ");
                    String kodeHapus = input.nextLine();
                    krs.hapusMatakuliah(kodeHapus);
                    break;

                case 3:
                    System.out.println("\n--- INPUT NILAI ---");
                    System.out.print("Kode Mata Kuliah: ");
                    String kodeCari = input.nextLine();

                    MataKuliah mkCari = krs.cariMatakuliahByKode(kodeCari);

                    if (mkCari != null) {
                        System.out.print("Input Nilai (0-100): ");
                        double nilaiInput;
                        try {
                            nilaiInput = input.nextDouble();
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Input nilai tidak valid.");
                            input.nextLine();
                            break;
                        }
                        input.nextLine();

                        mkCari.setNilai(nilaiInput);
                        System.out.println("Nilai berhasil diinputkan!");
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan!");
                    }
                    break;
                case 4:
                    krs.tampilkanKRS();
                    break;

                case 5:
                    krs.tampilkanNilai();
                    break;


                case 6:
                    System.out.println("Terima kasih!");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}
