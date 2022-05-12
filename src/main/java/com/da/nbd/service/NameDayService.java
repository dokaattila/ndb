package com.da.nbd.service;

import com.da.nbd.Util;
import com.da.nbd.model.NameDay;
import com.da.nbd.repository.NameDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameDayService {

    @Autowired
    NameDayRepository nameDayRepository;

    public List<NameDay> getActualNameDay() {
        return this.nameDayRepository.findByMonthDay(Util.convertDate());
    }

}
