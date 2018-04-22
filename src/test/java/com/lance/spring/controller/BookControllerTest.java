package com.lance.spring.controller;

import com.lance.spring.service.BookService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


/**
 * Created by Dangdang on 2017/12/28.
 */
@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@SpringBootTest
//@AutoConfigureMockMvc
@WebMvcTest()
public class BookControllerTest {

    //@LocalServerPort
    private int port;

    //@Autowired
    private TestRestTemplate testRestTemplate;

    //@Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private BookController bookController;

    @Autowired
    private BookController2 bookController2;

    //@Autowired
    private BookService bookService;

    @Autowired
    private MockMvc mockMvc;

    //@Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    //@Test
    public void book() throws Exception {
        ResultActions resultActions = this.mockMvc.perform(get("/books0?category=22"));
        resultActions.andExpect(MockMvcResultMatchers.status().is(200))
                .andExpect(model().attributeExists("category"));

    }

    @Test
    public void testControllerExists() {
        Assert.assertNotNull(bookController);
        //Assert.assertNotNull(bookService);
    }

    @Test
    public void testBook() {
        Assert.assertEquals(this.testRestTemplate.getForObject("http://localhost:" + port + "/books", String.class), "any method");
    }

    @Test
    public void testBook2() throws Exception {
        this.mockMvc.perform(get("/books"))
                .andExpect(status().is(200))
                .andExpect(content().string("book"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

}
