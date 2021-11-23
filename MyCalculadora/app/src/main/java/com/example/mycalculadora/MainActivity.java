package com.example.mycalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText myEditText1;
    private EditText myEditText2;
    private TextView myTexto1;
    private Button myBoton1;
//*****************************************************************

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myEditText1= (EditText) findViewById(R.id.editTextNumber1);
        myEditText2=(EditText) findViewById(R.id.editTextNumber2);
        myTexto1=(TextView) findViewById(R.id.texto1);

        Button myBoton1 = (Button) findViewById(R.id.boton1);
        //se implementa el escuchador del evento clic usando una clase anonima
        myBoton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor1=myEditText1.getText().toString();
                String valor2=myEditText2.getText().toString();
                int nro1=Integer.parseInt(valor1);
                int nro2=Integer.parseInt(valor2);
                int suma=nro1+nro2;
                String resu=String.valueOf(suma);
                myTexto1.setText(resu);
            }
        });
    }
}