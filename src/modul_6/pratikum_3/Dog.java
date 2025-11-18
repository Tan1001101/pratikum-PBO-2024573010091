package modul_6.pratikum_3;

public class Dog extends Mammal{
    private String ras;

    public Dog(String nama, String warnaBulu, String ras){
        super(nama, warnaBulu);
        this.ras = ras;
    }

    public void gonggong(){
        System.out.println(nama + " sedang mengonggong: Guk guk");
    }

    public void getras(){
        System.out.println(nama + " adalah anjing ras " + ras);
    }

    @Override
    public void makan(){
        System.out.println(nama + " sedang makan makanan anjing");
    }
}
