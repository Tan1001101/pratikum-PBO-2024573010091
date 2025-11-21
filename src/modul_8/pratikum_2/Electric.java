package modul_8.pratikum_2;

public interface Electric {
    void charge();
    int getBatteryLevel();
    void setBatteryLevel(int level);

    default void displayBatteryInfo(){
        System.out.println("battery level: " + getBatteryLevel() + "%");
    }
}
