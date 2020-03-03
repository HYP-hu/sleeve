package com.lin.missyou.vo;

import com.lin.missyou.bo.PageCounter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
public class Paging<T> {
    private Long total;
    private Integer count;
    private Integer page;
    private Integer totalPage;
    private List<T> items;

    public Paging(Page<T> pageT){
        this.initPageParameters(pageT);
    }

    void initPageParameters(Page<T> pageT){
        this.total = pageT.getTotalElements();   // 总数
        this.count = pageT.getSize();            // 数量
        this.page = pageT.getNumber();           // 页码
        this.totalPage = pageT.getTotalPages();  // 总页码
        this.items = pageT.getContent();         // 内容
    }
}
