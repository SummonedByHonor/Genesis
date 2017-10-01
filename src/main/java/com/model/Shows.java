package com.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "shows")
public class Shows {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seans_id;

    @Column(name = "movie_id")
    private int movie_id;

    @Column(name = "show_date")
    private LocalDate show_date;

    @Column(name = "show_time")
    private LocalTime show_time;

    public int getSeans_id() {
        return seans_id;
    }

    public void setSeans_id(int seans_id) {
        this.seans_id = seans_id;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public LocalDate getShow_date() {
        return show_date;
    }

    public void setShow_date(LocalDate show_date) {
        this.show_date = show_date;
    }

    public LocalTime getShow_time() {
        return show_time;
    }

    public void setShow_time(LocalTime show_time) {
        this.show_time = show_time;
    }

    @Override
    public String toString() {
        return "Shows{" +
                "seans_id=" + seans_id +
                ", movie_id=" + movie_id +
                ", show_date=" + show_date +
                ", show_time=" + show_time +
                '}';
    }
}
