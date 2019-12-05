package com.aaa.service;

import com.aaa.model.BookInfo;

import java.util.List;

/**
 * @ClassName : BookController
 * @Author : 彡樂
 * @Description :
 * @Date :2019/11/21 15:13
 **/
public interface BookService {
    /**
     * 查询全部图书
     * @return
     */
    List<BookInfo> getAllBook();



}
