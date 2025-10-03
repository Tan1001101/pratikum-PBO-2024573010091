package modul_5.pratikum_2;

public class Mahasiswa {
    private String npm;
    private String name;
    private String jurusan;
    private double ipk;
    private int semester;
    private boolean aktif;

    // Constructor
    public Mahasiswa(String npm, String name, String jurusan) {
        this.npm = npm;
        this.name = name;
        this.jurusan = jurusan;
        this.ipk = 0.0;
        this.semester = 1;
        this.aktif = true;
    }

    // Getters

    public String getNpm() {
        return npm;
    }

    public String getName() {
        return name;
    }

    public String getJurusan() {
        return jurusan;
    }

    public double getIpk() {
        return ipk;
    }

    public int getSemester() {
        return semester;
    }

    // Cek status keaktifan. "is" prefix
    public boolean isAktif() {
        return aktif;
    }

    // Setter Methods (dengan validasi)

    // Untuk npm, biasanya tidak ada setter
    // Karena npm adalah unique key dan jarang diubah

    public void setName(String name) {
        // Validasi: nama tidak boleh kosong, berisi huruf, dan diawali huruf kapital
        if (name == null || name.trim().isEmpty() || !name.matches("^[A-Z][a-zA-Z\\s]*$")) {
            System.out.println("Nama tidak valid! Pastikan tidak kosong, hanya berisi huruf dan spasi, dan diawali huruf kapital.");
            return;
        }

        // Validasi: Nama hanya huruf dan spasi
        if (!name.matches("[a-zA-Z\\s]+")) {
            System.out.println("Nama harus hanya berisi huruf dan spasi!");
            return;
        }

        // Jika Nama valid
        this.name = name;
        System.out.println("Nama berhasil diubah menjadi: " + name);
    }

    public void setJurusan(String jurusan) {
        // Validasi: Jurusan tidak boleh kosong
        if (jurusan == null || jurusan.trim().isEmpty()) {
            System.out.println("Jurusan tidak boleh kosong!");
            return;
        }

        this.jurusan = jurusan;
        System.out.println("Jurusan berhasil diubah menjadi: " + jurusan);
    }

    public void setIpk(double ipk) {
        // Validasi: IPK harus antara 0.0 sampai 4.0
        if (ipk < 0.0 || ipk > 4.0) {
            System.out.println("IPK harus antara 0.0 - 4.0!");
            return;
        }

        this.ipk = ipk;
        System.out.printf("IPK berhasil diubah menjadi: %.2f%n", ipk);

        // Cek status aktif berdasarkan IPK
        this.aktif = (ipk >= 2.0); // Asumsi: minimal IPK 2.0 untuk aktif
    }

    public void setSemester(int semester) {
        // Validasi: Semester harus > 0 dan reasonable (misal: max 14)
        if (semester < 1 || semester > 14) {
            System.out.println("Semester harus antara 1 - 14!");
            return;
        }

        this.semester = semester;
        System.out.println("Semester berhasil diubah menjadi: " + semester);
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
        System.out.println("Status keaktifan diubah.");
        System.out.println("Status Mahasiswa: " + (aktif ? "AKTIF" : "TIDAK AKTIF"));
    }

    // Metode Tambahan (pencetak)

    // Metode untuk memberikan prediksi/deskripsi IPK
    public String getPredikat() {
        if (ipk >= 3.5) {
            return "Cum Laude (Sangat Baik)";
        } else if (ipk >= 3.0) {
            return "Sangat Memuaskan";
        } else if (ipk >= 2.0) {
            return "Memuaskan";
        } else {
            return "Kurang";
        }
    }

    // Metode untuk menampilkan info lengkap mahasiswa
    public void tampilkanInfo() {
        System.out.println("\n----------- INFORMASI MAHASISWA -----------");
        System.out.println("NPM       : " + npm);
        System.out.println("Nama      : " + name);
        System.out.println("Jurusan   : " + jurusan);
        System.out.printf("IPK       : %.2f (%s)%n", ipk, getPredikat());
        System.out.println("Semester  : " + semester);
        System.out.println("Status    : " + (aktif ? "AKTIF" : "TIDAK AKTIF"));
        System.out.println("-------------------------------------------");
    }
}
