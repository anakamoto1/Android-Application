package com.an301.MobileApp.Fixtures;

public class FixturesItem {

    public String date;
    public String team1;
    public String time;
    public String team2;
    public int image;
    public int image2;
    public String team1score;
    public String team2score;
    public String location;

    public FixturesItem(){

    }

    public FixturesItem(String date, String team1, String time, String location, String team2, int image, int image2, String team1score, String team2score) {
        this.date = date;
        this.team1 = team1;
        this.time = time;
        this.team2 = team2;
        this.image = image;
        this.image2 = image2;
        this.team1score = team1score;
        this.team2score = team2score;
        this.location = location;

    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getTeam1() {
        return team1;
    }
    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }
    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }

    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2() {
        this.image2 = image2;
    }

    public String getTeam1Score() {
        return team1score;
    }
    public void setTeam1Score(String team1score) {
        this.team1score = team1score;
    }

    public String getTeam2Score() {
        return team2score;
    }
    public void setTeam2Score(String team2score) {
        this.team2score = team2score;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation() {
        this.location = location;
    }
}
