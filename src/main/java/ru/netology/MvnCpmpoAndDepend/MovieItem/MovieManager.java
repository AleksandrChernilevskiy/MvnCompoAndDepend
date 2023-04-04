package ru.netology.MvnCpmpoAndDepend.MovieItem;

public class MovieManager {

    public int resultLength = 10;

    public MovieManager(int newLimit) {
        this.resultLength = newLimit;
    }

    public MovieManager() {
    }

    private MovieItem[] items = new MovieItem[0];

    public void addMovie(MovieItem item) {
        MovieItem[] tmp = new MovieItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public MovieItem[] findAll() {
        return getItems();
    }

    public MovieItem[] findLast() {
        int newLimit;
        if (resultLength <= 0) {
            resultLength = 10;
        } else {
            resultLength = resultLength;
        }
        MovieItem[] all = getItems();
        MovieItem[] reverseLast = new MovieItem[resultLength];
        for (int i = 0; i < reverseLast.length; i++) {
            reverseLast[i] = all[all.length - 1 - i];
        }
        return reverseLast;
    }

    public MovieItem[] getItems() {
        return items;
    }
}
