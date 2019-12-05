package com.aaa.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName : BookInfo
 * @Author : 彡樂
 * @Description :
 * @Date :2019/11/21 15:11
 **/
@Data
public class BookInfo implements Serializable {

    private Long bookId;

    private  String bookName;

    private  Integer bookStore;

    private BigDecimal bookPrice;

}
