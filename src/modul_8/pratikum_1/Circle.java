package modul_8.pratikum_1;

public class Circle extends Shape{
    private double radius;

    public Circle(String color,boolean filled, double radius){
        super(color,filled);
        this.radius = radius;
    }

    @Override
    public double calculatedArea(){
        return Math.PI * radius * radius;
    }

    public double calculatedperimeter(){
        return 2 * Math.PI * radius;
    }

    public void displayInfo(){
        System.out.println("circle");
        super.displayInfo();
        System.out.println("radius: " + radius);
        System.out.println("area: " + calculatedArea());
        System.out.println("perimeter: " + calculatedperimeter());
        System.out.println("==========================");
    }

    public double getDiameter(){
        return 2 * radius;
    }
}
