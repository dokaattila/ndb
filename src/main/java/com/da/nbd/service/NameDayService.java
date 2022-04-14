package com.da.nbd.service;

import com.da.nbd.dao.NameDayDAOImpl;
import com.da.nbd.model.NameDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameDayService {

    @Autowired
//    @Qualifier("jdbcNameDay")
    NameDayDAOImpl dataAccess;

    public List<NameDay> getActualNameDay() {
        return this.dataAccess.getActualNameDay();
    }

}
