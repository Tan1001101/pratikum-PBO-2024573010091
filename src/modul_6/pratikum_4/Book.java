package modul_6.pratikum_4;

import com.sun.jdi.connect.Connector;

public class Book extends LibraryItem{
    private String author;
    private String isbn;
    private int numberOfPage;

    public Book(String itemId, String title, int year, String author, String isbn,int numberOfPage){
        super(itemId,title,year);
        this.author = author;
        this.isbn = isbn;
        this.numberOfPage = numberOfPage;
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku");
        System.out.println("------------------------------------");
        System.out.println("ID: " + getItemId());
        System.out.println("Judul: " + getTitle());
        System.out.println("Penulis: " + author);
        System.out.println("Tahun: " + getYear());
        System.out.println("ISBN: " + isbn);
        System.out.println("Jumlah Halaman: " + numberOfPage);
        System.out.println("Status: " + (isAvailable() ? "Tersedia" : "Dipinjam")); // Menggunakan getter
        System.out.println("------------------------------------");
    }

    public void readSample(){
        System.out.println("membaca sample dari buku: " + title);
    }

}
