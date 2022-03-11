package Library;

public class ChiefLibrarian extends User implements Librarian, Administrator, Reader {
    public ChiefLibrarian(String name) {
        super(name);
    }

    @Override
    public void findBook(Reader reader, Book book) {
        System.out.println("Главный библиотекарь " + getName()
                + " нашел читателю " + ((User)reader).getName() + " книгу: " + book);
    }

    @Override
    public void giveBook(Reader reader, Book book) {
        System.out.println("Главный библиотекарь " + getName()
                + " выдадал читателю " + ((User)reader).getName() + " книгу: " + book);
    }

    @Override
    public void overdueNotification(Reader reader, Book book) {
        System.out.println("Главный библиотекарь " + getName()
                + " напомнил читателю " + ((User)reader).getName() + " вернуть книгу: " + book);
    }

    @Override
    public void orderBook(Supplier supplier, Book book) {
        System.out.println("Главный библиотекарь " + getName()
                + " заказал у поставщика " + ((User)supplier).getName() + " книгу: " + book);
    }

    @Override
    public void takeBook(Administrator admin, Book book) {
        admin.findBook(this, book);
        admin.giveBook(this, book);
        System.out.println("Главный библиотекарь " + getName()
                + " взял у администратора " + ((User)admin).getName() + " (так положено) почитать книгу: " + book);
    }

    @Override
    public void returnBook(Administrator admin, Book book) {
        System.out.println("Главный библиотекарь " + getName()
                + " вернул администратору " + ((User)admin).getName() + " (так положено) прочитанную книгу: " + book);
    }
}
