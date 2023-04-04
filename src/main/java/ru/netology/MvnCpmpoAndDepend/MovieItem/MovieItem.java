package ru.netology.MvnCpmpoAndDepend.MovieItem;

public class MovieItem {
    private int movieId;
    private String movieName;

    public MovieItem(int movieId, String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }
}
