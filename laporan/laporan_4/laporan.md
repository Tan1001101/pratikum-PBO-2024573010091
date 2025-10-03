# Laporan Modul 4: Praktikum Pengenalan Object Oriented Programming
**Mata Kuliah:** Praktikum Pengenalan Object Oriented Programming   
**Nama:** Fathan Al Ghifari  
**NIM:** 2024573010091  
**Kelas:** TI 2A

---

## 1. Abstrak
Modul ini dirancang untuk memberikan pemahaman dasar tentang pemrograman berorientasi objek menggunakan Java melalui praktikum langsung. Setiap praktikum dilengkapi dengan teori dasar dan langkah-langkah implementasi yang detail.
## 2. Teori Dasar
### Objek-Oriented Programming (OOP)  
adalah paradigma pemrograman yang menggunakan “objek” - struktur data yang berisi data, dalam bentuk field, sering kali dikenal sebagai atribut; dan kode, dalam bentuk prosedur, sering kali dikenal sebagai metode.

Inti dari OOP adalah mendesain software dengan membagi masalah menjadi serangkaian objek yang saling berinteraksi. Ini bertentangan dengan pemrograman prosedural, yang fokus pada fungsi/prosedur dalam memproses data. OOP memungkinkan kita untuk membuat kode yang lebih modular, reusable, dan mudah di-maintain.

### class dan objek  
kelas adalah konsep abstrak yang mendefinisikan set atribut dan metode yang akan dimiliki oleh object. Kelas menyediakan struktur atau template yang menentukan bagaimana sebuah object harus dibuat. Kelas akan menentukan jenis atribut dan metode apa yang akan dimiliki oleh object, tetapi tidak menentukan nilai dari atribut itu sendiri untuk object tertentu.

