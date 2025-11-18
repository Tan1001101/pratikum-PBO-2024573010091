package modul_6.pratikum_1;

public class InheritanceTest {
    public static void main(String[] args){
        Student student = new Student("Agus", 17,"S1234");

        student.displayInfo();

        student.belajar();

        student.greet();

        Person person = new Student("Budi", 18,"S1233");
        person.greet();
    }
}
