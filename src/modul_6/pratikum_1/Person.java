package modul_6.pratikum_1;

public class Person {
    protected String nama;
    protected int umur;

    public Person(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public void displayInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }

    public void greet(){
        System.out.println("halo, aku adalah Person.");
    }
}
