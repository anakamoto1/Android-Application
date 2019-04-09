package com.an301.MobileApp.Fixtures;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.an301.MobileApp.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FixturesFragment extends Fragment {

    private List<FixturesItem> rv_list2;
    private RecyclerView recyclerView2;


    public FixturesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fixtures, container, false);

        recyclerView2 =  view.findViewById(R.id.fixtures_rv);

        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));

        rv_list2 = new ArrayList<>();
        rv_list2.add(new FixturesItem("20 March 2019", "Brighton", "15:00", "Falmer Sports Centre", "Portsmouth", R.drawable.team, R.drawable.team, "-", "-"));
        rv_list2.add(new FixturesItem("19 March 2019", "Portsmouth", "9:00", "Chichester Sports Dome","Brighton", R.drawable.team, R.drawable.team, "10", "8"));
        rv_list2.add(new FixturesItem("7 December 2018", "Southampton", "20:00", "Chichester Sports Dome","Brighton", R.drawable.team, R.drawable.team, "4", "1"));
        rv_list2.add(new FixturesItem("19 November 2018", "Oxford Brookes", "9:30", "Southampton","Brighton", R.drawable.team, R.drawable.team, "9", "22"));
        rv_list2.add(new FixturesItem("5 November 2018", "Brighton", "10:00", "Southampton","Oxford Brookes", R.drawable.team, R.drawable.team, "0", "0"));
        rv_list2.add(new FixturesItem("18 September 2018", "Sussex", "19:00", "Preston Park","Brighton", R.drawable.team, R.drawable.team, "8", "5"));

        FixturesRecyclerAdapter mAdapter = new FixturesRecyclerAdapter(rv_list2);

        recyclerView2.setAdapter(mAdapter);

        recyclerView2.setItemAnimator(new DefaultItemAnimator());


        return view;
    }



}
