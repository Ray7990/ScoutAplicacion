package com.example.camila.myappscout;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class listaContenido5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contenido_2);
        //setContentView(R.layout.activity_nueva);
        ActionBar actionBar = getSupportActionBar();
        String recuperamos_variable_string = getIntent().getStringExtra("contenido");




        String recuperamos_variable_string2 = getIntent().getStringExtra("nombre");
        actionBar.setTitle(recuperamos_variable_string2);
        actionBar.setDisplayHomeAsUpEnabled(true);
        LayoutInflater mInflater = LayoutInflater.from(this);

        TextView textoContenido = (TextView)findViewById(R.id.textoview);
        textoContenido.setText(recuperamos_variable_string);
        //TextView txtCambiado = (TextView)findViewById(R.id.textoview);
        //txtCambiado.setText(recuperamos_variable_string);
        //actionBar.setCustomView(mCustomView);
        //actionBar.setDisplayShowCustomEnabled(true);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_nueva, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), marcoSimbolico.class);
        startActivityForResult(myIntent, 0);
        return true;

    }
}
