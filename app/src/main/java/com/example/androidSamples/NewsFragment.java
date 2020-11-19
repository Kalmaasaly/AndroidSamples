package com.example.androidSamples;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class NewsFragment extends Fragment {



    private RecyclerView recyclerView;
    private List<News> newsList = new ArrayList<>();
    private NewsListViewAdapter adapter;

    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_news,container, false);
        recyclerView = view.findViewById(R.id.listNews);
        recyclerView.setHasFixedSize(true);

        News news = new News();
        news.setEditor(" by Fariha Hart ");
        news.setPublishedDate("December 25,2020");
        news.setHeadline("Lorem ipsum dolor sit amet,Lorem ipsum dolor sit ametLorem ipsum dolor sit amet");
        news.setLinkToDetail("read more...");


        News newsS = new News();
        newsS.setEditor("by You");
        newsS.setPublishedDate("November 1,2020");
        newsS.setHeadline("Lorem ipsum dolor sit amet,Lorem ipsum dolor sit ametLorem ipsum dolor sit amet");
        newsS.setLinkToDetail("read more...");

        newsList.add(news);
        newsList.add(newsS);

        adapter = new NewsListViewAdapter(newsList);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager= new LinearLayoutManager(view.getContext());
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setLayoutManager(layoutManager);



        return view;
    }
}