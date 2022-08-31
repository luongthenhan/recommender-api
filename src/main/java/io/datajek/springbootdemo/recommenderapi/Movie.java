package io.datajek.springbootdemo.recommenderapi;

public class Movie {
    int id;
    String title;
    double rating;

    public Movie() {
    }
 
    public Movie(int id, String title, double rating) {
        super();
        this.id = id;
        this.title = title;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie [id=" + id + ", title=" + title + ", rating=" + rating + "]";
    }
}
