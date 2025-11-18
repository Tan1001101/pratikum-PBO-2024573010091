package modul_7.pratikum_2;

public class Shape {
    protected String color;

    public Shape(String color){
        this.color = color;
    }

    public void draw(){
        System.out.println("menggambar shape dengan warna " + color);
    }

    public double calculateArea(){
        System.out.println("menghitung luas umum");
        return 0.0;
    }

    public void displayInfo(){
        System.out.println("shape - warna: " + color);
    }
}
