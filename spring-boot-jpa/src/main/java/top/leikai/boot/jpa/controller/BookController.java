package top.leikai.boot.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import top.leikai.boot.jpa.entity.Book;
import top.leikai.boot.jpa.service.BookService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author admin
 * @date 2021/3/18
 * @description BookController
 */
@Controller
@RequestMapping(value = "/")
public class BookController {
    @Resource
    private BookService bookService;

    @GetMapping()
    public String bookPage(Model model){
        model.addAttribute("message", "Hello SpringBoot");
        List<Book> bookList = bookService.getAll();
        model.addAttribute("bookList", bookList);
        return "book";
    }
}