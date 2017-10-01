package com.view;

import com.model.Movie;
import com.model.Presenter.MoviePresenter;
import com.util.MovieTableModel;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import java.util.Date;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainView extends JFrame {

   private MoviePresenter moviePresenter = new MoviePresenter(this);

    public MainView() {
        init();
    }

    private void init() {
        setTitle("CinemaApp");
        setSize(1000, 500);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        BorderLayout mainLayout = new BorderLayout();
        getContentPane().setLayout(mainLayout);

        GridLayout gridLayout = new GridLayout(8, 1);
        gridLayout.setVgap(5);
        JPanel fieldsToFillPanel = new JPanel();
        fieldsToFillPanel.setPreferredSize(new Dimension(200, 20));
        fieldsToFillPanel.setLayout(gridLayout);

        getContentPane().add(fieldsToFillPanel, BorderLayout.WEST);

        JLabel fieldTitle = new JLabel("Tytuł");
        JTextField titleTextField = new JTextField();
        JLabel fieldDirector = new JLabel("Reżyser");
        JTextField textDirectorField = new JTextField();

        UtilDateModel model = new UtilDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);

        JLabel fieldYear = new JLabel("Data produkcji");
        JLabel fieldDuration = new JLabel("Czas trwania");
        JTextField textDurationField = new JTextField();


        fieldsToFillPanel.add(fieldTitle);
        fieldsToFillPanel.add(titleTextField);
        fieldsToFillPanel.add(fieldDirector);
        fieldsToFillPanel.add(textDirectorField);
        fieldsToFillPanel.add(fieldYear);
        fieldsToFillPanel.add(datePicker);
        fieldsToFillPanel.add(fieldDuration);
        fieldsToFillPanel.add(textDurationField);

        JPanel northPanel = new JPanel();
        JLabel appTitle = new JLabel();
        northPanel.add(appTitle);
        JLabel appTitleCenter = new JLabel("DODAWANIE LISTY DO BAZY!");
        northPanel.add(appTitleCenter);
        JLabel anotherappTitleEmptyLabel = new JLabel();
        northPanel.add(anotherappTitleEmptyLabel);
        getContentPane().add(northPanel, BorderLayout.NORTH);

        JLabel rightPanelWithButton = new JLabel();
        GridLayout gridLayout1 = new GridLayout(3, 1);
        rightPanelWithButton.setPreferredSize(new Dimension(200, 200));
        rightPanelWithButton.setLayout(gridLayout1);
        JLabel emptyLabel = new JLabel();
        JButton exitButton = new JButton("Wyjście");
        exitButton.setMaximumSize(new Dimension(50, 50));
        rightPanelWithButton.add(emptyLabel);
        JButton buttonFotAddMovie = new JButton("Dodaj film do bazy");
        rightPanelWithButton.add(buttonFotAddMovie);
        rightPanelWithButton.add(exitButton);
        getContentPane().add(rightPanelWithButton, BorderLayout.EAST);



        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new GridLayout(3,1));
        getContentPane().add(panelCenter, BorderLayout.CENTER);
        JTable moviesTables = new JTable();
        JLabel epmtyLabel = new JLabel();
        JLabel emptyLabel2 = new JLabel();
        panelCenter.add(emptyLabel);
        panelCenter.add(moviesTables);
        panelCenter.add(emptyLabel2);

        buttonFotAddMovie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Movie movie = new Movie();
                movie.setTitle(titleTextField.getText());
                movie.setDirector(textDirectorField.getText());
                movie.setDuration(Integer.valueOf(textDurationField.getText()));
                Date selectedDate = (Date) datePicker.getModel().getValue();
                movie.setYear(selectedDate);

                moviePresenter.addMovieToDatabase(movie);

            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
        public void showMovies(List<Movie> movieList){
            System.out.println("WywowałanoAddMovie +  " + movieList);


    }

    public void getMoviesFromDataBase(){
            moviePresenter.showMovieList();
    }
    }

