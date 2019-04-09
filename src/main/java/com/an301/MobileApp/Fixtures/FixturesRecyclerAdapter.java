package com.an301.MobileApp.Fixtures;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.an301.MobileApp.Home.HomeActivity.AboutActivity;
import com.an301.MobileApp.R;

import java.util.List;


public class FixturesRecyclerAdapter extends RecyclerView.Adapter<FixturesRecyclerAdapter.ViewHolder> {


    public List<FixturesItem> fixtures_list;

    public FixturesRecyclerAdapter(List<FixturesItem> list) {

        this.fixtures_list = list;
    }

    @NonNull
    @Override
    public FixturesRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fixtures_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        int image = fixtures_list.get(position).getImage();
        int image2 = fixtures_list.get(position).getImage2();
        final String team1 = fixtures_list.get(position).getTeam1();
        String team2 = fixtures_list.get(position).getTeam2();
        String time = fixtures_list.get(position).getTime();
        String date = fixtures_list.get(position).getDate();
        String team1score = fixtures_list.get(position).getTeam1Score();
        String team2score = fixtures_list.get(position).getTeam2Score();
        String location = fixtures_list.get(position).getLocation();

        holder.team1.setText(team1);
        holder.team2.setText(team2);
        holder.time.setText(time);
        holder.date.setText(date);
        holder.image.setImageResource(image);
        holder.image2.setImageResource(image2);
        holder.team1score.setText(team1score);
        holder.team2score.setText(team2score);
        holder.location.setText(location);

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (team1 == "About the Club") {
                    Intent intent = new Intent(view.getContext(), AboutActivity.class);
                    view.getContext().startActivity(intent);
                }


            }

        });

    }

    @Override
    public int getItemCount() {
        return fixtures_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private View mView;
        private TextView team1;
        private TextView team2;
        private TextView time;
        private TextView date;
        private ImageView image;
        private ImageView image2;
        private TextView team1score;
        private TextView team2score;
        private TextView location;

        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            team1 = mView.findViewById(R.id.team1);
            team2 = mView.findViewById(R.id.team2);
            time = mView.findViewById(R.id.time);
            date = mView.findViewById(R.id.date);
            image = mView.findViewById(R.id.image);
            image2 = mView.findViewById(R.id.image2);
            team1score = mView.findViewById(R.id.team1score);
            team2score = mView.findViewById(R.id.team2score);
            location = mView.findViewById(R.id.location);

        }


    }
}
