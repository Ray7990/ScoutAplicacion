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

public class Danzas extends Fragment {
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_danzas, container, false);

        final String[] cosasPorHacer3 = new String[] { "cancion1", "cancion2","cancion1","cancion2"};
        final String[] cosasPorHacer = new String[]{"Familia Sapo", "Cabeza boca", "Todo el movimiento Baila", "Tallarin"};

        final String[] cosasPorHacer2 = new String[]{"Estaba la familia sapo\n" +
                "Estaba papa sapo" +
                "\n" +
                "Sapo sa, sapo sa, sapo,sapo,sapo,sa" +
                "\n" +
                "Sapo, sapo, sa" +
                "\n" +
                "Sapo,sa,sa" +
                "\n" +
                "Debe de exagerar los movimientos y todo el circulo repetirlos a la vez que se va cantando la cancion. \n" +
                "\n" +
                "VARIANTES: despues de repasar los miembros de la familia sapo,se pueden ir diciendo el nombre de los componentes del circulo. Ejemplo: estaba la familia sapo, estaba Ana sapo\n\n",

        "\n\nCabeza, boca, many1-2-3\n\n"+
        "Mano, codo, many 1-2-3\n" +
                "\n" +
                "Cabeza, boca, mano, codo, many 1-2-3\n" +
                "\n" +
                "Pie, rodilla, many 1-2-3\n" +
                "\n" +
                "Cabeza, boca, mano, codo, pie, rodilla, many 1-2-3\n" +
                "\n" +
                "Medio paso, many1-2-3\n" +
                "\n" +
                "Cabeza, boca, mano, codo, pie, rodilla, medio paso, many 1-2-3\n" +
                "\n" +
                "Paso entero, amen y 1-2-3\n" +
                "\n" +
                "Cabeza, boca, mano, codo, pie, rodilla, medio paso, paso entero, many 1-2-3\n" +
                "\n" +
                "Media vuelta, many 1-2-3Cabeza, boca, mano, codo, pie, rodilla, medio paso, paso entero, media vuelta, many 1-2-3\n" +
                "\n" +
                "Vuelta entera, many 1-2-3\n" +
                "\n" +
                "Cabeza, boca, mano, codo, pie, rodilla, medio paso, paso entero, media vuelta,vuelta entera, many 1-2-3\n" +
                "\n" +
                "Medio salto, many 1-2-3\n" +
                "\n" +
                "Cabeza, boca, mano, codo, pie, rodilla, medio paso, paso entero, media vuelta, vuelta entera, medio salto, many 1-2-3\n" +
                "\n" +
                "Salto entero, many 1-2-3Cabeza, boca, mano, codo, pie, rodilla, medio paso, paso entero, media vuelta, vuelta entera, medio salto, salto entero, many 1-2-3\n" +
                "\n" +
                "De pechito, many 1-2-3\n" +
                "\n" +
                "Cabeza, boca, mano, codo, pie, rodilla,medio paso, paso entero, media vuelta, vuelta entera, medio salto, salto entero, de pechito, many 1-2-3 Una pompa, many 1-2-3\n" +
        "\n" +
                "Cabeza, boca, mano, codo, pie, rodilla, medio paso, paso entero, mediavuelta, vuelta entera, medio salto, salto entero, de pechito, una pompa, many 1-2-3\n" +
                "\n" +
                "Las dos pompas, many 1-2-3\n" +
                "\n" +
                "Cabeza, boca, mano, codo, pie, rodilla, medio paso, paso entero, media vuelta, vueltaentera, medio salto, salto entero, de pechito, una pompa, las dos pompas, many 1-2-3,\n\n",

                "\n\nTodo el movimiento Baila\n\n" +
                        "Todo el movimiento baila, baila, baila\n" +
                        "\n" +
                        "Todo el movimiento baila, baila, baila\n" +
                        "\n" +
                        "Baila, baila, baila todo el movimiento\n" +
                        "\n" +
                        "Baila, baila, baila todo el movimiento\n" +
                        "\n" +
                        "Con el dedo, dedo\n" +
                        "\n" +
                        "Todo el movimiento baila, baila, baila\n" +
                        "\n" +
                        "Todo el movimiento baila, baila, baila\n" +
                        "\n" +
                        "Baila, baila, baila todo el movimiento\n" +
                        "\n" +
                        "Baila, baila, baila todo el movimiento \n" +
                        "\n" +
                        "Con el dedo, dedo con el otro dedo\n" +
                        "\n" +
                        "Con la mano, mano con la otra mano\n" +
                        "\n" +
                        "Con el pie, pie con el otro pie\n" +
                        "\n" +
                        "Con el codo, codo con el otro codo, \n\n",

                "Un tallarin\n\nOtro tallarin\nQue se mueve por aqui\n\nQue se mueve por alla\n\nTodo pegostito con un poco de sal\n\nTres gotas de aceite\n\nY te lo comes tu\n\nY sales a bailar.\n\n"};


        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, cosasPorHacer);

        // C. Seleccionamos la lista de nuestro layout
        ListView listado = (ListView) rootView.findViewById(R.id.listado);

        // D. Asignamos el adaptador a nuestra lista
        listado.setAdapter(arrayAdapter);
        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), listaContenido6.class);
                intent.putExtra("contenido", cosasPorHacer2[position]);
                intent.putExtra("nombre", cosasPorHacer[position]);
                intent.putExtra("cancion",cosasPorHacer3[position]);
                intent.putExtra("video","video");
                startActivity(intent);

                //Toast.makeText(getActivity(), "Hiciste click en el numero " + position,
                //Toast.LENGTH_LONG).show();
            }
        });
        return rootView;


    }
}


