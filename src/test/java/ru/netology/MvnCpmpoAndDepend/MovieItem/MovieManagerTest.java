package ru.netology.MvnCpmpoAndDepend.MovieItem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    MovieManager manager = new MovieManager();
    MovieItem movie1 = new MovieItem(1, "Форсаж");
    MovieItem movie2 = new MovieItem(2, "Пираты Карибского Моря");
    MovieItem movie3 = new MovieItem(3, "Форсаж 2");
    MovieItem movie4 = new MovieItem(4, "Тройной Форсаж");
    MovieItem movie5 = new MovieItem(5, "Матрица");
    MovieItem movie6 = new MovieItem(6, "Облачный Атлас");
    MovieItem movie7 = new MovieItem(7, "Мстители");
    MovieItem movie8 = new MovieItem(8, "Кит");
    MovieItem movie9 = new MovieItem(9, "Зелёная Миля");
    MovieItem movie10 = new MovieItem(10, "Star Wars");
    MovieItem movie11 = new MovieItem(11, "Джентельмены");
    MovieItem movie12 = new MovieItem(12, "Богемская рапсодия");
    MovieItem movie13 = new MovieItem(13, "Аватар");
    MovieItem movie14 = new MovieItem(14, "Оно");

    @BeforeEach
    public void setup() {
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);
        manager.addMovie(movie13);
        manager.addMovie(movie14);
    }

    @Test
    public void shouldAddMovie() {

        MovieItem[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11, movie12, movie13, movie14};
        MovieItem[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAllMovie() {

        manager.findAll();

        MovieItem[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11, movie12, movie13, movie14};
        MovieItem[] actual = manager.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMovie() {

        MovieItem[] expected = {movie14, movie13, movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5};
        MovieItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMovieNewLimit() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);
        manager.addMovie(movie13);
        manager.addMovie(movie14);

        MovieItem[] expected = {movie14, movie13, movie12, movie11, movie10};
        MovieItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMovieZeroLimit() {
        MovieManager manager = new MovieManager(0);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);
        manager.addMovie(movie13);
        manager.addMovie(movie14);

        MovieItem[] expected = {};
        MovieItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMovieOverLimit() {
        MovieManager manager = new MovieManager(13);
        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);
        manager.addMovie(movie4);
        manager.addMovie(movie5);
        manager.addMovie(movie6);
        manager.addMovie(movie7);
        manager.addMovie(movie8);
        manager.addMovie(movie9);
        manager.addMovie(movie10);
        manager.addMovie(movie11);
        manager.addMovie(movie12);
        manager.addMovie(movie13);
        manager.addMovie(movie14);

        MovieItem[] expected = {movie14, movie13, movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        MovieItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
