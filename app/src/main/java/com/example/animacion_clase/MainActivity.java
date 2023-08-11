package com.example.animacion_clase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView logo;
    private Button btnAbajo;
    private Button btnArriba;
    private Button btnAumentar;
    private Button btnDisminuir;
    private Button btnRotar;
    private Animation objAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();

        btnAbajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                objAnimation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.desplazamiento_abajo);
                logo.startAnimation(objAnimation);
            }
        });

        btnArriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                objAnimation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.desplazamiento_arriba);
                logo.startAnimation(objAnimation);
            }
        });

        btnAumentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                objAnimation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.aumentar_size);
                logo.startAnimation(objAnimation);
            }
        });

        btnDisminuir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                objAnimation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.disminuir_size);
                logo.startAnimation(objAnimation);
            }
        });

        btnRotar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotar();
            }
        });

    }

    private void inicializar() {
        logo = findViewById(R.id.logo);
        btnAbajo = findViewById(R.id.btnAbajo);
        btnArriba = findViewById(R.id.btnArriba);
        btnAumentar = findViewById(R.id.btnAumentar);
        btnDisminuir = findViewById(R.id.btnDisminuir);
        btnRotar = findViewById(R.id.btnRotar);
    }

    private void rotar () {
        objAnimation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotacion);
        logo.startAnimation(objAnimation);
    }

}