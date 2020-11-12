package ru.mtuci.simapi.service;

import ru.mtuci.simapi.model.Book;
import java.util.List;


public interface BookService {
    Book get(Long id);

    List<Book>getAll();

    Book save (Book book);

    void delete(Long id);
}