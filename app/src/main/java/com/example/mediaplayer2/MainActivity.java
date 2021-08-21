package com.example.mediaplayer2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play(View view) {
        if(mediaplayer==null) {
            mediaplayer= MediaPlayer.create(getApplicationContext(),R.raw.song1);
            mediaplayer.start();
        }
        else{
            mediaplayer.start();
        }
    }
    public void pause(View view) {
        if(mediaplayer!=null) {
            mediaplayer.pause();
        }
    }
    public void stop(View view){
        mediaplayer.release();
        mediaplayer=null;
    }
}