package com.juanma.library.application;

import com.juanma.library.controllers.request.Bookrequest;
import com.juanma.library.controllers.responses.BookResponse;
import com.juanma.library.domain.entity.Book;
import com.juanma.library.domain.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public String createBook(Bookrequest book) {
        Book bookToSave = new Book();
        bookToSave.setTitle(book.getTitle());
        bookToSave.setGenero(book.getGenero());
        bookToSave.setSinopsis(book.getSinopsis());
        bookToSave.setAuthor(book.getAuthor());
        bookToSave.setEditorial(book.getEditorial());
        bookToSave.setAnio_publicacion(book.getAnio_publicacion());
        bookRepository.save(bookToSave);
        return "ok";
    }

    public List<BookResponse> getBooks() {
        return bookRepository.findAll().stream().map(book -> BookResponse.builder()
                .id(book.getId())
                .title(book.getTitle())
                .sinopsis(book.getSinopsis())
                .genero(book.getGenero())
                .author(book.getAuthor())
                .editorial(book.getEditorial())
                .anio_publicacion(book.getAnio_publicacion())
                .build()
        ).toList();
    }

    public BookResponse getBookById(String id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));

        return BookResponse.builder()
                .id(book.getId())
                .title(book.getTitle())
                .sinopsis(book.getSinopsis())
                .genero(book.getGenero())
                .author(book.getAuthor())
                .editorial(book.getEditorial())
                .anio_publicacion(book.getAnio_publicacion())
                .build();
    }

    public void deleteBookById(String id) {
        if (!bookRepository.existsById(id)) {
            throw new RuntimeException("Book not found with id: " + id);
        }
        bookRepository.deleteById(id);
    }

    public BookResponse updateBook(String id, Bookrequest bookRequest) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));

        // Actualizamos solo si vienen valores nuevos
        book.setTitle(bookRequest.getTitle() != null ? bookRequest.getTitle() : book.getTitle());
        book.setGenero(bookRequest.getGenero() != null ? bookRequest.getGenero() : book.getGenero());
        book.setSinopsis(bookRequest.getSinopsis() != null ? bookRequest.getSinopsis() : book.getSinopsis());
        book.setAuthor(bookRequest.getAuthor() != null ? bookRequest.getAuthor() : book.getAuthor());
        book.setEditorial(bookRequest.getEditorial() != null ? bookRequest.getEditorial() : book.getEditorial());
        book.setAnio_publicacion(bookRequest.getAnio_publicacion() != null ? bookRequest.getAnio_publicacion() : book.getAnio_publicacion());

        Book updatedBook = bookRepository.save(book);

        return BookResponse.builder()
                .id(updatedBook.getId())
                .title(updatedBook.getTitle())
                .sinopsis(updatedBook.getSinopsis())
                .genero(updatedBook.getGenero())
                .author(updatedBook.getAuthor())
                .editorial(updatedBook.getEditorial())
                .anio_publicacion(updatedBook.getAnio_publicacion())
                .build();
    }

}
