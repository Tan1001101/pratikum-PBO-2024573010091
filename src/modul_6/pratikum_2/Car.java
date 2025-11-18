package modul_6.pratikum_2;

public class Car extends Vehicle{
    private int jumlahpintu;

    public Car(String merk,int kecepatan, int jumlahpintu){
    super(merk, kecepatan);
    this.jumlahpintu = jumlahpintu;
    }

    @Override
    public void mulai(){
        super.mulai();
        System.out.println("Brem brem...");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Jumlah pintu: " + jumlahpintu);
    }

    public void klakson(){
        System.out.println("Beep beep");
    }
}
