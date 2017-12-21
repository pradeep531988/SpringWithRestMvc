package com.dsp.spring.restmvc.service;

import java.util.List;

import com.dsp.spring.restmvc.model.Book;

public interface IBookService {
    
    long save(Book book);
    
    Book get(long id);
    
    List<Book> list();
    
    void update(long id, Book book);
    
    void delete(long id);
}
