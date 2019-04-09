package com.an301.MobileApp.News;

public class NewsItem {
    public String newsname;
    public String newsdesc;
    public int newsimage;

    public NewsItem(){

    }

    public NewsItem(String newsname, String newsdesc, int newsimage) {
        this.newsname = newsname;
        this.newsdesc = newsdesc;
        this.newsimage = newsimage;

    }

    public String getNewsName() {
        return newsname;
    }
    public void setNewsName(String newsname) {
        this.newsname = newsname;
    }

    public String getNewsDesc() {
        return newsdesc;
    }
    public void setNewsDesc(String newsdesc) {
        this.newsdesc = newsdesc;
    }

    public int getNewsImage() {
        return newsimage;
    }
    public void setNewsImage(int newsimage) {
        this.newsimage = newsimage;
    }
}
