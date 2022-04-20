package com.ntd.repository;

import com.ntd.entity.Book;
import com.ntd.repository.custom.BookRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>, BookRepositoryCustom {

    @Query(value = "select * from book", nativeQuery = true)
    List<Book> getAll();
}
