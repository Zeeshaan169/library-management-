public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("A", "A1", 1000, true);
        b1.showDetails();

        Book b2 = new Book("B", "B1", 2000, false);
        b2.showDetails();

        Book b3 = new Book("C", "C1", 3000, true);
        b3.showDetails();

        Book b4 = new Book("Unknown Draft", "Unknown Author");
        b4.showDetails();

        b1.applydiscount(10);
        b1.showDetails();
        Ebook e1 = new Ebook("Digital Java", "Someone", 500, true, 12.5);
        e1.showDetails();
        e1.showFileSize();
        e1.applydiscount(10);
        e1.showDetails();
    }
}