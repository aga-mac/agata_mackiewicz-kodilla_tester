package com.kodilla.collectiond.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book book = new Book(title, author);
        exists(book);
        return book;
    }

    public static void exists(Book book) {
        if (books.contains(book)) {
            System.out.println("This book is already here.");
        } else {
            books.add(book);
            System.out.println("This book is new.");
        }
    }
}