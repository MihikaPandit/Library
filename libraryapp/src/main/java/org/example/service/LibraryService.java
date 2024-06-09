package org.example.service;
import org.example.model.Book;
import org.example.model.CD;
import org.example.model.DVD;
import org.example.model.Periodicals;

public interface LibraryService {

    void addBook(Book book);
    void removeBook(Book book);
    void borrowBook(Book book);

    void addCD(CD cd);
    void removeCD(CD cd);
    void borrowCD(CD cd);

    void addDVD(DVD dvd);
    void removeDVD(DVD dvd);
    void borrowDVD(DVD dvd);

    void addPeriodicals(Periodicals periodicals);
    void removePeriodicals(Periodicals periodicals);
}
