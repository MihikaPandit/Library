package org.example.service;

import org.example.model.Book;
import org.example.model.CD;
import org.example.model.DVD;
import org.example.model.Periodicals;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryService{

    private List<Book> books = new ArrayList<>();
    private List<CD> cds = new ArrayList<>();
    private List<DVD> dvds = new ArrayList<>();
    private List<Periodicals> periodicals = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public void borrowBook(Book book) {
        System.out.println("A book has been borrowed");
    }

    @Override
    public void addCD(CD cd) {
        cds.add(cd);
    }

    @Override
    public void removeCD(CD cd) {
        cds.remove(cd);
    }

    @Override
    public void borrowCD(CD cd) {
        System.out.println("A cd has been borrowed");
    }

    @Override
    public void addDVD(DVD dvd) {
        dvds.add(dvd);
    }

    @Override
    public void removeDVD(DVD dvd) {
        dvds.remove(dvd);

    }

    @Override
    public void borrowDVD(DVD dvd) {
        System.out.println("A dvd has been borrowed");
    }

    @Override
    public void addPeriodicals(Periodicals periodical) {
        periodicals.add(periodical);
    }

    @Override
    public void removePeriodicals(Periodicals periodical) {
        periodicals.remove(periodical);

    }
}
