package com.example.android14;

public class SongModel {

    private String authorName;
    private String songName;

    public SongModel(String authorName, String songName) {
        this.authorName = authorName;
        this.songName = songName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
}
