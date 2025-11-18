package modul_6.pratikum_4;

public class Magazine extends LibraryItem{
    private String publisher;
    private int issueNumber;
    private String category;

    public Magazine(String itemId,String title,int year,String publisher,int issueNumber,String category){
        super(itemId,title,year);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
        this.category = category;
    }

    @Override
    public void displayInfo() {
        System.out.println("---------- MAJALAH ----------");
        System.out.println("ID: " + getItemId());
        System.out.println("Judul: " + getTitle());
        System.out.println("Penerbit: " + publisher);
        System.out.println("Tahun: " + getYear());
        System.out.println("Edisi: " + issueNumber);
        System.out.println("Kategori: " + category);
        System.out.println("Status: " + (isAvailable() ? "Tersedia" : "Dipinjam")); // Menggunakan getter
        System.out.println("-----------------------------");
    }

    public void browserArticle(){
        System.out.println("menelusuri artikel dalam majalah: " + title);
    }
}
