package com.example.festejos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.xml.sax.helpers.AttributeListImpl;

/**
 * Clase main activity
 */
public class MainActivity extends AppCompatActivity {
private TextView myTexto1;
private Button myBoton1;
    Drawable drawable5;
    ImageView imagen5;

    /**
     * Costructor de la clase
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Clase anonima
         */
/*
        boton1 = (Button) findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto1.setText("hola otra vez..!");
                Toast.makeText(getApplicationContext(), "oprimio un boton", Toast.LENGTH_LONG ).show();
            }
        });

 */

        myTexto1=(TextView)findViewById(R.id.texto1);
        //--------------------------------------------------------
/**
 * Metodo apra colocar una imagen en el frame
 */
        Resources res1 = getResources();
        drawable5 = res1.getDrawable(R.drawable.principal, getTheme());

        imagen5 = (ImageView) findViewById(R.id.imagen5);
        imagen5.setImageDrawable(drawable5);

    }

    /**
     * Menu
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.menuopciones,menu);
        return true;
    }

    /**
     * Metodo del menu para seleccionar la pantalla
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id =item.getItemId();
        if (id==R.id.opcion1){
            Toast.makeText(this,"Productos",Toast.LENGTH_LONG).show();
            Intent segundaPantalla = new Intent(this,MainActivity2.class);
            startActivity(segundaPantalla);

        }
        if (id==R.id.opcion2){
            Toast.makeText(this,"Servicios",Toast.LENGTH_LONG).show();
            Intent terceraPantalla = new Intent(this,MainActivity3.class);
            startActivity(terceraPantalla);

        }
        if (id==R.id.opcion3){
            Toast.makeText(this,"Sucursales",Toast.LENGTH_LONG).show();
            Intent cuartaPantalla = new Intent(this,MainActivity4.class);
            startActivity(cuartaPantalla);

        }
        return super.onOptionsItemSelected(item);
    }
}//***fin de la clase