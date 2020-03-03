package com.lin.missyou.util;

import com.lin.missyou.bo.PageCounter;

import java.util.Map;

public class CommonUtil {
    public static PageCounter covertToPageParameter(Integer start, Integer count){
        int pageNum = start / count;
        PageCounter pageCounter = PageCounter.builder()
                .page(pageNum)
                .count(count)
                .build();
        return pageCounter;

    }
}
