package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book [] books = new Book[4];
        books[0] = new Book("Clean code", 800);
        books[1] = new Book("Clean code 2.0", 900);
        books[2] = new Book("New code 1.0", 500);
        books[3] = new Book("New code 2.0", 500);
        outputBooks(books);
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        outputBooks(books);
        outputBooks(books, "Clean code");
    }

    private static void outputBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getPages() + " pages");
        }
    }

    private static void outputBooks(Book[] books, String name) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName() == name) {
                System.out.println(books[i].getName() + " " + books[i].getPages() + " pages");
            }
        }
    }
}
