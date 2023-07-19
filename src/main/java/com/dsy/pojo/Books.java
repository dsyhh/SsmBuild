package com.dsy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author dsy
 * @Date 2023/7/19 18:16
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books
{
    public Integer bookID;
    public String bookName;
    public Integer bookCounts;
    public String detail;
}
