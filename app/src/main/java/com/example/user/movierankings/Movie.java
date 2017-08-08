package com.example.user.movierankings;

/**
 * Created by user on 07/08/2017.
 */

public class Movie {

    String title;
    String genre;
    int ranking;

    public Movie(String title, String genre, int ranking) {
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String title(){
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String genre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int ranking() {
        return this.ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String toString(){
        return "Title: " + this.title + ", " + "Genre: " + this.genre + ", " + "Ranking: " + this.ranking;
    }


}
