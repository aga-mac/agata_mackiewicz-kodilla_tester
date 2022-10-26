package com.kodilla.collectiond.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book b1 = BookManager.createBook("Winnie the Pooh", "Alan Alexander Milne");
        Book b2 = BookManager.createBook("The Little Prince", "Antoine de Saint Exupery");
        Book b3 = BookManager.createBook("Harry Potter", "J.K.Rowling");
        Book b4 = BookManager.createBook("Winnie the Pooh", "Alan Alexander Milne");
        System.out.println(b1.hashCode() == b2.hashCode());
        System.out.println(b1.hashCode() == b1.hashCode());
        System.out.println(b1.hashCode() == b4.hashCode());
    }
}
