package com.example.navigate; // <-- same package

public class Movie {
    String title, year, duration, genre, label;
    int imageResId;

    public Movie(String title, String year, String duration, String genre, String label, int imageResId) {
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.genre = genre;
        this.label = label;
        this.imageResId = imageResId;
    }
}
