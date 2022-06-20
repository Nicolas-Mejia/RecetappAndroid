package com.example.recetappp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView cargaAnimada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargaAnimada = (TextView)findViewById(R.id.textoCargando);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.cargando);
        cargaAnimada.startAnimation(animation);
    }
}