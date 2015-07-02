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

public class menores extends Fragment {
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_menores, container, false);

        final String[] cosasPorHacer = new String[]{"Lema y saludo","Apreton de mano izquierda","Etapas Manada","Himno Manada","Promesa", "Oracion Manada","Etapas Golondrina","Himno Golondrinas","Ley", "Oracion Golondrina"};

        final String[] cosasPorHacer2 = new String[]{"El lema es Siempre mejor.\n El saludo se hace levantando el dedo indice y medio, y el pulgar se posa sobre los dedos mas chicos.Los dos dedos levantados, nos recuerdan los 2 articulos de la ley.El dedo gordo sobre los 2 mas chicos nos representa que el mas fuerte protege al mas debil.",
                "Este singular saludo es caracteristico de los Scout y no se conoce de la existencia de otro siquiera similar en ninguna otra parte del planeta salvo en el Africa, en la Tribu Ashanti, lugar donde se creo. \nEl apreton de la mano izquierda Scouts, es una muestra de amistad. \nEs por ello que se hace con la mano izquierda, la mano mas cercana al corazon, la mano de la amistad. ",
                "Las insignias de progresion son cuatro y corresponden a cada una de las etapas de progresion de la Rama Lobatos.\n Ellas son: Lobezno, Saltador, Diestro y Cazador.\nCada Insignia de Progresion se entrega en el momento que el Lobato comienza a vivir y trabajar en la etapa respectiva, de modo que se usa en la camisa mientras se desarrolla una etapa y no al final ",
                "Hermano de lobo naci\nde un pueblo libre y valiente,\nla selva donde yo creci\nme dio un Dios y una Ley.\nAkela escucho tu voz,\ny en pos yo voy de tus huellas,\nBagheera y Baloo son\nlos amigos que me llevan.\n\nCORO:\n Avanzad! Siempre Mejor,\npueblo libre, avanzad;\ncon teson, haz de ser\ncada dia mejor.\nEstrella del atardecer,\nenciende con tu luz mis ojos;\n Oh! Dios haz en mi crecer\nun corazon puro y fiel\nHermano nuestro Senor,\na tus guaridas del cielo\nun dia iremos\npara cazar en tus selvas.\nAvanzad! Siempre .",
                "Yo quiero hacer siempre lo mejor\npara cumplir mis deberes\ncon Dios, mi pais y mi familia.\nVivir la ley Lobato(Glondrina)\ny hacer una buena accion cada dia.",
                "Senor\nEnsenanos a conocerte y\namarte cada vez mas\na ser generosos como tu,\nquedate con nosotros hoy y siempre\npara que con tu ayuda\npodamos hacer siempre lo mejor\nAsi sea.",
                "Las etapas de progresion representan los cambios que van a ir adquiriendo a medida que van a ir creciendo.\nPor eso, mas o menos cada un ano pasaras de una etapa a otra, pues entre ese tiempo la guiadora puede ir evaluando a cada nina mediante la participacion en las distintas actividades.\nLas etapas en la bandada son cuatro: \n1. Pichon. \n2. Aprendiz. \n3. Viajera. \n4. Guia de Vuelo. ",
                "Ir mas alla es mi tarea de hoy,\nAvanzando alegre y con amor\nCompartiendo la aventura hacia el sol\nCon mi canto que refleja lo que soy.\n\nEstribillo\nBuscando el carino que se anida\nEn nosotras, feliz Bandada azul,\nLlegaste como limpia brisa del sur\nHermana golondrina Bienvenida!\nBienvenida!\n\nGracias Senor por darnos la mision\nDe anunciar cada nueva primavera,\nOfreciendo la amistad verdadera\nY la promesa de ser Siempre Mejor.\n\nBuscando el carino que se anida\nEn nosotras, feliz Bandada azul,\nLlegaste como limpia brisa del sur\nHermana golondrina Bienvenida!\n Bienvenida!\n\n",
                "1) Conoce y cuida su cuerpo.\n2) Trata de solucionar sus problemas.\n3) Sabe escuchar y dice la verdad.\n4) Es alegre y dice lo que siente.\n5) Es amistosa y ayuda a los demas.\n6) Conoce a Dios como amigo.",
                "Senor,\nDame un corazon generoso como el tuyo,\nPara compartir mis cosas con los demas.\nQuiero seguir tu ejemplo siendo cada dia mejor,\nHazme crecer en tu amor.\nAsi sea."};
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


