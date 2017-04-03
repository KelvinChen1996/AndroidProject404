package com.williamsumitromytextview.pikachisemarket.model;

import java.util.List;

/**
 * Created by william on 04/04/2017.
 */

public class Snap {
    private int Gravity;
    private String Text;
    private List<App> Apps;

    public Snap(int gravity, String text, List<App> apps) {
        Gravity = gravity;
        Text = text;
        Apps = apps;
    }

    public String getText() {
        return Text;
    }

    public int getGravity() {
        return Gravity;
    }

    public List<App> getApps() {
        return Apps;
    }
}
