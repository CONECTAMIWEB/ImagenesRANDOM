package com.example.usuario.imagenesrandom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    private static final Random rgenerador = new Random();


    private static final Integer[] imagenesID =
            {R.drawable.chino_01, R.drawable.chino_02, R.drawable.chino_03, R.drawable.chino_04, R.drawable.chino_05, R.drawable.chino_06, R.drawable.chino_07, R.drawable.chino_08, R.drawable.chino_09, R.drawable.chino_10, R.drawable.chino_11, R.drawable.chino_12,};




    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Integer index = imagenesID[rgenerador.nextInt(imagenesID.length)];


        final ImageView iv = (ImageView) findViewById(R.id.imagMes);

        View btnGenerar = findViewById(R.id.btnGenerar);

        btnGenerar.setOnClickListener(new View.OnClickListener()
        {


            public void onClick(View V)
            {

                int resource = imagenesID[rgenerador.nextInt(imagenesID.length)];

                iv.setImageResource(resource);


            }

        });

        //esto es un comentario
        //otro comentario
        // ultimo comentario



    }

}