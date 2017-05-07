package com.example.android.structuredmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);


        // Find the button that shows each Activity
        Button nowPlayingCategoryButton = (Button) findViewById(R.id.nowPlayingButton);
        Button albumCategoryButton = (Button) findViewById(R.id.albumsButton);
        Button playListsCategoryButton = (Button) findViewById(R.id.playlistsButton);

        //Find the layout that shows the Now Playing activity
        LinearLayout showNowPlaying = (LinearLayout) findViewById(R.id.songInfo);


        // Set a click listener on Now Playing activity selection button
        nowPlayingCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Set a click listener on Albums activity selection button
        albumCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongsActivity.this, AlbumsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Set a click listener on Playlists activity selection button
        playListsCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongsActivity.this, PlaylistsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Set a click listener on the Songs information layout
        showNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
