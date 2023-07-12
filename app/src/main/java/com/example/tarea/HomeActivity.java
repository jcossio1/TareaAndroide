package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button botonHoteles;
    Button botonRestaurantes;
    Button botonSitios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

botonHoteles= findViewById(R.id.botonHoteles);
botonRestaurantes= findViewById(R.id.botonRestaurantes);
botonSitios= findViewById(R.id.botonSitios);




        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Qué se quiere que pase al detectar un clic
                Intent intenthotel = new Intent(HomeActivity.this,hoteles.class);
                startActivity(intenthotel);
            }

        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentrest = new Intent(HomeActivity.this,restaurantes.class);
                startActivity(intentrest);
            }
        });

        botonSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenturismo = new Intent(HomeActivity.this,sitios.class);
                startActivity(intenturismo);
            }
        });

        botonSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenturismo = new Intent(HomeActivity.this,sitios.class);
                startActivity(intenturismo);
            }
        });
    }
}