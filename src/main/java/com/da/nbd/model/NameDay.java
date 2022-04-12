package com.da.nbd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@AllArgsConstructor
@Data
@Jacksonized
public class NameDay {

    private int id;
    private String names;
    private String monthDay;


}
