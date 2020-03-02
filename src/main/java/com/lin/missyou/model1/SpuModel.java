package com.lin.missyou.model1;

import javax.persistence.*;
import java.util.List;

// 去孤子的问题
@Entity
@Table(name = "spu")
public class SpuModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String subtitle;

    @ManyToMany(mappedBy = "spuList") // 被维护端
//    @JoinTable(name = "spu_theme", joinColumns = @JoinColumn(name = "spu_id"),
//    inverseJoinColumns = @JoinColumn(name = "theme_id"))
    private List<ThemeModel> themeModelList;
}
