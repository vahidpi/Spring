package com.graphql.springbootgraphqlexample.repository;

import com.graphql.springbootgraphqlexample.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {

}
