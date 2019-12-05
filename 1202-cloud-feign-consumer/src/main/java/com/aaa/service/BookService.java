package com.aaa.service;

import com.aaa.model.BookInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
* @Description:    java类作用描述
* @Author:         SAN
* @CreateDate:     2019/12/2 11:31
* @UpdateUser:     SAN
*/
@FeignClient(value = "provider-server",fallback = BookServiceHystrixImpl.class)
public interface BookService {
    /**
     * 查询所有书籍
     * @return
     */
    @GetMapping("/getAllBook")
   List<BookInfo> getAllBook();
}
