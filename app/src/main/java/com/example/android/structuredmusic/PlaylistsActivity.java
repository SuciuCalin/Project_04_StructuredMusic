package com.example.android.structuredmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);


        // Find the button that shows each Activity
        Button nowPlayingCategoryButton = (Button) findViewById(R.id.nowPlayingButton);
        Button albumCategoryButton = (Button) findViewById(R.id.albumsButton);
        Button songsCategoryButton = (Button) findViewById(R.id.songsButton);

        //Find the layout that shows the Now Playing activity
        LinearLayout showNowPlaying = (LinearLayout) findViewById(R.id.playlistInfo);


        // Set a click listener on Now Playing activity selection button
        nowPlayingCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaylistsActivity.this, NowPlayingActivity.class);
                startActivity(intent);
            }
        });

        // Set a click listener on Albums activity selection button
        albumCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaylistsActivity.this, AlbumsActivity.class);
                startActivity(intent);
            }
        });

        // Set a click listener on Songs activity selection button
        songsCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaylistsActivity.this, SongsActivity.class);
                startActivity(intent);
            }
        });

        // Set a click listener on the Playlists information layout
        showNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaylistsActivity.this, NowPlayingActivity.class);
                startActivity(intent);
            }
        });
    }
}
