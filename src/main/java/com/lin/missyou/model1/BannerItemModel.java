package com.lin.missyou.model1;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "BannerItem")
public class BannerItemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
    private String img;
    private String keyword;
    private Short type;
    private String name;
    private Long bannerId;
    @ManyToOne
    @JoinColumn(insertable = false, updatable = false, name = "bannerId")
    private BannerModel bannerModel; // 导航属性
}
