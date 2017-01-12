package com.chippy.letsandroid.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by chippy on 2017-01-10.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        News currentNews = getItem(position);

        // Find the TextView with view ID magnitude
        TextView section= (TextView) listItemView.findViewById(R.id.section);
        section.setText(currentNews.getSection());

        TextView title= (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentNews.getTitle());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }




}

