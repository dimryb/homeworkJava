package Library;

public interface Reader {
    public abstract void takeBook(Administrator admin, Book book);
    public abstract void returnBook(Administrator admin, Book book);
}
