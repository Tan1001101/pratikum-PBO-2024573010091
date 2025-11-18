package modul_6.pratikum_3;

public class Cat extends Mammal{
    private boolean apakahRumahan;

    public Cat(String nama, String warnaBulu, boolean apakahRumahan){
        super(nama,warnaBulu);
        this.apakahRumahan = apakahRumahan;
    }

    public void ngeong(){
        System.out.println(nama + " sedang mengeong: meow meow");
    }

    public void getRumahan(){
        if(apakahRumahan==true){
            System.out.println(nama + " adalah kucing rumahan");
        } else
            System.out.println(nama + " bukan kucing rumahan");
    }

    @Override
    public void makan(){
        System.out.println(nama + " sedang makan makanan kucing");
    }

}
