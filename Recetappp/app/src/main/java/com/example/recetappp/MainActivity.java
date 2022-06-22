package com.example.recetappp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button forgotPassButton;
    public Button notRegisteredButton;
    TextView cargaAnimada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        //cargaAnimada = (TextView)findViewById(R.id.textoCargando);
        //Animation animation = AnimationUtils.loadAnimation(this, R.anim.cargando);
        //cargaAnimada.startAnimation(animation);

        forgotPassButton = (Button) findViewById(R.id.forgotPassword);
        notRegisteredButton = (Button) findViewById(R.id.notRegistered);

        forgotPassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ForgotPassword.class);
                startActivity(intent);
            }
        });

        notRegisteredButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });
    }
}