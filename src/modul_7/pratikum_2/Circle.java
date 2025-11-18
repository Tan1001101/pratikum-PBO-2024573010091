package modul_7.pratikum_2;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("menggambar lingkaran dengan warna: " + color + ",radius: " + radius);
    }
    public double calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("luas lingkaran: " + area);
        return area;
    }

    public void displayInfo(){
        System.out.println("lingkaran - warna: " + color + ", radius: " + radius);
    }
}
