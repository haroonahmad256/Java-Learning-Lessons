public class Aggregation {
    public static void main(String[] args){
        //Aggregation: Represents a "has-a" relationship between objects.
        //             One object contain other object as a part of its structure,
        //             but the contained object/s can exist independently
        Book book1= new Book("The return of the king", 453);
        Book book2= new Book("How Pakistan came into being", 934);
        Book book3= new Book("Pak vs Ind", 435);

        Book[] books= {book1, book2, book3};

        Library library= new Library("Quaid-e-Azam Library", 2008, books);
        library.show();

    }
}
