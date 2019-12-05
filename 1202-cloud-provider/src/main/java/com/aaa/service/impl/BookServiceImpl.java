package com.aaa.service.impl;

import com.aaa.mapper.BookMapper;
import com.aaa.model.BookInfo;
import com.aaa.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : BookServiceImpl
 * @Author : 彡樂
 * @Description :
 * @Date :2019/11/21 15:13
 **/
@Service
public class BookServiceImpl implements BookService {
    private static Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<BookInfo> getAllBook() {

        List<BookInfo> allBook = bookMapper.getAllBook();
        if (allBook == null) {
            logger.info("getAllBook is null for BookServiceImpl");
            return null;
        } else {
            logger.info("getAllBook is true for BookService");
            return allBook;
        }
    }

}
