package org.lessons.Bestof.model;

public class Song {

    private int songId;

    private String songName;

    public Song(int songId, String songName) {
        this.songId = songId;
        this.songName = songName;
    }

    public Song (){

    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

}
