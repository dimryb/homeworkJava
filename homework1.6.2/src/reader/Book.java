package reader;

public class Book {
    Author author;
    String name;
    int year;
    int pages;

    public Book(Author author, String name, int year, int pages){
        this.author = author;
        this.name = name;
        this.year = year;
        this.pages = pages;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("author: ");
        stringBuilder.append(author);
        stringBuilder.append(", name: ");
        stringBuilder.append(name);
        stringBuilder.append(", year: ");
        stringBuilder.append(year);
        stringBuilder.append(",  pages: ");
        stringBuilder.append(pages);
        return stringBuilder.toString();
    }

    public boolean equals(Book book){
        if (this == book){
            return true;
        }
        if (author.equals(book.author) &&
                name.equals(book.name) &&
                year == book.year &&
                pages == book.pages){
            return true;
        }
        return false;
    }

    public void print(){
        System.out.println("Printing of the " + name + " Book, " + author);
    }

}
