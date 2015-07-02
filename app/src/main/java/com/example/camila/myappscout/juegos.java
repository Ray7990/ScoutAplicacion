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

public class juegos extends Fragment {
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_juegos, container, false);

        final String[] cosasPorHacer = new String[]{"Relevos de ciegos","Carreras con cargas","Carreras de vagones","Carrera de traineras","Carreras de equilibrio", "Recogida de patatas","A tres piernas","Carrera de sepia","Relevos con la boca", "Carrera de cubos"};

        final String[] cosasPorHacer2 = new String[]{"Los equipos estaran divididos en dos grupos cada uno, y se pondran enfrente uno de otro en los dos extremos de un campo. A una senal salen los primeros corredores, que llevaran los ojos vendados e iran al otro lado dirigidos por los gritos de sus companeros. Al llegar, entregaran el testigo a otro companero que tambien estara con los ojos vendados y que ha de reocrrer el comino hacia donde salio el primero y alli entregar el testigo a otro ciego... hasta que hayan corrido todos los del grupo.","Formaran los equipos en columnas detras de una linea. El primero llevara sobre sus espaldas al segundo. Al llegar a una cierta distancia el que va de carga se vuelve para transportar al tercero y asi sucesivamente hasta que pase todo el equipo.","Todo el grupo en fila india y con los ojos tapados menos el ultimo. El ultimo les ha de guiar, pero sin hablar. Un golpe en el hombro derecho significa girar a la derecha. Un golpe en el hombro izquierdo significa girar a la izquierda. Un golpe en la cabeza significa ir hacia delante. Deben pasarse las senales desde el ultimo hasta el que va en cabeza.","Todo el equipo corre agarrado a una larga cuerda en fila india y sin soltarse. La llegada a la meta se cuenta con el tiempo del ultimo que ha entrado.","Se prepara de antemano un recorrido lleno de obstaculos (troncos, piedras, charcos...), que deben de recorrer los jugadores. Si pierden el equilibrio y ponen un pie en tierra, vuelven a comenzar el recorrido.", "Se coloca un numero determinado de patatas en fila y a una distancia de unos 2 metros cada una. Se coloca tambien un cesto a unos 10 metros de la primera patata. Cada jugador dispondra de su fila y de su cesto. Se trata de meter todas las patatas de cada dila en su cesto correspondiente trayendo en cada viaje solo una patata.","Se forman grupos de tres jugadores. Se les pone en fila de tal manera que el del centro este en direccion opuesta a los otros dos. Los tres componentes de cada equipo se atan las piernas de la siguiente manera: la pierna izquierda del de la izquierda con la izquierda del otro (el del centro) y la pierna derecha del de la derecha con la derecha del que esta en el centro. Una vez que esten asi atados se da la senal de comienzo y los grupos se lanzan como pueden hacia la meta.","Se coloca cada equipo en fila uno detras de otro. El primero pasa la mano derecha entre sus piernas para tomar la mano izquierda de su companero de atras. El segundo, de igual modo, pasa su mano derecha por entre sus piernas, para tomar la mano izquierda del companero de atras. Todos colocados en esta posicion, comienza la carrera.","Sale el primer concursante de cada equipo y llega hasta el lugar en donde se hallan unos panuelos en el suelo. Se agacha y coge uno con la boca y lo trae hasta donde estan los de su equipo. El siguiente participante le releva cogiendole el panuelo con la boca y corriendo a dejarlo en donde lo cogio. Se repite hasta que pasen todos. Las manos no pueden intervenir.", "Este juego es por equipos. Se usaran dos cubos, uno de los cuales estara lleno hasta la mitad de agua. El primero del equipo ira a la zona donde estan los cubos. Pasara el agua de uno a otro y le llevara el lleno al siguiente, que hara lo mismo. Gana el equipo que tenga mas agua."};
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, cosasPorHacer);

        // C. Seleccionamos la lista de nuestro layout
        ListView listado = (ListView) rootView.findViewById(R.id.listado);

        // D. Asignamos el adaptador a nuestra lista
        listado.setAdapter(arrayAdapter);
        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), listaContenido3.class);
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


