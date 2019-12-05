package com.aaa.mapper;

import com.aaa.model.BookInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName : BookMapper
 * @Author : 彡樂
 * @Description :
 * @Date :2019/11/21 15:14
 **/
@Repository
@Mapper
public interface BookMapper {

    /**
     * 查询所有图书
     * @return
     */
    @Select("select * from book_info")
    List<BookInfo> getAllBook();

    /**
     * 删除图书
     * @param bookId
     */
    @Delete("delete from book_info where book_id=#{bookId}")
    void delBook(long bookId);

    /**
     * 添加
     * @param book
     */
    @Insert("insert into book_info (book_name,book_store,book_price) value(#{bookName},#{bookStore},#{bookPrice})")
    void addBook(BookInfo book);

    /**
     * 修改
     * @param book
     */
    @Update("update book_info set book_name=#{bookName},book_store=#{bookStore},book_price=#{bookPrice} where book_id=#{bookId}")
    void editBook(BookInfo book);

}
