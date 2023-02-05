package hw_objects;

import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;

    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Название: " + name + "\n" +
                "Автор: " + author + "\n" +
                "Год издания: " + year + "\n";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return author.equals(book.author) && getName().equals(book.getName()) && getYear() == book.getYear();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, author);
    }
}
