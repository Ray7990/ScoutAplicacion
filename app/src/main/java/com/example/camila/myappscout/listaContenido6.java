package com.example.camila.myappscout;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;


public class listaContenido6 extends AppCompatActivity {
    private VideoView reproductor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contenido6);
        //setContentView(R.layout.activity_nueva);
        ActionBar actionBar = getSupportActionBar();
        String recuperamos_variable_string = getIntent().getStringExtra("contenido");
        String recuperamos_variable_string2 = getIntent().getStringExtra("nombre");
        String recuperamos_variable_string3 = getIntent().getStringExtra("video");
        actionBar.setTitle(recuperamos_variable_string2);
        actionBar.setDisplayHomeAsUpEnabled(true);
        LayoutInflater mInflater = LayoutInflater.from(this);

        TextView textoContenido = (TextView)findViewById(R.id.textoview);
        textoContenido.setText(recuperamos_variable_string);

        reproductor =(VideoView)findViewById(R.id.video);
        int id = getResources().getIdentifier(recuperamos_variable_string3,"raw", this.getPackageName());
        reproductor.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/" + id));

        MediaController vidControl =new MediaController(this);
        vidControl.setAnchorView(reproductor);
        reproductor.setMediaController(vidControl);
        reproductor.start();

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
        Intent myIntent = new Intent(getApplicationContext(), nueva.class);
        startActivityForResult(myIntent, 0);

        return true;

    }
}
