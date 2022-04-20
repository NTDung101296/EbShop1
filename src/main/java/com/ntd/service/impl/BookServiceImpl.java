package com.ntd.service.impl;

import com.ntd.common.exception.NotFoundException;
import com.ntd.entity.Book;
import com.ntd.repository.BookRepository;
import com.ntd.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }
}
