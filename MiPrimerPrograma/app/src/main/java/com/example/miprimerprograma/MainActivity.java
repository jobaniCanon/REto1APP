package com.example.miprimerprograma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    Button boton1;
    TextView text1;

    /**
     * Constructor
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        boton1 =(Button) findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("Hola a todos...");
                Toast.makeText(getApplicationContext(),"le dio clic al botón", Toast.LENGTH_LONG).show();
            }
        });




        text1 =(TextView) findViewById(R.id.text1);
    }

    }



