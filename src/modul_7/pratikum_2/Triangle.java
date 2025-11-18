package modul_7.pratikum_2;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(String color, double base, double height){
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw(){
        System.out.println("menggambar segitiga dengan warna: " + color + ", alas: " + base + ", tinggi: " + height);
    }

    public double calculateArea(){
        double area = 0.5 * base * height;
        System.out.println("luas segitiga: "+ area);
        return area;
    }

    public void displayInfo(){
        System.out.println("segitiga - warna: " + color + ", alas: " + base + ", tinggi: " +height);
    }
}
