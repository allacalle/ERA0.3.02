package net.allacalle.android.era030;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


/*En esta pantalla aparecera un resumen de los datos elegidos en la encuesta.

//Se explicara un poco mas al usuario como estos datos van a influir en la app y como se puede cambiar luego.

//El usuario podra aceptar los cambios o volver a la pantalla anterior para modificarlos.

// Una vez acepte los cambios llegara a la pagina de Inicio de la APP  ocn los botones de alta,media, baja.

*/


public class ResultadosEncuesta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados_encuesta);
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


        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
        //Construimos el mensaje a mostrar
        final String valorRecibido = bundle.getString("NOMBRE");
        //creamos el layout dinamico como pros!
        final LinearLayout lm = (LinearLayout) findViewById(R.id.LytContenedor);
        TextView texto = new TextView(this);
        texto.setText(valorRecibido);
        lm.addView(texto);

        //Tenemos que abrir la base de datos
        FormulasSQLiteHelper usdbh =
                new FormulasSQLiteHelper(this, "DbEra", null, 1);
        final SQLiteDatabase db = usdbh.getWritableDatabase();

        //Si existen datos en la tabla prioridad los borramos todos
        db.execSQL("Delete  FROM Prioridad Where IdPrioridad >= 0");

        //Hacer una consulta de las formulas exactamente igual que en la pantalla de encuesta
        final Cursor identificadores = db.rawQuery(" SELECT  IdFormula,Abreviatura FROM Formulas", null);
        identificadores.moveToFirst();
        final int numeroFormulas;
        numeroFormulas = identificadores.getCount();


        //Meter la cadena de la encuesta en un vector utilizando la funcion split ','
        final String[] prioridad =  valorRecibido.split(",");

        /*
        String cadenaAuxiliar="";

        //Vamos a mostrar el vector para ver si coincide
        for(int i =0; i< numeroFormulas; i++)
        {
            cadenaAuxiliar = cadenaAuxiliar + prioridad + ", " ;
        }

        TextView texto2 = new TextView(this);
        texto2.setText(valorRecibido);
        lm.addView(texto2);
        */

        //Mostramos al usuario los valores que ha elegido para cada formula


        String cadenaAuxiliar="";
        for(int i =0; i< numeroFormulas; i++)
        {
            cadenaAuxiliar = identificadores.getString(1) + " con Prioridad: " +prioridad[i] ;
            TextView textoFormulas = new TextView(this);
            textoFormulas.setText(cadenaAuxiliar);
            lm.addView(textoFormulas);
            identificadores.moveToNext();
        }


        //Creamos dos botones uno para volver a la pantalla anterior y otro para aceptar las formulas
        Button btnRegresar = new Button(this);
        btnRegresar.setText("Regresar");
        lm.addView(btnRegresar);

        Button btnAceptar = new Button(this);
        btnAceptar.setText("Aceptar Encuesta");
        lm.addView(btnAceptar);


        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(ResultadosEncuesta.this, Encuesta.class);

                //Creamos la información a pasar entre actividades
                //Bundle b = new Bundle();
                //b.putString("NOMBRE", (String) boton.getText());

                //Añadimos la información al intent
                //intent.putExtras(b);

                //Iniciamos la nueva actividad
                startActivity(intent);

            }
        });

        //Si pulsamos el boton de aceptar los resultados
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el Intent
                Intent intent =
                        new Intent(ResultadosEncuesta.this, Inicio.class);


                identificadores.moveToFirst();
                for(int i=0; i < numeroFormulas; i++)
                {
                    db.execSQL("INSERT INTO Prioridad (IdPrioridad,IdFormula,Tipo) VALUES('" + i + "','" + identificadores.getInt(0) + "','" + prioridad[i] + "')");
                    identificadores.moveToNext();
                }

                //Iniciamos la nueva actividad
                startActivity(intent);

            //En la tabla Prioridad Metemos la id de la formula y su valor de prioridad.

            }
        });


    }

}





