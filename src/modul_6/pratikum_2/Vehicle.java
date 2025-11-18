package modul_6.pratikum_2;

public class Vehicle {
    protected String merk;
    protected int kecepatan;

    public Vehicle(String merk,int kecepatan){
        this.merk = merk;
        this.kecepatan = kecepatan;
    }

    public void mulai(){
        System.out.println("kendaraan sedang mulai....");
    }

    public void displayInfo(){
        System.out.println("Merk: " + merk);
        System.out.println("kecepatan: " + kecepatan + " km/h");
    }
}
