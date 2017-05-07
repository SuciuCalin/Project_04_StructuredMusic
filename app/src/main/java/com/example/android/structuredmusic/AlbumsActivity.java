package com.example.android.structuredmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);


        // Find the button that shows each Activity
        Button nowPlayingCategoryButton = (Button) findViewById(R.id.nowPlayingButton);
        Button songsCategoryButton = (Button) findViewById(R.id.songsButton);
        Button playListsCategoryButton = (Button) findViewById(R.id.playlistsButton);

        //Find the layout that shows the songs activity
        LinearLayout showSongs = (LinearLayout) findViewById(R.id.albumInfo);


        // Set a click listener on Now Playing activity selection button
        nowPlayingCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlbumsActivity.this, NowPlayingActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Set a click listener on Songs activity selection button
        songsCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlbumsActivity.this, SongsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Set a click listener on Playlists activity selection button
        playListsCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlbumsActivity.this, PlaylistsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Set a click listener on the Album information layout
        showSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlbumsActivity.this, SongsActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
