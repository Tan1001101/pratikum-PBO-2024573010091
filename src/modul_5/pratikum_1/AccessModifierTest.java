package modul_5.pratikum_1;


public class AccessModifierTest {
    public static void main(String[] args){
        Person person = new Person("Budiono Siregar",25);

        person.email = "Budiono342@gmail.com";
        System.out.println("Email: " + person.email);

        person.alamat = "jl. kenangan";
        System.out.println("Alamat: " + person.alamat);

        person.telepon = "0862939262322";
        System.out.println("Telepon: " + person.telepon);

        person.tampilkanInfpo();

        person.panggilMetodePribadi();

        System.out.println("\n DEMONSTRASI ACCESS MODIFIER");
        System.out.println("Y Public    : Bisa Diakses");
        System.out.println("Y Default    : Bisa Diakses (dalam package yang sama)");
        System.out.println("Y Protected    : Bisa Diakses (dalam package yang sama)");
        System.out.println("X Private     : TIDAK bisa diakases langsung");
    }
}
