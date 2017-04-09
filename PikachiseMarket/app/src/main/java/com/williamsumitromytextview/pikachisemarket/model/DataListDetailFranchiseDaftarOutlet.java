package com.williamsumitromytextview.pikachisemarket.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by william on 08/04/2017.
 */

public class DataListDetailFranchiseDaftarOutlet {
    private static final String[] namaFranchisee = {
            "PT. ABC",
            "PT. BCD",
            "PT. CDE",
            "PT. DEF"
    };
    private static final String[] alamatFranchisee = {
            "Jalan. Thamrin No. 123 A",
            "Jalan. Thamrin No. 234 B",
            "Jalan. Thamrin No. 345 C",
            "Jalan. Thamrin No. 456 D"
    };
    private static final String[] nomorteleponFranchisee = {
            "0812-0000-0001",
            "0812-0000-0002",
            "0812-0000-0003",
            "0812-0000-0004"
    };
    private static final String[] ownerFranchisee = {
            "Tekz Kinz",
            "Tekz Lungz",
            "Kinz Lungz",
            "Tekz Kinz Lungz"
    };
    private static final String[] tahunberdirifranchisee = {
            "2001",
            "2002",
            "2003",
            "2004"
    };

    public static List<ListDetailFranchiseDaftarOutlet> getlistdetailfranchisedaftaroutlet() {
        List<ListDetailFranchiseDaftarOutlet> daftaroulet = new ArrayList<>();
        for (int i = 0; i < namaFranchisee.length; i++) {
            ListDetailFranchiseDaftarOutlet listdaftaroutlet = new ListDetailFranchiseDaftarOutlet();
            listdaftaroutlet.setNamaPTFranchisee(namaFranchisee[i]);
            listdaftaroutlet.setAlamatFranchisee(alamatFranchisee[i]);
            listdaftaroutlet.setContactFranchisee(nomorteleponFranchisee[i]);
            listdaftaroutlet.setBossFranchisee(ownerFranchisee[i]);
            listdaftaroutlet.setTanggalberdiriFranchisee(tahunberdirifranchisee[i]);
            daftaroulet.add(listdaftaroutlet);
        }


        return daftaroulet;
    }
}
