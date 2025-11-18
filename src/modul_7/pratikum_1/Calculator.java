package modul_7.pratikum_1;

public class Calculator {

    public int add(int a, int b){
        System.out.println("memanggil add(int a, int b)");
        return a+b;
    }

    public int add(int a, int b, int c){
        System.out.println("memanggil add(int a, int b, int c)");
        return a + b + c;
    }

    public double add(double a, double b){
        System.out.println("memanggil add(double a, double b)");
        return a + b;
    }

    public int add(int[] numbers){
        System.out.println("memanggil add(int[] numbers)");
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }

    public String add(String a, String b){
        System.out.println("memanggil add(String a, String b)");
        return a + b;
    }
}
