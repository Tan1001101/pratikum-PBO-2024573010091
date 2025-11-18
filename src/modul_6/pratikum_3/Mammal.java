package modul_6.pratikum_3;

public class Mammal extends Animal{
    protected String warnaBulu;

    public Mammal(String nama, String warnaBulu){
        super(nama);
        this.warnaBulu = warnaBulu;
    }

    public void melahirkan(){
        System.out.println(nama + " sedang melahirkan anak");
    }
}
