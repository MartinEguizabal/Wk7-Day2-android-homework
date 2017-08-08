package com.example.user.movierankings;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/08/2017.
 */

public class RankingTest {

    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;
    Ranking rankings;
    ArrayList<Movie> ranking_list;

    @Before
    public void before(){
        movie1 = new Movie("Nixon", "biographical", 2);
        movie2 = new Movie("The Shining", "horror", 1);
        movie3 = new Movie("Taken", "action", 3);
        movie4 = new Movie("Santa2", "family", 4);

        ranking_list = new ArrayList<Movie>();
        ranking_list.add(movie1);
        ranking_list.add(movie2);
        ranking_list.add(movie3);

        rankings = new Ranking(ranking_list);
    }

//    in the above we add movies to the ranking_list object which is an ArrayList object. Then to make a rankings object we declare 'rankings'
//    & then add the Arralist object ranking_list.

    @Test
    public void canGetMovieByRank(){
        assertEquals("Nixon", rankings.getMovieByRank(2));
    }

    @Test
    public void canAddMovie(){
        rankings.addMovie(movie4);
        assertEquals("Santa2", rankings.getMovieByRank(4));
    }

    @Test
    public void canReplaceLastRankedMovie(){
        rankings.replaceLastRankedMovie(movie4);
        assertEquals("Santa2", rankings.getMovieByRank(3));
    }

    @Test
    public void canFindMovieByTitle(){
        rankings.findMovieByTitle("Taken");
        assertEquals("Title: Taken, Genre: action, Ranking: 3", movie3.toString());
    }
}
