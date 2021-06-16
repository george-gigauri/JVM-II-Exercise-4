package com.george.gigauri.exercise4.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "movie_tbl")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String country;
    private byte[] data;
    @OneToMany
    @JoinColumn(name = "mid", referencedColumnName = "id")
    private List<Category> categories;

    public Movie(long id, String title, String country, List<Category> categories, byte[] data) {
        this.id = id;
        this.title = title;
        this.country = country;
        this.categories = categories;
        this.data = data;
    }

    public Movie() { }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
