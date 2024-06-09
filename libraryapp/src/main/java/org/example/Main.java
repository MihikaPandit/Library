package org.example;
import org.example.model.Book;
import org.example.model.CD;
import org.example.model.DVD;
import org.example.model.Periodicals;
import org.example.service.Library;
import org.example.service.LibraryService;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LibraryService library = new Library();

        Book book = new Book("Harry Potter Book");
        System.out.println("Book Details: "+book.getTitle());

        CD cd = new CD("Harry Potter CD");
        System.out.println("CD Details: "+cd.getTitle());

        DVD dvd = new DVD("Harry Potter DVD");
        System.out.println("DVD Details: "+dvd.getTitle());

        Periodicals periodical = new Periodicals("Harry Potter Periodical");
        System.out.println("Periodical Details: "+periodical.getTitle());

        library.addBook(book);
        library.addCD(cd);
        library.addPeriodicals(periodical);
        library.addDVD(dvd);



    }
}