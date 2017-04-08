package com.williamsumitromytextview.pikachisemarket.model;

/**
 * Created by william on 04/04/2017.
 */

public class App {
    private int Drawable;
    private String Name;

    public App(String name, int drawable) {
        Drawable = drawable;
        Name = name;
    }


    public String getName() {
        return Name;
    }

    public int getDrawable() {
        return Drawable;
    }
}
