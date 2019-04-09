package com.an301.MobileApp.News;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.an301.MobileApp.Home.HomeActivity.AboutActivity;
import com.an301.MobileApp.R;


public class NewsRecyclerAdapter extends RecyclerView.Adapter<NewsRecyclerAdapter.ViewHolder> {


    public List<NewsItem> news_list;

    public NewsRecyclerAdapter(List<NewsItem> list) {

        this.news_list = list;
    }

    @NonNull
    @Override
    public NewsRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        int newsimage = news_list.get(position).getNewsImage();
        String newsdesc = news_list.get(position).getNewsDesc();
        final String newsname = news_list.get(position).getNewsName();

        holder.newsname.setText(newsname);
        holder.newsdesc.setText(newsdesc);
        holder.newsimage.setImageResource(newsimage);

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (newsname == "Brighton defeats Portsmouth") {
                    Intent intent = new Intent(view.getContext(), AboutActivity.class);
                    view.getContext().startActivity(intent);
                }

            }

        });

    }

    @Override
    public int getItemCount() {
        return news_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private View mView;
        private TextView newsname;
        private TextView newsdesc;
        private ImageView newsimage;

        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            newsname = mView.findViewById(R.id.newsname);
            newsdesc = mView.findViewById(R.id.newsdesc);
            newsimage = mView.findViewById(R.id.newsimage);

        }


    }
}
