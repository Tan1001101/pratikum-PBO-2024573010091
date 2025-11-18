package modul_7.pratikum_2;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(){
        System.out.println("mengambar persegi panjang dengan warna: " + color + ", lebar: " + width + ", tinggi: " + height);
    }

    public double calculateArea(){
        double area = width * height;
        System.out.println("luas persegi panjang: " + area);
        return area;
    }

    public void displayInfo(){
        System.out.println("persegi panjang - warna: " + color + ", lebar: " + width + ", tinggi: " + height);
    }
}
