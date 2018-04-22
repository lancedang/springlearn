package com.lance.spring.controller;

import com.lance.spring.service.BookService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Created by Dangdang on 2018/1/7.
 */
@RunWith(SpringRunner.class)
//@WebMvcTest(BookController2.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BookController2Test {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private BookController2 bookController2;

   //@MockBean
    @Autowired
    private BookService bookService;

    @Test
    public void testExistsController() {
        Assert.assertNotNull(bookController2);
    }

}
