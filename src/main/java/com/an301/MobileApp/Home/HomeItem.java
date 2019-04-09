package com.an301.MobileApp.Home;

public class HomeItem {
    public String name;
    public String desc;
    public int id;

    public HomeItem(){

    }

    public HomeItem(String name, String desc, int id) {
        this.name = name;
        this.desc = desc;
        this.id = id;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImage() {
        return id;
    }
    public void setImage(int image) {
        this.id = image;
    }
}
