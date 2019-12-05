package com.aaa.web;

import com.aaa.model.BookInfo;
import com.aaa.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName : BookController
 * @Author : 彡樂
 * @Description :
 * @Date :2019/12/2 10:02
 **/
@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    private int i = 1;

    @RequestMapping("getAllBook")
    public List<BookInfo> getAllBook(ModelMap modelMap) {
        System.out.println("查询所有书籍");
        List<BookInfo> allBook = bookService.getAllBook();
        if (allBook == null) {
            return null;
        }
        for (BookInfo bookInfo : allBook) {
            System.out.println(bookInfo);
        }
        if (++i % 2 == 0) {
        throw new IllegalArgumentException("服务器出错了");
        }

        return allBook;
    }

}
