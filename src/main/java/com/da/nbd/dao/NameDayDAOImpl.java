package com.da.nbd.dao;

import com.da.nbd.ConnectionData;
import com.da.nbd.model.NameDay;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component("jdbcNameDay")
public class NameDayDAOImpl implements NameDayDAO {

    DataSource dataSource;

    public NameDayDAOImpl() {
        this.dataSource = new ConnectionData().getDataSource();
    }


    @Override
    public List<NameDay> getActualNameDay() {
        String dateString;
        String day;
        String month;
        LocalDate actualDate = LocalDate.now();
        if (actualDate.getMonthValue() < 10) {
            month = "0" + actualDate.getMonthValue();
        } else {
            month = String.valueOf(actualDate.getMonthValue());
        }
        if (actualDate.getDayOfMonth() < 10) {
            day = "0" + actualDate.getDayOfMonth();
        } else {
            day = String.valueOf(actualDate.getDayOfMonth());
        }
        dateString = month + "." + day;
        List<NameDay> nameDayList = new ArrayList<>();
        try (Connection conn = this.dataSource.getConnection()) {
            PreparedStatement prep = conn.prepareStatement("SELECT * FROM namedays WHERE date = ?");
            prep.setString(1, dateString);
            ResultSet res = prep.executeQuery();

            while (res.next()) {
                nameDayList.add(new NameDay(
                        res.getInt(1),
                        res.getString(2),
                        res.getString(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nameDayList;
    }

    @Override
    public List<NameDay> getNameDayByDate(String date) {
        return null;
    }
}
