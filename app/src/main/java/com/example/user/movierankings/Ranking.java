package com.example.user.movierankings;

import java.util.ArrayList;

/**
 * Created by user on 07/08/2017.
 */

public class Ranking {

    private ArrayList<Movie> rankings;

    public Ranking(ArrayList<Movie> rl) {
        this.rankings = rl;
    }

    public void addMovie(Movie movie){
        rankings.add((movie.ranking() - 1), movie);
    }

    public String getMovieByRank(int rank) {
        for (Movie movie : rankings) {
            if (movie.ranking() == rank) {
                return movie.title();
            }
        }
        return "movie not found";
    }

    public void replaceLastRankedMovie(Movie movie){
        int last_index_position = this.rankings.size() - 1;
        this.rankings.remove(last_index_position);
        this.rankings.add(last_index_position, movie);
        movie.setRanking(last_index_position + 1);
    }

    public String findMovieByTitle(Movie movie){
        for(Movie the_movie : rankings){
            if (movie.title() == the_movie.title()){
                return the_movie.toString();
            }
        }
        return "movie not found";
    }

}
