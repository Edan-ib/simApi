package ru.mtuci.simapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.mtuci.simapi.model.Book;
import ru.mtuci.simapi.service.BookService;

import java.util.*;

@Slf4j
@RestController
@RequestMapping(value = BookRestController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class BookRestController {
    public static final String REST_URL = "/api/v1/books";

    private final BookService bookService;

    @Autowired
    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = "/{id}")
    public Book get(@PathVariable("id") Long id) {
        log.info("get"+id);
        return bookService.get(id);

    }

    @GetMapping
    public List<Book> getAll() {
        log.info("getAll");
        return bookService.getAll();

    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Book save (@RequestBody Book book) {
        log.info("save" + book);
        return bookService.save(book);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        log.info("delete" + id);
        bookService.delete(id);
    }
}

