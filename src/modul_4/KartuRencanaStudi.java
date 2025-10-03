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
