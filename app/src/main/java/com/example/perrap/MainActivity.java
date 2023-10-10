package com.example.perrap;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.pantalla_inicial);
        //agregamos animaciones
        animation animacion1= animationUtils.loadAnimation(context: this,R.anim.desplazamiento_arriba);






        LinearLayout linearLayout= findViewById(R.id.Llayout);
        anim=(AnimationDrawable) linearLayout.getBackground();
        anim.setEnterFadeDuration(1000);
        anim.setExitFadeDuration(1000);
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