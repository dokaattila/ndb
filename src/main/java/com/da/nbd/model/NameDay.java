package com.da.nbd.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity(name = "nameday")
@Table(name = "namedays")

public class NameDay {

    @Id
    private Integer id;
    private String names;
    @Column(name = "date")
    private String monthDay;


}
