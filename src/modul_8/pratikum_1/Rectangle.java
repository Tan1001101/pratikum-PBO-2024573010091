package modul_8.pratikum_1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    // Implementasi abstract methods
    @Override
    public double calculatedArea() {
        return width * height;
    }

    @Override
    public double calculatedperimeter() {
        return 2 * (width + height);
    }

    // Override concrete method
    @Override
    public void displayInfo() {
        System.out.println("RECTANGLE");
        super.displayInfo();
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + calculatedArea());
        System.out.println("Perimeter: " + calculatedperimeter());
        System.out.println("-----------------------");
    }

    // Method khusus Rectangle
    public boolean isSquare() {
        return width == height;
    }
}
