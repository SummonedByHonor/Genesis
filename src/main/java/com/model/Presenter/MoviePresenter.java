package com.model.Presenter;

import com.model.Movie;
import com.model.dao.MovieDAO;
import com.view.MainIniCiewClass;
import com.view.MainView;

import java.util.List;

public class MoviePresenter {

    MovieDAO movieDAO = new MovieDAO();
    MainView mainView;

    public MoviePresenter(MainView mainView) {
        this.mainView = mainView;
    }

    public void addMovieToDatabase(Movie movie){
        movieDAO.addMovie(movie);
    }

    public void showMovieList(){
        List<Movie> allMovies = movieDAO.getMovieList();
        mainView.showMovies(allMovies);
    }
}
