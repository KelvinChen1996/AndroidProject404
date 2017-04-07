package com.williamsumitromytextview.pikachisemarket.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.williamsumitromytextview.pikachisemarket.R;

public class DetailEventActivity extends AppCompatActivity {
    private static final String BUNDLE_EXTRAS = "BUNDLE_EXTRAS";
    private static final String EXTRA_JUDUL = "EXTRA_JUDUL";
    private static final String EXTRA_ISI = "EXTRA_ISI";
    private static final String EXTRA_JADWAL = "EXTRA_JADWAL";
    private static final String EXTRA_ALAMAT = "EXTRA_ALAMAT";
    TextView juduldetail, isidetail, jadwaldetail, alamatdetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_event);

        Bundle extras = getIntent().getBundleExtra(BUNDLE_EXTRAS);
        juduldetail = (TextView) findViewById(R.id.detailEventJudul);
        isidetail = (TextView) findViewById(R.id.detaileventIsi);
        jadwaldetail = (TextView) findViewById(R.id.detaileventJadwal);
        alamatdetail = (TextView) findViewById(R.id.detaileventAlamat);

        juduldetail.setText(extras.getString(EXTRA_JUDUL));
        isidetail.setText(extras.getString(EXTRA_ISI));
        jadwaldetail.setText(extras.getString(EXTRA_JADWAL));
        alamatdetail.setText(extras.getString(EXTRA_ALAMAT));
    }
}
