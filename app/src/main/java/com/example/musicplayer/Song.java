package com.example.musicplayer;

/**
 * Created by root on 4/27/15.
 */
public class Song {
    private long id;
    private String title;
    private String artist;

    public Song(long songID , String SongTitle , String SongArtist){
        this.id = songID;
        this.title = SongTitle;
        this.artist = SongArtist;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
