package com.da.nbd.controller;

import com.da.nbd.model.NameDay;
import com.da.nbd.service.NameDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/nameday")
public class NameDayController {

        @Autowired
        NameDayService nameDayService;



        @GetMapping
        public List<NameDay> getNameDays() {
            return this.nameDayService.getActualNameDay();
        }
}
