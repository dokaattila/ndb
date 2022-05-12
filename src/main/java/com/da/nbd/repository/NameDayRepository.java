package com.da.nbd.repository;

import com.da.nbd.model.NameDay;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface NameDayRepository extends CrudRepository<NameDay,Integer> {

   List<NameDay> findByMonthDay(String monthDay);


}
