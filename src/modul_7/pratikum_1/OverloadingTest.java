package modul_7.pratikum_1;

public class OverloadingTest {
    public static void main(String[] args){
        Calculator calc = new Calculator();

        System.out.println("hasil: " + calc.add(5,7));
        System.out.println();

        System.out.println("hasil: " + calc.add(2,3,4));
        System.out.println();

        System.out.println("hasil: " + calc.add(4.0,3.5));
        System.out.println();

        int[] numbers = {1,2,3,4,5};
        System.out.println("hasil: " + calc.add(numbers));
        System.out.println();

        System.out.println("hasil: " + calc.add("hell0", "world"));
        System.out.println();

        System.out.println("Automatic Type Promotion");
        System.out.println("hasil: " + calc.add(5,2.4));
    }
}
