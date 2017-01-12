package com.chippy.letsandroid.newsapp;

/**
 * Created by chippy on 2017-01-10.
 */

public class News {
    private String mSection;
    private String mTitle;
    private String mUrl;


    public News(String section, String title, String url) {
        mSection=section;
        mTitle=title;
        mUrl = url;
    }
    public String getSection() {
        return mSection;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getUrl() {
        return mUrl;
    }
}

