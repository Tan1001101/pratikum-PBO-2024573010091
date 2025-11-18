package modul_6.pratikum_3;

public class InheritanceTypeTest {
    public static void main(String[] args){
        Dog dog = new Dog("Snowy", "putih","husky");
        dog.getras();
        dog.makan();
        dog.gonggong();
        dog.tidur();
        dog.melahirkan();

        System.out.println();

        Cat cat = new Cat("King Oren", "oren", true);
        cat.getRumahan();
        cat.makan();
        cat.ngeong();
        cat.tidur();
        cat.melahirkan();

        System.out.println();

        Animal[] animals = {new Dog("Max", "hitam", "Labrador"),
                            new Cat("Luna", "Abu", false)};

        for (Animal animal : animals){
            animal.makan();
        }

    }
}