## 3. Praktikum
1. buat class baru dengan nama Mahasiswa
2. masukan kode berikut:
```declarative
package modul_4;

public class Mahasiswa {
    private String nama;
    private  String nim;
    private String jurusan;

    public Mahasiswa(String nama, String npm, String jurusan, Double ipk){
        this.nama = nama;
        this.nim = npm;
        this.jurusan = jurusan;
    }

    public String getNama(){
        return nama;
    }

    public String getNim(){
        return nim;
    }

    public String getJurusan(){
        return jurusan;
    }
}

```
3. buat class `MataKuliah` dan isikan kode berikut:
```declarative
package modul_4;

public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;
    private Double nilai;

    public MataKuliah(String kode, String nama, int sks){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.nilai = 0.0;
    }

    public String getKode(){
        return kode;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    public double getnilai(){
        return  nilai;
    }

    public void setNilai(double nilai){
        if(nilai >= 0.0 && nilai <= 100.0){
            this.nilai = nilai;
        } else{
            System.out.println("nilai harus diantara 0-100");
        }
    }

    public String getNilaiHuruf(){
        if(nilai>=85) return "A";
        else if (nilai>=80) return "A-";
        else if (nilai>=75) return "B+";
        else if (nilai>=70) return "B";
        else if (nilai>=65) return "B-";
        else if (nilai>=60) return "C+";
        else if (nilai>=55) return "C";
        else if (nilai>=50) return "D-";
        else return "E";
    }

    public double getBobotNilai(){
        String huruf = getNilaiHuruf();
        switch (huruf){
            case "A": return 4.0;
            case "A-": return 3.7;
            case "B+": return 3.3;
            case "B": return 3.0;
            case "B-": return 2.7;
            case "C+": return 2.3;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }

    public void tampilkanInfo(){
        System.out.printf("%-10s %-30s %d SKS | Nilai %.2f (%s)\n",kode, nama, sks, nilai, getNilaiHuruf());
    }
}

```
4. buat class `RencanaKartuStudi` dan isikan kode berikut:
```declarative
package modul_4;

public class KartuRencanaStudi {
    private Mahasiswa mahasiswa;
    private MataKuliah[] daftarMatakuliah;
    private int jumlahMatkul;
    private int maxMatkul;
    private final int max_sks = 24;

    public KartuRencanaStudi(Mahasiswa mahasiswa, int maxMatkul) {
        this.mahasiswa = mahasiswa;
        this.maxMatkul = maxMatkul;
        this.daftarMatakuliah = new MataKuliah[maxMatkul];
        this.jumlahMatkul = 0;
    }

    public boolean tambahMatakuliah(MataKuliah matkul) {
       if (jumlahMatkul >= maxMatkul){
           System.out.println("\n KRS sudah penuh! maksimal " + maxMatkul + "mata kuliah");
           return false;
       }

       if(hitungTotalSKS() + matkul.getSks() > max_sks){
           System.out.println("\n Gagal menambah! sks melebihi batas " + max_sks + "sks");
           return false;
       }

       daftarMatakuliah[jumlahMatkul] = matkul;
       jumlahMatkul++;
        System.out.println("\n mata kuliah " + matkul.getNama() + "berhasil ditambahkan");
        return true;
    }

    public boolean hapusMatakuliah(String kode){
        int ditemukan = -1;

        for(int i = 0; i < jumlahMatkul;i++){
            if(daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)){
                ditemukan = i;
                break;
            }
        }

        if(ditemukan == -1){
            System.out.println("\n note! mata kuliah dengan kode " + kode + "tidak ditemukan");
            return false;
        }

        System.out.println("\n mata kuliah "+ daftarMatakuliah[ditemukan].getNama() + "berhasil dihapus");

        for(int i = ditemukan;i<jumlahMatkul;i++){
            daftarMatakuliah[i] = daftarMatakuliah[i+1];
        }

        daftarMatakuliah[jumlahMatkul-1] = null;
        jumlahMatkul--;
        return true;
    }

    public void tampilkanNilai(){
        if(jumlahMatkul == 0){
            System.out.println("\n belum ada data kuliah yang diinput");
            return;
        }

        MataKuliah terbaik = daftarMatakuliah[0];
        MataKuliah terburuk = daftarMatakuliah[0];

        for(int i = 1;i<jumlahMatkul;i++){
            if(daftarMatakuliah[i].getnilai() > terbaik.getnilai());
            terbaik = daftarMatakuliah[i];
            if(daftarMatakuliah[i].getnilai() < terburuk.getnilai());
            terburuk = daftarMatakuliah[i];
        }

        System.out.println("\n === nilai terbaik & terburuk ===");
        System.out.print("nilai terbaik: ");
        terbaik.tampilkanInfo();
        System.out.print("nilai terburuk: ");
        terburuk.tampilkanInfo();
        System.out.println("------------------------------------");
    }

    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            totalSKS += daftarMatakuliah[i].getSks();
        }
return totalSKS;
    }

    public double hitungIPK() {
        if (jumlahMatkul == 0) return 0.0;

        double totalBobot = 0.0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMatkul; i++) {
            MataKuliah mk = daftarMatakuliah[i];
            totalBobot += mk.getBobotNilai() * mk.getSks();
            totalSKS += mk.getSks();
        }
        return totalSKS > 0 ? totalBobot / totalSKS : 0.0;
    }

    public void tampilkanKRS() {
        System.out.println("==================================================================");
        System.out.println("              KARTU RENCANA STUDI (KRS)                           ");
        System.out.println("==================================================================");
        System.out.println("Nama Mahasiswa : " + mahasiswa.getNama());
        System.out.println("NPM            : " + mahasiswa.getNim());
        System.out.println("Maks. Matkul   : " + maxMatkul + " mata kuliah.");
        System.out.println("------------------------------------------------------------------");
        System.out.println("| KODE | NAMA MATA KULIAH               | SKS  | NILAI |");
        System.out.println("------------------------------------------------------------------");

        if (jumlahMatkul == 0) {
            System.out.println("| Belum ada mata kuliah yang diambil.                            |");
            System.out.println("------------------------------------------------------------------");
        } else {
            for (int i = 0; i < jumlahMatkul; i++) {
                daftarMatakuliah[i].tampilkanInfo();
            }
            System.out.println("------------------------------------------------------------------");
        }
        System.out.printf("Total SKS Semester: %d\n", hitungTotalSKS());
        System.out.printf("IPK Semester: %.2f\n", hitungIPK());
        System.out.println("==================================================================\n");
    }

    public MataKuliah cariMatakuliahByKode(String kode) {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                return daftarMatakuliah[i];
            }
        }
        return null;
    }
}

```
5. buat class `Main` untuk menguji:
```declarative
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

```
---

## 4. Kesimpulan
pada pratikum kali ini kita membuat sebuah sistem untuk membuat KRS bagi mahasiswa dengan membuat beberapa class dan sebuah class main untuk menjalankan program class yang sudah dibuat

---

## 5. Referensi
- https://www.w3schools.com/java
- https://www.petanikode.com/tutorial/java/

---
