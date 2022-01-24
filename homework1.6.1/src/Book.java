
class Book {
    String author;
    String name;
    int year;
    int pages;

    public Book(String author, String name, int year, int pages){
        this.author = author;
        this.name = name;
        this.year = year;
        this.pages = pages;
    }

    @Override
    public String toString(){
        return "author " + author + ", name: " + name + ", year: " + year + ",  pages: " + pages;
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
