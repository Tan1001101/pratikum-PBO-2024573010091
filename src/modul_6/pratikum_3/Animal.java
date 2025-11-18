package modul_6.pratikum_3;

public class Animal {
    protected String nama;

    public Animal(String nama){
        this.nama = nama;
    }

    public void makan(){
        System.out.println(nama + " sedang makan");
    }

    public void tidur(){
        System.out.println(nama + " sedang tidur");
    }

}
