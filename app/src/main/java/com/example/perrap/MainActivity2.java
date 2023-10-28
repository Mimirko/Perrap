package com.example.perrap;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
    private AnimationDrawable anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        LinearLayout linearLayout= findViewById(R.id.Llayout);
        anim=(AnimationDrawable) linearLayout.getBackground();
        anim.setEnterFadeDuration(500);
        anim.setExitFadeDuration(500);
    }
    @Override
    protected void onResume() {
        super.onResume();
        if (anim != null && !anim.isRunning()) {
            anim.start();
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
        if (anim != null && anim.isRunning()) {
            anim.stop();
        }
    }
}