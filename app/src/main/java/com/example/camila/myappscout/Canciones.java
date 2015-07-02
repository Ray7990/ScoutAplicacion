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

public class Canciones extends Fragment {
        View rootView;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
                rootView = inflater.inflate(R.layout.fragment_canciones, container, false);


                final String[] cosasPorHacer3 = new String[] { "cancion1", "cancion2","cancion1","cancion2", "cancion2","cancion1","cancion2","cancion1","cancion2"};

                final String[] cosasPorHacer = new String[]{"Siempre Lista", "Avanzan las Patrullas", "Todo el movimiento Baila", "La Canoa", "Buscar en la Manada", "Cancion de la promesa", "Yo soy Scout", "Kumbayah", "Viejo Uniforme", "No solo es ser Rover"};

                final String[] cosasPorHacer2 = new String[]{"\n\nSiempre lista hermana Guia\n\n" + "es el deber nuestra mision\n "+
                        "\n" +
                                " ser la luz que brilla y brilla\n "+
                        "\n" +
                                "por la Patria y el honor.\n" +
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
                                "para poder asi siempre dar.\n\n",

                        "\n\nAvanzan las Patrullas\n\n" +

                                "Avanzan las patrullas a lo lejos adelante.\n" +
                                "\n" +
                                "Avanzan las patrullas, al toque del tambor.\n" +
                                "\n" +
                                "Juntos escalemos la montana altiva.\n" +
                                "\n" +
                                "Juntos escalemos el picacho azul. \n" +
                                "\n" +
                                "Solo los halcones sobre nuestras frentes \n" +
                                "\n" +
                                "vuelan majestuosos sobre el cielo azul. \n" +
                                "\n" +
                                "Avanzan las patrullas a lo lejos adelante. \n" +
                                "\n" +
                                "Avanzan las patrullas, al toque del tambor. \n" +
                                "\n" +
                                "Juntos escalemos la montana altiva. \n" +
                                "\n" +
                                "Juntos escalemos el picacho azul. \n" +
                                "\n" +
                                "Solo los halcones sobre nuestras frentes \n" +
                                "\n" +
                                "vuelan majestuosos sobre el cielo azul. \n" +
                                "\n" +
                                "(igual que antes y todo asi) \n" +
                                "\n" +
                                "Con el morral al hombro a lo lejos adelante. \n" +
                                "\n" +
                                "Con el morral al hombro al toque del tambor. \n" +
                                "\n" +
                                "Juntos escalemos la montana altiva. \n" +
                                "\n" +
                                "Juntos escalemos el picacho azul. \n" +
                                "\n" +
                                "Solo los halcones sobre nuestras frentes \n" +
                                "\n" +
                                "vuelan majestuosos sobre el cielo azul. \n" +
                                "\n" +
                                "Las carpas se divisan a lo lejos adelante. \n" +
                                "\n" +
                                "Las carpas se divisan al toque del tambor. \n" +
                                "\n" +
                                "Juntos escalemos la montana altiva. \n" +
                                "\n" +
                                "Juntos escalemos el picacho azul. \n" +
                                "\n" +
                                "Solo los halcones sobre nuestras frentes \n" +
                                "\n" +
                                "vuelan majestuosos sobre el cielo azul.\n\n",


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
                                "Con el dedo, dedo  con el otro dedo\n" +
                                "\n" +
                                "Con la mano, mano con la otra mano\n" +
                                "\n" +
                                "Con el pie, pie con el otro pie\n" +
                                "\n" +
                                "Con el codo, codo con el otro codo, \n\n",


                        "\n\nLa Canoa\n\n" +
                                "Eh!, Oh! \n" +
                                "\n" +
                                "Yo remando \n" +
                                "\n" +
                                "voy \n" +
                                "\n" +
                                "Por el rio \n" +
                                "\n" +
                                "mi canoa \n" +
                                "\n" +
                                "va \n" +
                                "\n" +
                                "En las tardes \n" +
                                "\n" +
                                "tristes \n" +
                                "\n" +
                                "por la selva \n" +
                                "\n" +
                                "voy \n" +
                                "\n" +
                                "voy \n" +
                                "\n" +
                                "voy \n" +
                                "\n" +
                                "Eo...se repite,\n\n",


                        "\n\nBuscar en la Manada\n\n" +
                                "Buscad en la manada, \n" +
                                "\n" +
                                "valor y alegria, \n" +
                                "\n" +
                                "buscad en la manada, \n" +
                                "\n" +
                                "Siempre lo mejor. \n" +
                                "\n" +
                                "Todo por amor, \n" +
                                "\n" +
                                "nada por la fuerza, \n" +
                                "\n" +
                                "Siempre lo mejor, \n" +
                                "\n" +
                                "Siempre lo mejor. \n" +
                                "\n" +
                                "Mirad que el lobo arisco, \n" +
                                "\n" +
                                "domo San Francisco, \n" +
                                "\n" +
                                "corramos al aprisco \n" +
                                "\n" +
                                "de Nuestro Senor. \n" +
                                "\n" +
                                "Todo por amor, \n" +
                                "\n" +
                                "nada por la fuerza, \n" +
                                "\n" +
                                "Siempre lo mejor, \n" +
                                "\n" +
                                "Siempre lo mejor. \n" +
                                "\n" +
                                "Escucha al viejo lobo, \n" +
                                "\n" +
                                "no te hagas el bobo, \n" +
                                "\n" +
                                "escucha al viejo lobo, \n" +
                                "\n" +
                                "para ser mejor. \n" +
                                "\n" +
                                "Todo por amor, \n" +
                                "\n" +
                                "nada por la fuerza, \n" +
                                "\n" +
                                "Siempre lo mejor, \n" +
                                "\n" +
                                "Siempre lo mejor. \n" +
                                "\n" +
                                "Juntemos las seisenas, \n" +
                                "\n" +
                                "formando cadenas, \n" +
                                "\n" +
                                "las almas que son buenas, \n" +
                                "\n" +
                                "buscan lo mejor. \n" +
                                "\n" +
                                "Todo por amor, \n" +
                                "\n" +
                                "nada por la fuerza, \n" +
                                "\n" +
                                "Siempre lo mejor, \n" +
                                "\n" +
                                "Siempre lo mejor. \n" +
                                "\n" +
                                "Akela nos ensena, \n" +
                                "\n" +
                                "subido en la pena, \n" +
                                "\n" +
                                "el lobo que se empena, \n" +
                                "\n" +
                                "logra lo mejor. \n" +
                                "\n" +
                                "Todo por amor, \n" +
                                "\n" +
                                "nada por la fuerza, \n" +
                                "\n" +
                                "Siempre lo mejor, \n" +
                                "\n" +
                                "Siempre lo mejor\n\n",




                        "\n\nCancion de la promesa\n\n" +
                                "A Dios Jefe supremo, de esta legion \n" +
                                "\n" +
                                "Alma y vida ofrecemos, de corazon. \n" +
                                "\n" +
                                "(saludando y con una mano extendida) \n" +
                                "\n" +
                                "juro serte leaaal senoor y rey \n" +
                                "\n" +
                                "sirviendo a ideal de nuestra ley \n" +
                                "\n" +
                                "La Promesa que un dia, hice ante Ti \n" +
                                "\n" +
                                "Para toda la vida, la prometi. \n" +
                                "\n" +
                                "(saludando y con una mano extendida) \n" +
                                "\n" +
                                "juro serte leaaal senoor y rey \n" +
                                "\n" +
                                "sirviendo a ideal de nuestra ley \n" +
                                "\n" +
                                "Mi Fe me enorgullese, quiero servir, \n" +
                                "\n" +
                                "Tal como se merece, hasta morir. \n" +
                                "\n" +
                                "(saludando y con una mano extendida) \n" +
                                "\n" +
                                "juro serte leaaal senoor y rey \n" +
                                "\n" +
                                "sirviendo a ideal de nuestra ley \n" +
                                "\n" +
                                "Fiel a mi Paria amada, siempre sere, \n" +
                                "\n" +
                                "Con alma apacionada, la servire. \n" +
                                "\n" +
                                "(saludando y con una mano extendida) \n" +
                                "\n" +
                                "juro serte leaaal senoor y rey \n" +
                                "\n" +
                                "sirviendo a ideal de nuestra ley, \n\n",





                        "\n\nYo soy Scout\n\n" +

                                "Yo soy scout, (bis)\n" +
                                "\n" +
                                "de corazon, (bis) \n" +
                                "\n" +
                                "y acampare, (bis) \n" +
                                "\n" +
                                "con ilusion !! (bis) \n" +
                                "\n\n" +
                                "Al monte ire, (bis) \n" +
                                "\n" +
                                "lo escalare, (bis) \n" +
                                "\n" +
                                "nudos are, (bis) \n" +
                                "\n" +
                                "con presicion !! (bis) \n" +
                                "\n\n" +
                                "Me tirare, (bis) \n" +
                                "\n" +
                                "desde un avion, (bis) \n" +
                                "\n" +
                                "y volare, (bis) \n" +
                                "\n" +
                                "como un halcon !! (bis) \n" +
                                "\n\n" +
                                "Al lago ire, (bis) \n" +
                                "\n" +
                                "me banare, (bis) \n" +
                                "\n" +
                                "y nadare, (bis) \n" +
                                "\n" +
                                "como un salmon !! (bis) \n" +
                                "\n\n" +
                                "Cocinare, (bis) \n" +
                                "\n" +
                                "en un gran fogon, (bis) \n" +
                                "\n" +
                                "y a Dios dare, (bis) \n" +
                                "\n" +
                                "mi corazon !! (bis) \n" +
                                "\n\n" +
                                "Promesa y Ley, (bis) \n" +
                                "\n" +
                                "yo cumplire, (bis) \n" +
                                "\n" +
                                "la Buena Accion, (bis) \n" +
                                "\n" +
                                "yo siempre are !! (bis) \n" +
                                "\n\n" +
                                "Y aqui termina, (bis) \n" +
                                "\n" +
                                "esta cancion, (bis) \n" +
                                "\n" +
                                "que de un scout, (bis) \n" +
                                "\n" +
                                "de corazon !! (bis)\n\n" ,


                        "\n\nKumbayah\n\n"+

                        "Kumbaya, Senor, Kumbaya!\n" +
                                "\n" +
                                "Kumbaya, Senor, Kumbaya \n" +
                                "\n" +
                                "Kumbaya, Senor, Kumbaya \n" +
                                "\n" +
                                "O, Senor! Kumbaya!\n" +
                                "\n\n" +
                                "Oyeme llorar, Senor, Kumbaya!\n" +
                                "\n" +
                                "Oyeme llorar, Senor, Kumbaya!\n" +
                                "\n" +
                                "Oyeme llorar, Senor, Kumbaya!\n" +
                                "\n" +
                                "O, Senor! Kumbaya!\n" +
                                "\n\n" +
                                "Oyeme cantar, Senor, Kumbaya!\n" +
                                "\n" +
                                "Oyeme cantar, Senor, Kumbaya!\n" +
                                "\n" +
                                "Oyeme cantar, Senor, Kumbaya!\n" +
                                "\n" +
                                "O, Senor! Kumbaya!\n" +
                                "\n\n" +
                                "Oyeme rezar, Senor, Kumbaya!\n" +
                                "\n" +
                                "Oyeme rezar, Senor, Kumbaya!\n" +
                                "\n" +
                                "Oyeme rezar, Senor, Kumbaya!\n" +
                                "\n" +
                                "O, Senor! Kumbaya!\n" +
                                "\n\n" +
                                "O, te necesito, Senor, Kumbaya!\n" +
                                "\n" +
                                "O, te necesito, Senor, Kumbaya!\n" +
                                "\n" +
                                "O, te necesito, Senor, Kumbaya!\n" +
                                "\n" +
                                "O, Senor! Kumbaya!\n\n",

                        "\n\nViejo Uniforme\n\n"+

                        "Viejo uniforme \n" +
                                "\n" +
                                "cuanto tiempo ha pasado,\n" +
                                "\n" +
                                " cuantos recuerdos \n" +
                                "\n" +
                                "haces tu revivir, \n" +
                                "\n" +
                                "cuantas canciones \n" +
                                "\n" +
                                "paso a paso he cantado,\n" +
                                "\n" +
                                " que no olvidare. \n" +
                                "\n\n" +
                                "Coro: \n" +
                                "\n" +
                                "Subiendo las altas cumbres \n" +
                                "\n" +
                                "por los caminos \n" +
                                "\n" +
                                "que besa el sol, \n" +
                                "\n" +
                                "mil flores desconocidas, \n" +
                                "\n" +
                                "me acariciaban \n" +
                                "\n" +
                                "sin hacer rumor. \n" +
                                "\n\n" +
                                "Sobre las dunas \n" +
                                "\n" +
                                "del desierto infinito, \n" +
                                "\n" +
                                "sobre las olas \n" +
                                "\n" +
                                "del ceruleo mar, \n" +
                                "\n" +
                                "siempre contigo \n" +
                                "\n" +
                                "incansable he marchado, \n" +
                                "\n" +
                                "sin desesperar. \n\n",

                        "\n\nNo solo es ser Rover\n\n"+

                        "El viento en la cara y una sensacion de soledad \n" +
                "\n" +
                        "El frio en el cuerpo y un recuerdo de fraternidad \n" +
                        "\n" +
                        "Hoy voy cruzando esa linea que queda entre la vida y la verdad \n" +
                        "\n" +
                        "Un pensamiento viene, grita y grita una vez mas. \n" +
                        "\n" +
                        "No solo es ser Rover \n" +
                        "\n" +
                        "Necesitas de un poco mas \n" +
                        "\n" +
                        "No pierdas la fe, la esperanza y las ganas de volar \n" +
                        "\n" +
                        "La vida es un reto, solo tu lo podras lograr \n" +
                        "\n" +
                        "No cedas aun falta mas \n" +
                        "\n\n" +
                        "La tormenta es dura, pero la jornada hay que acabar \n" +
                        "\n" +
                        "Sin fuerzas en los brazos y las piernas no dan mas \n" +
                        "\n" +
                        "Hoy voy quitando esa duda de aventurarme y no quedarme atras\n" +
                        "\n" +
                        "Divisas ya tu meta, corre, corre sin parar \n" +
                        "\n\n" +
                        "No solo es ser Rover \n" +
                        "\n" +
                        "Necesitas de un poco mas \n" +
                        "\n" +
                        "No pierdas la fe, la esperanza y las ganas de volar \n" +
                        "\n" +
                        "La vida es un reto, solo tu lo podras lograr \n" +
                        "\n" +
                        "No cedas aun falta mas \n" +
                        "\n\n" +
                        "Una mano, un hermano, un amigo \n" +
                        "\n" +
                        "Encontraras en tu destino \n" +
                        "\n" +
                        "Lucha, canta, grita, espanta \n" +
                        "\n" +
                        "Todo aquello que amenazaria hoy en dia \n" +
                        "\n" +
                        "Toma ya todas tus fuerzas \n" +
                        "\n" +
                        "Deja atras toda pereza, mira al cielo \n" +
                        "\n" +
                        "Lucha, avanza, danza amigo \n" +
                        "\n" +
                        "Que este clan siempre estara conmigo, amigo. \n" +
                        "\n\n" +
                        "No solo es ser Rover \n" +
                        "\n" +
                        "Necesitas de un poco mas \n" +
                        "\n" +
                        "No pierdas la fe, la esperanza y las ganas de volar \n" +
                        "\n" +
                        "La vida es un reto, solo tu lo podras lograr \n" +
                        "\n" +
                        "No cedas aun falta mas\n\n"

                };



                ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1, cosasPorHacer);

                // C. Seleccionamos la lista de nuestro layout
                ListView listado = (ListView) rootView.findViewById(R.id.listado);

                // D. Asignamos el adaptador a nuestra lista
                listado.setAdapter(arrayAdapter);
                listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                Intent intent = new Intent(getActivity(), listaContenido.class);
                                intent.putExtra("contenido",cosasPorHacer2[position]);
                                intent.putExtra("nombre",cosasPorHacer[position]);
                                intent.putExtra("cancion",cosasPorHacer3[position]);
                                startActivity(intent);

                                //Toast.makeText(getActivity(), "Hiciste click en el numero " + position,
                                        //Toast.LENGTH_LONG).show();
                        }
                });
                return rootView;


        }


}