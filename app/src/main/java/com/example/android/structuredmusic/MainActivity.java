package com.example.android.structuredmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Find the layout that shows each activity
        LinearLayout nowPlayingCategory = (LinearLayout) findViewById(R.id.nowPlayingCategory);
        LinearLayout albumCategory = (LinearLayout) findViewById(R.id.albumsCategory);
        LinearLayout songsCategory = (LinearLayout) findViewById(R.id.songsCategory);
        LinearLayout playListsCategory = (LinearLayout) findViewById(R.id.playlistsCategory);


        // Set a click listener on Now Playing activity selection layout
        nowPlayingCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(intent);
            }
        });

        // Set a click listener on Albums activity selection layout
        albumCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(intent);
            }
        });

        // Set a click listener on Songs activity selection layout
        songsCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(intent);
            }
        });

        // Set a click listener on Playlists activity selection layout
        playListsCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(intent);
            }
        });

    }

}