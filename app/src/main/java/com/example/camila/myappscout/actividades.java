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

public class actividades extends Fragment {
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_actividades, container, false);

        final String[] cosasPorHacer = new String[]{"Problema con Cartas", "Llevar Mensajes Secretos", "Plan Para 3 Anos", "Cosas que todo Scout debe conocer", "Buenas acciones", "Adiestramiento a la memoria", "Usando la tabla de avisos", "Recordando la Ley Scout", "Memoria", "Agilidad Mental"};

        final String[] cosasPorHacer2 = new String[]{"Entregue a cada guia de patrulla en la proxima reunion de Tropa una tarjeta en un sobre sellado que contenga las siguientes instrucciones: usted tiene 15 minutos (a partir de este momento) para coleccionar y traer a su rincon de patrulla la mayor cantidad de objetos que empiecen con la letra Q y N (o S,B y T)\nPuntuacion: por cada articulo 1 punto, por articulos raros o desconocidos o de poco uso 5 puntos",

                "Los scouters de la tropa se situaran a dos o tres kilometros del campamento o lugar de reunion de la tropa. Usando equipos de corredores cada patrulla tratara de hacer llegar a traves de bosques y matorrales el mensaje hasta los scouters de la tropa, sin ser visto por los miembros de otra patrulla. Cada patrulla utilizara igual mensaje pero distinto codigo. Ejemplo Semaforo, Morse, codigo secreto de patrulla o tropa, etc. ",

                "Toda reunion de Tropa tiene, uno o varios temas que tratar. Recuerde que el' tiempo normal para que un Scout. llegue a convertirse en Scout de li1 Clase, es de 2 anos como maximo, por tanto incluya en sus programas semanales alguna materia, habilidad, nueva forma de hacerlo, en relacion con las pruebas de la Clase. Estimule a sus Scouts a pasar estas pruebas. Tenga en cuenta que la la Clase requiere un trabajo conjunto del Scout y el Scouter, en el cual cada uno pondra un 50 %. ",

                "A) Como obtener comunicacion con: Bomberos, Policias, Puestos de socorro. Doctor mas cercano al local de Tropa y casa.\n B) Saber enviar: Giros telegraficos y postales, telegramas, cablegramas, llamadas telefonicas de larga distancia. \n Nota: Organice una visita a la Estacion de Correos mas cercana y haga gestiones para que le expliquen a los muchachos todas estas interesantes cosas. ",

                "Realmente, el promedio de Buenas Acciones individuales no anda muy alto. Un Scout debe hacer una Buena Accion diaria y aunque esto no es materia de discusion, si debemos recordarle de tiempoen tiempo, a los Scouts de nuestra Tropa, este deber de todo miembro del .Movimiento.Asi que: \na) Deje a cada Guia de Patrulla reunirse con sus patrulleros durante la reunion de Tropa y que vaya haciendo una lista de las Buenas Acciones hechas por los miembros de la Patrulla ese dia, sin poner sus nombres. Por turno cada G. P, leera las Buenas Acciones hechas (sin decir nombres) las que comentara el Jefe de Tropa en forma general a todos los demas Scouts. \nb) Reuna todos los meses a su Corte de Honor y en esta reunion incluya el planear la. Buena Accion colectiva del mes. \nc) De oportunidades a las Patrullas para que hagan por ellas mismas Buenas Acciones colectivas en colegios, hospitales, asilos.",

        "Antes de empezar la reunion lea un mensaje corto a cada Scout de la Tropa. \nEl debe transcribir de memoria este mensaje (en codigo secreto, el cual solo lo interprete el), \nAl final de la reunion cada uno debera entregar al Jete de Tropa el mensaje transcrito y explicar a la Tropa los signos usados y por que los uso.",

                "Antes de que los Scouts lleguen, ponga en la tabla de avisos alguna foto, recorte de periodico, caricatura publicada en algun diario, etc., la cual los Scouts por Patrulla deberan identificar diciendo en la proxima reunion: Que es?, Como sucedio?, Donde?, Cuando?, nombre de los participantes, etc. \nPueden tomarse como ejemplos: Choques, eventos Scouts, lugares de campamentos, fotos aparecidas en la Revista Scout, etc. \nNota: Trate de mostrar fotos (en caso de periodicos) de asuntos netamente locales. Puede incluirse tambien: \nAveriguar nombre del tipo de madera que apa-rece en la tabla diciendo su uso, cultivo, etc. \nAveriguar el nombre de la flor, insecto o fruto que ha aparecido en la tabla de avisos.",

                "Todos nosotros debemos recordar la Ley Scout, pero en una reunion de Tropa no hay lugar para los sermones. Por ello: \na) El Scouter narrara una anecdota a los Scouts y posterior a ella las Patrullas diran que Ley o Leyes fueron tomando parte en la historieta. \nb) Las Patrullas prepararan representaciones en las cuales se ilustre alguna o algunas Leyes Scouts. \nc) Los Guias de Patrullas consecutivamente leeran en cada reunion unos parrafos de un libro seleccionado por ellos previamente, en el cual haya algo relacionado con algun articulo oarticulos de la Ley Scout. \nd) Un Scout de una'Patrulla pedira a otro Scout de diferente Patrulla, que le explique, con sus propias palabras cualquier articulo de la Ley Scout. ",

        "Al empezar la reunion, de a la Tropa en general tres numeros de telefono que puedan serles utiles en cualquier momento (Jefe de Grupo, Oficina Nacional, Comisionado de Distrito). \nContinue con su programa de reunion. Al final y por Patrulla averigue si los Scouts han retenido en mente los tres telefonos dados al principio. ",

                "Para mantener a los Scouts alerta y al mismo tiempo comprobar su agilidad mental haga algo parecido a esto: Durante una charla de Primeros Auxilios o cualquier otra materia, haga la siguiente pregunta: Cual es el signo para la T en el codigo Morse? o Con que nudo se empieza el amarre cuadrado?, etc. Compruebe y tome nota de como reacciona cada Scout\n\n"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1, cosasPorHacer);

        // C. Seleccionamos la lista de nuestro layout
        ListView listado = (ListView) rootView.findViewById(R.id.listado);

        // D. Asignamos el adaptador a nuestra lista
        listado.setAdapter(arrayAdapter);
        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), listaContenido3.class);
                intent.putExtra("contenido",cosasPorHacer2[position]);
                intent.putExtra("nombre",cosasPorHacer[position]);
                startActivity(intent);

                //Toast.makeText(getActivity(), "Hiciste click en el numero " + position,
                //Toast.LENGTH_LONG).show();
            }
        });
        return rootView;


    }


}