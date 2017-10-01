package com.util;

import com.model.Movie;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class MovieTableModel extends AbstractTableModel {

    private List<Movie> movies;

    public MovieTableModel(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public int getRowCount() {
        return movies.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
}
