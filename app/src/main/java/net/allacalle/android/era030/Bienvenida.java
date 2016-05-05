package net.allacalle.android.era030;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Bienvenida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        //Mensaje de bienvenida e instrucciones basicas.

        //Si es la primera vez que se carga la aplicación esta pantalla debe mostrar un mensaje que ayude en su uso:

        //Por ejemplo podrian salir una seria de distintas pantallas al pulsar un boton que fueran explicando el funcionamiento
        //de la aplicacion

        /*LLegaremos a esta pantalla despues de haber ejecutado la App por primera vez , despues de varios mensajes que pueden
        ir en diferentes pantallas de la aplicación la app nos deberia llevar a la pantalla de Encuesta

        //Un ejemplo de una formua de guiar al usuario podría ser:

        1. Damos la bienvenida al usuario con un mensaje corto y mostramos un boton que al pulsarlo pasa a otro pantalla.
        2. En esta segunda pantalla explicamos un poco lo que es la APP pero de una forma muy generica. Pulsando
        otro boton vamos a otra pantalla.
        3. En esta pantalla explicamos el sistema de colores utilizado en urgencias.
        4. En esta pantalla explicamos como va a ser el proceso de la encuesta (Podemos poner varias pantallas con ejemplos).
        5. En la pantalla anterior ponemos 2 botones uno que explique ese pequeño tutorial y otro que lleve directamente a la encuesta.
        6. Mandamos al usuario a la encuesta.

        */



    }

}
