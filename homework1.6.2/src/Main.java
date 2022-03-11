import reader.Book;
import reader.Author;

class Main {
    public static void main(String[] args) {
        Author authorWhite= new Author("E. B. White");
        Author authorMichelleMagorian= new Author("Michelle Magorian");

        Book book1 = new Book(authorWhite, "Charlotte's Web", 2006, 192);
        Book book2 = new Book(authorMichelleMagorian, "Goodnight Mister Tom", 2014, 384);
        Book book3 = new Book(authorWhite, "Charlotte's Web", 2006, 192);
        Book book4 = book2;

        System.out.println("book1 equals book2: " + book1.equals(book2));
        System.out.println("book1 equals book3: " + book1.equals(book3));
        System.out.println("book2 equals book4: " + book2.equals(book4));
        System.out.println("book3 equals book4: " + book3.equals(book4));

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

        book1.print();
        book2.print();
        book3.print();
        book4.print();
    }
}
