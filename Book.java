public class Book{
    String title;
    String author;
    double price;
    boolean available;
     
    Book(String title, String author, double price, boolean available){
        this.title=title;
        this.author=author;
        this.price=price;
        this.available=available;

    }
     Book(String title, String author){
        this.title=title;
        this.author=author;
        this.price=0;
        this.available=true;

    }


    void showDetails() {
    System.out.println("Title:" + title+"AUthor :"+author+"Price:"+price +"Stock availibility:"+available  );
}
 void applydiscount(double percent){
    double  discountamt = price*(percent/100);
    price = price-discountamt ;
    System.out.println("New price after discount:"+price);
 }

}