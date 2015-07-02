package com.example.camila.myappscout;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class mayores extends Fragment {
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_mayores, container, false);

        final String[] cosasPorHacer = new String[]{"Ley Scout", "Himno Tropa", "Himno Compania", "Lema"};
        final String[] cosasPorHacer2 = new String[]{"\n\nSiempre lista hermana Guia\n\n" +
                "es el deber nuestra mision\n\n" +
                " ser la luz que brilla y brilla\n\n"
                + "por la Patria y el honor.\n" +
                "\n" +
                "A la cumbre subiremos\n" +
                "\n" +
                "sin descanso hasta el final\n" +
                "\n" +
                "con el alma siempre abierta\n" +
                "\n" +
                "en pos de nuestro ideal.\n" +
                "\n" +
                "Guia avanzad en alegre caravana\n" +
                "\n" +
                "porque la luz nos espera al final,\n" +
                "\n" +
                "siempre la paz, el amor y amistad\n" +
                "\n" +
                "el triunfo sera de nuestra hermandad.\n" +
                "\n" +
                "En el esfuerzo y gran entusiasmo\n" +
                "\n" +
                "encontraremos progreso y labor\n" +
                "\n" +
                "para que al toque de la gran llamada\n" +
                "\n" +
                "Si, contestemos con un gran valor.\n" +
                "\n" +
                "A caminar por donde no hay caminos\n" +
                "\n" +
                "porque camino se hace al andar\n" +
                "\n" +
                "solo mirando nuestro destino\n" +
                "\n" +
                "para poder asi siempre dar.\n\n", "Hacer", "Vender", "Esperar"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, cosasPorHacer);

        // C. Seleccionamos la lista de nuestro layout
        ListView listado = (ListView) rootView.findViewById(R.id.listado);

        // D. Asignamos el adaptador a nuestra lista
        listado.setAdapter(arrayAdapter);
        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), listaContenido5.class);
                intent.putExtra("contenido", cosasPorHacer2[position]);
                intent.putExtra("nombre", cosasPorHacer[position]);
                startActivity(intent);

                //Toast.makeText(getActivity(), "Hiciste click en el numero " + position,
                //Toast.LENGTH_LONG).show();
            }
        });
        return rootView;


    }
}


