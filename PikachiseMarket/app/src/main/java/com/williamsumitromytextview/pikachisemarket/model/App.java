package com.williamsumitromytextview.pikachisemarket.model;

/**
 * Created by william on 04/04/2017.
 */

public class App {
    private int Drawable;
    private String Name;
    private float Rating;

    public App(String name, int drawable, float rating) {
        Drawable = drawable;
        Name = name;
        Rating = rating;
    }

    public float getRating() {
        return Rating;
    }

    public String getName() {
        return Name;
    }

    public int getDrawable() {
        return Drawable;
    }
}
