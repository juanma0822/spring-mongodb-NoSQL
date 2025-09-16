package com.juanma.library.controllers;

import com.juanma.library.application.BookService;
import com.juanma.library.controllers.request.Bookrequest;
import com.juanma.library.controllers.responses.BookResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    //TODO Inject the service
    @Autowired
    BookService bookService;

    @PostMapping("/create")
    public Bookrequest createBook(@RequestBody Bookrequest bookrequest) {
        bookService.createBook(bookrequest);
        return bookrequest;
    }

    @GetMapping("/books")
    public List<BookResponse> getAllBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/books/{id}")
    public BookResponse getBookById(@PathVariable String id) {
        return bookService.getBookById(id);
    }

    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable("id") String id) {
        bookService.deleteBookById(id);
        return "Book with id " + id + " has been deleted successfully.";
    }

    @PutMapping("/books/{id}")
    public BookResponse updateBook(@PathVariable String id, @RequestBody Bookrequest bookRequest) {
        return bookService.updateBook(id, bookRequest);
    }
}
