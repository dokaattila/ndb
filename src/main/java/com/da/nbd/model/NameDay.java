package com.da.nbd.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
public class NameDay {

    @Id
    private int id;
    private String names;
    private String monthDay;


}
