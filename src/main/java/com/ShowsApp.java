package com;

import com.model.Movie;
import com.model.Shows;
import com.model.dao.ShowsDAO;

import java.time.LocalDate;
import java.time.LocalTime;

public class ShowsApp {
    public static void main(String[] args) {
        ShowsDAO showsDAO = new ShowsDAO();
        Shows matrixShowSchedule = new Shows();
        matrixShowSchedule.setMovie_id(1);
        matrixShowSchedule.setShow_date(LocalDate.parse("2007-12-03"));
        matrixShowSchedule.setShow_time(LocalTime.parse("20:00"));

        showsDAO.addShow(matrixShowSchedule);
    }

}
