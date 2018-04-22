package com.lance.spring.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by Dangdang on 2017/12/28.
 */
@RestController
@RequestMapping
public class BookController {

    @RequestMapping("/books")
    public String book() {
        System.out.println("category ");
        return "book";
    }


    @RequestMapping("/books0")
    public String book0(@RequestParam(value = "category") String cat) {
        System.out.println("category " + cat);
        return "book";
    }

    @RequestMapping("/books1")
    public String book1(@RequestParam(value = "category", defaultValue = "history") String cat, Model model) {
        model.addAttribute("category", cat);
        System.out.println("category " + cat);
        return "book.jsp";
    }

    @RequestMapping("/books2")
    public String book2(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                        @RequestParam("from") LocalDate from, Model model) {
        //@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        System.out.println("from " + from);
        model.addAttribute("from", from);
        return "book.jsp";
    }

    @RequestMapping("/books3")
    public String book3(@RequestParam(value = "authors") List<String> author, Model model) {
        model.addAttribute("category", author);
        System.out.println("author " + author);
        return "book.jsp";
    }

    @RequestMapping("/books4")
    public String book4(@RequestParam(value = "authors") String[] author, Model model) {
        model.addAttribute("category", author);
        System.out.println("author " + Arrays.asList(author));
        return "book.jsp";
    }

    @RequestMapping("/books5")
    public String book5(@RequestParam Map<String, String> book, Model model) {
        model.addAttribute("book", book);
        System.out.println("book " + book);
        return "book.jsp";
    }

    @RequestMapping("/books6")
    public String book6(@RequestParam MultiValueMap<String, List<String>> book, Model model) {
        model.addAttribute("book", book);
        System.out.println("book " + book);
        return "book.jsp";
    }

    @RequestMapping("/books7")
    public String book7(String cat, Model model) {
        model.addAttribute("category", cat);
        System.out.println("category " + cat);
        return "book.jsp";
    }

    @RequestMapping("/books8")
    public String book8(@RequestParam Box box, Model model) {
        model.addAttribute("box", box);
        System.out.println("box " + box);
        return "book.jsp";
    }



}

class Box{
    String category;
    String author;

    public Box() {
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "category=" + category+", author=" + author;
    }
}
