package com.aaa.service;

import com.aaa.model.BookInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName : BookServiceHystrixImpl
 * @Author : 彡樂
 * @Description :
 * @Date :2019/12/3 14:09
 **/
@Service
public class BookServiceHystrixImpl implements BookService {

    @Override
    public List<BookInfo> getAllBook() {
        System.out.println("服务降级中");
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookName("aaa");
        List<BookInfo> list = new ArrayList<>();
        list.add(bookInfo);
        return list;
    }
}
