package com.example.androidSamples;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsListViewAdapter extends RecyclerView.Adapter<NewsListViewAdapter.ViewHolder> {

    List<News> newsList;


    public NewsListViewAdapter(List<News> newsList) {
        this.newsList = newsList;
    }


    @Override
    public NewsListViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.custom_list_news, parent, false);
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(NewsListViewAdapter.ViewHolder holder, int position) {
        News news=newsList.get(position);
        holder.editor.setText(news.getEditor());
        holder.publishedDate.setText(news.getPublishedDate());
        holder.linkDetail.setText(news.getLinkToDetail());
        holder.headline.setText(news.getHeadline());

    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }


    public static class ViewHolder  extends RecyclerView.ViewHolder  {
        TextView editor;
        TextView headline;
        TextView publishedDate;
        TextView linkDetail;

        public ViewHolder(@NonNull View view) {
            super(view);

            editor = view.findViewById(R.id.editor);
            headline = view.findViewById(R.id.headline);
            publishedDate = view.findViewById(R.id.publishedDate);
            linkDetail = view.findViewById(R.id.linkDetail);
        }
    }

}
