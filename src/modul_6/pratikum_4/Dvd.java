package modul_6.pratikum_4;

public class Dvd extends LibraryItem{
    private String director;
    private int duration;
    private String genre;

    public Dvd(String itemId,String title, int year, String director,int duration,String genre){
        super(itemId,title,year);
        this.director = director;
        this.duration = duration;
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("---------- DVD ----------");
        System.out.println("ID: " + getItemId());
        System.out.println("Judul: " + getTitle());
        System.out.println("Sutradara: " + director);
        System.out.println("Tahun: " + getYear());
        System.out.println("Durasi: " + duration + " menit");
        System.out.println("Genre: " + genre);
        System.out.println("Status: " + (isAvailable() ? "Tersedia" : "Dipinjam")); // Menggunakan getter
        System.out.println("-------------------------");
    }

    public void playTrailer() {
        System.out.println("Memutar trailer DVD: " + getTitle());
    }
}
