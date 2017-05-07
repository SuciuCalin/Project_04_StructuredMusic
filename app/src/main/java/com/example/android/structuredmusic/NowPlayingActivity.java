package com.example.android.structuredmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);


        // Find the button that shows each Activity
        Button albumCategoryButton = (Button) findViewById(R.id.albumsButton);
        Button songsCategoryButton = (Button) findViewById(R.id.songsButton);
        Button playListsCategoryButton = (Button) findViewById(R.id.playlistsButton);


        // Set a click listener on Albums activity selection button
        albumCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NowPlayingActivity.this, AlbumsActivity.class);
                startActivity(intent);
            }
        });

        // Set a click listener on Songs activity selection button
        songsCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NowPlayingActivity.this, SongsActivity.class);
                startActivity(intent);
            }
        });

        // Set a click listener on playlists activity selection button
        playListsCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NowPlayingActivity.this, PlaylistsActivity.class);
                startActivity(intent);
            }
        });

    }
}
