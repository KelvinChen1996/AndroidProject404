package com.williamsumitromytextview.pikachisemarket.model;

import com.williamsumitromytextview.pikachisemarket.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by william on 07/04/2017.
 */

public class DataListFranchiseHome {
    private static final String[] NamaFranchise = {"7 Eleven", "Pizza Hut", "KFC", "Burger King", "McDonalds"};
    private static final String[] NamaPTFranchise = {"PT. tujuh sebelas", "PT. Topi PIzza", "PT. Kentang Fundamental Cinta", "PT. Raja Roti Burger", "PT. Disney Lands"};
    private static final int[] GambarBanner = {R.drawable.banner, R.drawable.banner1, R.drawable.banner2, R.drawable.banner3, R.drawable.banner4};
    private static final int[] JumlahFranchisee = {5, 10, 15, 3, 24};

    public static List<ListFranchiseHome> getlistfranchisehome() {
        List<ListFranchiseHome> listfh = new ArrayList<>();
        for (int i = 0; i < NamaFranchise.length; i++) {
            ListFranchiseHome listFranchiseHome = new ListFranchiseHome();
            listFranchiseHome.setNamaFranchise(NamaFranchise[i]);
            listFranchiseHome.setNamaPTFranchise(NamaPTFranchise[i]);
            listFranchiseHome.setBannerFranchise(GambarBanner[i]);
            listFranchiseHome.setJumlahFranchisee(JumlahFranchisee[i]);
            listfh.add(listFranchiseHome);
        }
        return listfh;
    }
}
