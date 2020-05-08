package com.lin.missyou.model;

import com.fasterxml.jackson.core.type.TypeReference;
import com.lin.missyou.util.GenericAndJson;
import com.lin.missyou.util.SuperGenericAndJson;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

@Entity
@Getter
@Setter
public class Sku extends BaseEntity {
    @Id
    private Long id;
    private BigDecimal price;
    private BigDecimal discountPrice;
    private Boolean online;
    private String img;
    private String title;
    private Long spuId;
    private Long categoryId;
    private Long rootCategoryId;

//    @Convert(converter = MapAndJson.class)
//    private Map<String, Object> test;

    //    @Convert(converter = ListAndJson.class)
//    private List<Object> specs;
    @Convert(converter = SuperGenericAndJson.class)
    private List<Spec> specs;


    //    private String specs;
    private String code;
    private Long stock;
//    private String specs;
//    public List<Spec> getSpecs() {
//        if (this.specs == null) {
//            return Collections.emptyList();
//        }
//
////        return GenericAndJson.jsonToList(this.specs, List<Spec>.class);
//        return GenericAndJson.jsonToList(this.specs, new TypeReference<List<Spec>>() {
//        });
////        return GenericAndJson.jsonToList(this.specs);
//    }
//
//    //
//    public void setSpecs(List<Spec> specs) {
//        if (specs.isEmpty()) {
//            return;
//        }
//        this.specs = GenericAndJson.ObjectToJson(specs);
//    }


}
