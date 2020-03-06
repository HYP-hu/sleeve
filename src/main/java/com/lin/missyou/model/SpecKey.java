package com.lin.missyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
public class SpecKey {
    @Id
    private Long id;
    private String name;
    private String unit;
    private Boolean standard;
    private String description;
}
