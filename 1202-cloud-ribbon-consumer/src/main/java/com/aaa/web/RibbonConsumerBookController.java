package com.aaa.web;

import com.aaa.model.BookInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName : RibbonConsumerBookController
 * @Author : 彡樂
 * @Description :
 * @Date :2019/12/2 10:56
 **/
@RestController
public class RibbonConsumerBookController {
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "error",commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value="5000")})
    @GetMapping("/getAllBook")
    public List<BookInfo> getAllBook() {
        LinkedList forObject = restTemplate.getForObject("http://provider-server/getAllBook", LinkedList.class);

        return forObject;
    }

    public List<BookInfo> error() {
        System.out.println("服务熔断");
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookName("三毛流浪记");
       List<BookInfo> list=new ArrayList<>();
        list.add(bookInfo);
        return list;
    }
}
