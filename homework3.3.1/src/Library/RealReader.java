package Library;

public class RealReader extends User implements Reader{
    public RealReader(String name) {
        super(name);
    }

    @Override
    public void takeBook(Administrator admin, Book book) {
        admin.findBook(this, book);
        admin.giveBook(this, book);
        System.out.println("Читатель " + getName()
                + " взял у администратора " + ((User)admin).getName() + " почитать книгу: " + book);
    }

    @Override
    public void returnBook(Administrator admin, Book book) {
        System.out.println("Читатель " + getName()
                + " вернул администратору " + ((User)admin).getName() + " прочитанную книгу: " + book);
    }
}
