package modul_4;

public class mahasiswa {
    private String nama;
    private  String nim;
    private String jurusan;

    public mahasiswa(String nama, String npm, String jurusan, Double ipk){
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
