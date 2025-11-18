package modul_6.pratikum_2;

public class OverrideTest {
    public static void main(String[] args){
        Car car = new Car("Toyota",85,4);

        car.mulai();
        car.displayInfo();
        car.klakson();

        Vehicle vehicle = new Car("Honda", 75,2);

        vehicle.mulai();
        vehicle.displayInfo();
    }
}
