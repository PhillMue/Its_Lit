package com.android.mue.itslit;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends Activity {
    private ImageButton btnSwitch;
    private Camera camera;
    private boolean isFlashOn;
    private boolean hasFlash;
    private Parameters params;
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// flash switch button
        btnSwitch = (ImageButton) findViewById(R.id.btnSwitch);
    }
