package com.example.user.movierankings;

/**
 * Created by user on 07/08/2017.
 */

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MovieTest {

    Movie movie1;

    @Before
    public void before(){
        movie1 = new Movie("Nixon", "biographical", 2);
    }

    @Test
    public void hasTitle(){
        assertEquals("Nixon", movie1.title());
    }

    @Test
    public void testSetTitle(){
        movie1.setTitle("The Shining");
        assertEquals("The Shining", movie1.title());
    }

    @Test
    public void hasGenre(){
        assertEquals("biographical", movie1.genre());
    }

    @Test
    public void testSetGenre(){
        movie1.setGenre("horror");
        assertEquals("horror", movie1.genre());
    }

    @Test
    public void hasRanking(){
        assertEquals(2, movie1.ranking());
    }

    @Test
    public void testSetRanking(){
        movie1.setRanking(3);
        assertEquals(3, movie1.ranking());
    }

    @Test
    public void testToString(){
        assertEquals("Title: Nixon, Genre: biographical, Ranking: 2", movie1.toString());
    }
}
