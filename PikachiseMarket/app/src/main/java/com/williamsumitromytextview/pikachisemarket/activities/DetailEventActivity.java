package com.williamsumitromytextview.pikachisemarket.activities;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.williamsumitromytextview.pikachisemarket.R;

public class DetailEventActivity extends AppCompatActivity {
    private static final String BUNDLE_EXTRAS = "BUNDLE_EXTRAS";
    private static final String EXTRA_JUDUL = "EXTRA_JUDUL";
    private static final String EXTRA_ISI = "EXTRA_ISI";
    private static final String EXTRA_JADWAL = "EXTRA_JADWAL";
    private static final String EXTRA_ALAMAT = "EXTRA_ALAMAT";
    private static final String EXTRA_GAMBAR = "EXTRA_GAMBAR";
    TextView juduldetail, isidetail, jadwaldetail, alamatdetail;
    ImageView gambardetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_list_event);

        Bundle extras = getIntent().getBundleExtra(BUNDLE_EXTRAS);
        juduldetail = (TextView) findViewById(R.id.detailEventJudul);
        isidetail = (TextView) findViewById(R.id.detaileventIsi);
        jadwaldetail = (TextView) findViewById(R.id.detaileventJadwal);
        alamatdetail = (TextView) findViewById(R.id.detaileventAlamat);
        gambardetail = (ImageView) findViewById(R.id.detaileventGambar);


        juduldetail.setText(extras.getString(EXTRA_JUDUL));
        isidetail.setText(extras.getString(EXTRA_ISI));
        jadwaldetail.setText(extras.getString(EXTRA_JADWAL));
        alamatdetail.setText(extras.getString(EXTRA_ALAMAT));
        gambardetail.setImageResource(extras.getInt(EXTRA_GAMBAR));
//        String gettingImageUrl = extras.getString(EXTRA_GAMBAR);
//        Picasso.with(this).load(gettingImageUrl).into(gambardetail);
        // Yang gambar harus pakai database https://www.youtube.com/watch?v=3-qzF_2LALk
        // kalau pakai data statis gak bisa muncul. pasrah w

    }
}
