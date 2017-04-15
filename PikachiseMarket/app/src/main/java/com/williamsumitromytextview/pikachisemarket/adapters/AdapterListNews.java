package com.williamsumitromytextview.pikachisemarket.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.williamsumitromytextview.pikachisemarket.R;
import com.williamsumitromytextview.pikachisemarket.model.ListNews;

import java.util.List;

/**
 * Created by william on 10/04/2017.
 */

public class AdapterListNews extends RecyclerView.Adapter<AdapterListNews.ViewHolder> {
    private List<ListNews> listnews;
    private LayoutInflater inflater;

    public AdapterListNews(List<ListNews> listnews, Context c) {
        this.listnews = listnews;
        this.inflater = LayoutInflater.from(c);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_news, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return listnews.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView judulberita, tanggalberita;
        private ImageView gambarberita;
        private View container;

        public ViewHolder(View itemView) {
            super(itemView);

            judulberita = (TextView) itemView.findViewById(R.id.newsTitle);
            tanggalberita = (TextView) itemView.findViewById(R.id.newsDate);
            gambarberita = (ImageView) itemView.findViewById(R.id.newsPicture);
            container = itemView.findViewById(R.id.cv_news);
        }
    }
}
