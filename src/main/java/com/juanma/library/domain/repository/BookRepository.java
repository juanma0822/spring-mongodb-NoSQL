package com.juanma.library.domain.repository;

import com.juanma.library.domain.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
