package com.example.camila.myappscout;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ScoutApp");
        //Obtenemos una referencia a los controles de la interfaz
        final Button boton = (Button)findViewById(R.id.button);
//Implementamos el evento &ldquo;click&rdquo; del bot&oacute;n
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, nueva.class);
                startActivity(intent);
            }
        });

        final Button boton2 = (Button)findViewById(R.id.button_act);
//Implementamos el evento &ldquo;click&rdquo; del bot&oacute;n
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, actividad.class);
                startActivity(intent);
            }
        });

        final Button boton3 = (Button)findViewById(R.id.button_mar);
//Implementamos el evento &ldquo;click&rdquo; del bot&oacute;n
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, marcoSimbolico.class);
                startActivity(intent);
            }
        });

        final Button boton4 = (Button)findViewById(R.id.button_tec);
//Implementamos el evento &ldquo;click&rdquo; del bot&oacute;n
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, tecnicas.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }
}
