package Library;

public interface Administrator {
    public abstract void findBook(Reader reader, Book book);
    public abstract void giveBook(Reader reader, Book book);
    public abstract void overdueNotification(Reader reader, Book book);
}
