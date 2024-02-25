
package model;

/**
 *
 * @author LENOVO
 */
public class Book implements Comparable<Book> {
    
    private int isbn;
    private String title;
    private String author;

    public Book() {
    }

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        System.out.printf("%-20d| %-20s| %-20s\n", this.isbn, this.title, this.author);
        return "";
    }
    
    

    @Override
    public int compareTo(Book o) {
        return this.isbn - o.isbn;
    }
    
}
