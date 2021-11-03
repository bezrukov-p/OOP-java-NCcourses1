package com.NCcourses.hw1_1;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;


    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors.clone();
        this.price = price;
    }
    public Book(String name, Author[] authors, double price, int qty){
        this(name, authors, price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString(){
        String bookstr = "Book[name=" + name + ",authors=";
        String authorsstr = "";
        if (authors.length == 0)
            authorsstr = "{}";
        else {
            authorsstr  = authorsstr + "{";
            for (int i = 0; i < authors.length - 1; i++) {
                authorsstr = authorsstr + "Author[name=" + authors[i].getName() +
                        ",email=" + authors[i].getEmail() +
                        ",gender=" + authors[i].getGender() + "],";
            }
            authorsstr = authorsstr + "Author[name=" + authors[authors.length - 1].getName() +
                    ",email=" + authors[authors.length - 1].getEmail() + ",gender=" +
                    authors[authors.length - 1].getGender() + "]";
            authorsstr = authorsstr + "}";
        }
        bookstr = bookstr + authorsstr;
        bookstr = bookstr + ",price=" + price + ",qty=" + qty + "]";
        return bookstr;
    }

    public String getAuthorNames(){
        if (authors.length == 0)
            return "";
        String authornames = "";
        for(int i = 0; i < authors.length - 1; i++)
            authornames = authornames + authors[i].getName() + ",";
        authornames = authornames + authors[authors.length - 1].getName();
        return authornames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Double.compare(book.getPrice(), getPrice()) == 0
                && getQty() == book.getQty()
                && Objects.equals(getName(), book.getName())
                && Arrays.equals(getAuthors(), book.getAuthors());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getPrice(), getQty());
        result = 31 * result + Arrays.hashCode(getAuthors());
        return result;
    }
}
