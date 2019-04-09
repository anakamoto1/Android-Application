package com.an301.MobileApp.Home;

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
import com.an301.MobileApp.Home.HomeActivity.CompetitionsActivity;
import com.an301.MobileApp.Home.HomeActivity.MembershipActivity;
import com.an301.MobileApp.Home.HomeActivity.SocialsActivity;
import com.an301.MobileApp.Home.HomeActivity.TrainingActivity;
import com.an301.MobileApp.Home.HomeActivity.WhatIsActivity;
import com.an301.MobileApp.R;

public class HomeRecyclerAdapter extends RecyclerView.Adapter<HomeRecyclerAdapter.ViewHolder> {


    public List<HomeItem> home_list;

    public HomeRecyclerAdapter(List<HomeItem> list) {

        this.home_list = list;
    }

    @NonNull
    @Override
    public HomeRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        int id = home_list.get(position).getImage();
        String desc = home_list.get(position).getDesc();
        final String name = home_list.get(position).getName();

        holder.name.setText(name);
        holder.desc.setText(desc);
        holder.image.setImageResource(id);

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (name == "About the Club") {
                    Intent intent = new Intent(view.getContext(), AboutActivity.class);
                    view.getContext().startActivity(intent);
                }
                if (name == "Training Sessions") {
                    Intent intent1 = new Intent(view.getContext(), TrainingActivity.class);
                    view.getContext().startActivity(intent1);
                }
                if (name == "Competitions") {
                    Intent intent2 = new Intent(view.getContext(), CompetitionsActivity.class);
                    view.getContext().startActivity(intent2);
                }
                if (name == "Membership") {
                    Intent intent3 = new Intent(view.getContext(), MembershipActivity.class);
                    view.getContext().startActivity(intent3);
                }
                if (name == "Socials") {
                    Intent intent4 = new Intent(view.getContext(), SocialsActivity.class);
                    view.getContext().startActivity(intent4);
                }
                if (name == "What is Baseball/Softball?") {
                    Intent intent5 = new Intent(view.getContext(), WhatIsActivity.class);
                    view.getContext().startActivity(intent5);
                }
            }

        });

    }

    @Override
    public int getItemCount() {
        return home_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private View mView;
        private TextView name;
        private TextView desc;
        private ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            name = mView.findViewById(R.id.item_name);
            desc = mView.findViewById(R.id.item_desc);
            image = mView.findViewById(R.id.item_image);

        }


    }
}
