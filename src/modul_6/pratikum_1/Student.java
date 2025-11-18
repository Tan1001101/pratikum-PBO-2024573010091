package modul_6.pratikum_1;

public class Student extends Person{
    private String idSiswa;

    public Student(String nama, int umur, String idSiswa){
        super(nama,umur);
        this.idSiswa = idSiswa;
    }

    public void belajar(){
        System.out.println(nama + " sedang belajar");
    }

    @Override
    public void greet(){
        System.out.println("halo, saya seorang siswa bernama " + nama);
    }
}
