package ru.mtuci.simapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.mtuci.simapi.dao.BookRepository;
import ru.mtuci.simapi.model.Book;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    private final BookRepository bookRepository;

    @Autowired
    public CommandLineAppStartupRunner(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String...args) throws Exception {
        //System.out.println(bookRepository.findById(1L).get( ));
    }
}
