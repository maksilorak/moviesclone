package com.nelson.movies.model;

public class BannerMovies {

    Integer id;
    String movieName;
    String imageUrl;
    String fileuRL;

    public BannerMovies(Integer id, String movieName, String imageUrl, String fileuRL) {
        this.id = id;
        this.movieName = movieName;
        this.imageUrl = imageUrl;
        this.fileuRL = fileuRL;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFileuRL() {
        return fileuRL;
    }

    public void setFileuRL(String fileuRL) {
        this.fileuRL = fileuRL;
    }

}
