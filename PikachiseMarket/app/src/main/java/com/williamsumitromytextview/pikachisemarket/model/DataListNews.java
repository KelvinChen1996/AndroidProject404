package com.williamsumitromytextview.pikachisemarket.model;

import com.williamsumitromytextview.pikachisemarket.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by william on 10/04/2017.
 */

public class DataListNews {
    private static final String[] judulBerita = {
            "Seekor bocah diperkosa oleh seorang nenek berumur 90 tahun",
            "Gara - gara seorang cewek, 2 orang bocah lelaki saling perkosa satu sama lainnya",
            "Berita sekarang sudah tidak wajar"};
    private static final String[] tanggalBerita = {"Senin, 19 Juni 2019", "Senin, 19 Juni 2019", "Minggu, 18 Juni 2019"};
    private static final int[] gambarBerita = {R.drawable.news1, R.drawable.news2, R.drawable.news3};

    public static List<ListNews> getListNews() {
        List<ListNews> news = new ArrayList<>();
        for (int i = 0; i < judulBerita.length; i++) {
            ListNews listNews = new ListNews();
            listNews.setGambarberita(gambarBerita[i]);
            listNews.setJudulberita(judulBerita[i]);
            listNews.setTanggalberita(judulBerita[i]);
            news.add(listNews);
        }
        return news;
    }
}
