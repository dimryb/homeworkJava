package Library;

public class RealSupplier extends User implements Supplier, Reader{
    public RealSupplier(String name) {
        super(name);
    }

    @Override
    public void bringBook(Librarian librarian, Book book) {
        System.out.println("Поставщик " + getName()
                + " доставил библиотекарю " + ((User)librarian).getName() + " книгу: " + book);
    }

    @Override
    public void takeBook(Administrator admin, Book book) {
        admin.findBook(this, book);
        admin.giveBook(this, book);
        System.out.println("Поставщик " + getName()
                + " взял у администратора " + ((User)admin).getName() + " почитать книгу: " + book);
    }

    @Override
    public void returnBook(Administrator admin, Book book) {
        System.out.println("Поставщик " + getName()
                + " вернул администратору " + ((User)admin).getName() + " прочитанную книгу: " + book);
    }
}
