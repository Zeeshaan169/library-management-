public class Main{
    public static void main(String[] args){
        Book b1 = new Book("A","A1",1000,true);
        b1.showDetails();
       

        Book b2 = new Book("B","B1",2000,false);
        b2.showDetails();

        Book b3 = new Book("C","C1",3000,true);
        b3.showDetails();

        b1.applydiscount(10);
        b1.showDetails();
    }
}