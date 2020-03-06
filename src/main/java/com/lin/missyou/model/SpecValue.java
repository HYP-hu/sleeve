package com.lin.missyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
public class SpecValue {
    @Id
    private Long id;
    private String value;
    private Long specId;
    private String extend;
}
