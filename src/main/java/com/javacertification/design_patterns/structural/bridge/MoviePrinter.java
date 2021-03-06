package com.javacertification.design_patterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Favio on 12/11/2017.
 */
public class MoviePrinter extends Printer {

    private Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected String getHeader() {
        return movie.getClassification();
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();
        details.add(new Detail("Title", movie.getTitle()));
        details.add(new Detail("Year", movie.getYear()));
        details.add(new Detail("Runtime", movie.getRuntime()));
        return details;
    }
}
