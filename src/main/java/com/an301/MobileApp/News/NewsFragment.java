package com.an301.MobileApp.News;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.an301.MobileApp.Home.HomeItem;
import com.an301.MobileApp.Home.HomeRecyclerAdapter;
import com.an301.MobileApp.R;

import java.util.ArrayList;
import java.util.List;

public class NewsFragment extends Fragment {

    private List<NewsItem> rv_list;
    private RecyclerView recyclerView3;

    public NewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);

        recyclerView3 =  view.findViewById(R.id.news_rv);

        recyclerView3.setLayoutManager(new LinearLayoutManager(getActivity()));

        rv_list = new ArrayList<>();
        rv_list.add(new NewsItem("Panthers defeats Portsmouth", "23 November 2018", R.drawable.bubs));
        rv_list.add(new NewsItem("Tough loss for the Panthers", "12 September 2018", R.drawable.softballpic4));
        rv_list.add(new NewsItem("Will the Panthers take home the championship this year?", "20 July 2018", R.drawable.nationals));
        rv_list.add(new NewsItem("20 - 0 win over Southampton", "3 March 2018", R.drawable.hitball));
        rv_list.add(new NewsItem("Panthers Baseball & Softball named the best sports club", "18 February 2018", R.drawable.chat));
        rv_list.add(new NewsItem("Big win at the NUSC", "8 January 2018", R.drawable.kit));

        NewsRecyclerAdapter mAdapter = new NewsRecyclerAdapter(rv_list);

        recyclerView3.setAdapter(mAdapter);

        recyclerView3.setItemAnimator(new DefaultItemAnimator());

        return view;
    }



}
