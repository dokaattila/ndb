package com.da.nbd.dao;

import com.da.nbd.model.NameDay;

import java.util.List;

public interface NameDayDAO {

    List<NameDay> getActualNameDay();
    List<NameDay> getNameDayByDate(String date);

}
