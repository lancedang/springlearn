package com.lance.spring.controller;

import com.lance.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dangdang on 2018/1/7.
 */
@RestController
@RequestMapping
public class BookController2 {
    @Autowired
    private BookService bookService;

    @RequestMapping("/addBook")
    public String addBook() {
        return bookService.addBook();
    }

}
