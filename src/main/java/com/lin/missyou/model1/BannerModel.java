package com.lin.missyou.model1;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "Banner")
public class BannerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    @Column(length = 16)
    private String name;
    @Transient
    private String description;
    private String img;
    private String title;
    // 懒加载和急加载
    @OneToMany(mappedBy = "bannerModel", fetch = FetchType.EAGER)
//    @org.hibernate.annotations.ForeignKey(name="null")
//    @JoinColumn(name = "bannerId")
    private List<BannerItemModel> items;

}


