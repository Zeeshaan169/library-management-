public class Ebook extends Book {
    double fileSizeMB;

    Ebook(String title, String author, double price, boolean available, double fileSizeMB) {
        super(title, author, price, available);
        this.fileSizeMB = fileSizeMB;
    }

    void showFileSize() {
        System.out.println("File size: " + fileSizeMB + "MB");
    }

    @Override
    void showDetails() {
        System.out.println(
                "Title:" + title + ", Author:" + author + ", Price:" + price + ", FileSize:" + fileSizeMB + "MB");
    }
}
