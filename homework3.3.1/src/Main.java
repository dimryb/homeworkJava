import Library.*;

public class Main {

    public static void main(String[] args) {
	    Book book1 = new Book("Книга 1", "Пушкин");
        Book book2 = new Book("Книга 2", "Есенин");
        Book book3 = new Book("Книга 3", "Достоевский");

        ChiefLibrarian chiefLibrarian = new ChiefLibrarian("Александра"); // Главный библиотекарь с функцией администратора и любитель почитать книжки
        RealReader realReaderFedja = new RealReader("Федя"); // Просто читатель
        RealSupplier realSupplier = new RealSupplier("Антон Михайлович");  // Просто поставщик и иногда читатель

        // Главный библиотекарь в роли библиотекоря заказывает книги
        chiefLibrarian.orderBook(realSupplier, book1);
        chiefLibrarian.orderBook(realSupplier, book2);
        chiefLibrarian.orderBook(realSupplier, book3);

        // Поставщик доставил заказанные книги
        realSupplier.bringBook(chiefLibrarian, book1);
        realSupplier.bringBook(chiefLibrarian, book2);
        realSupplier.bringBook(chiefLibrarian, book3);

        // Поставщик в роли читателя взял по знакомству книгу почитать
        realSupplier.takeBook(chiefLibrarian, book1);
        realSupplier.returnBook(chiefLibrarian, book1);

        // Главный библиотекарь сам у себя в библиотеке взял почитать книгу
        chiefLibrarian.takeBook(chiefLibrarian, book1);
        chiefLibrarian.returnBook(chiefLibrarian, book1);

        // Пришел читатель взял книгу
        realReaderFedja.takeBook(chiefLibrarian, book2);

        chiefLibrarian.overdueNotification(realReaderFedja, book2);

        realReaderFedja.returnBook(chiefLibrarian, book2);
    }
}
