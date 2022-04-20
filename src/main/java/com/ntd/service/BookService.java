package com.ntd.service;

import com.ntd.common.exception.NotFoundException;
import com.ntd.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();
}
