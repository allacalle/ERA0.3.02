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

public class FormulasPrioridad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulas_alta_prioridad);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
        //Construimos el mensaje a mostrar
        final String valorRecibido = bundle.getString("Prioridad");

        //Primero se debe abrir la base de datos
        FormulasSQLiteHelper usdbh =
                new FormulasSQLiteHelper(this, "DbEra", null, 1);

        SQLiteDatabase db = usdbh.getWritableDatabase();

        LinearLayout lm = (LinearLayout) findViewById(R.id.LytContenedor);

        Cursor cursorPrioridad = null;

        switch (valorRecibido)
        {
            case "Alta":
                 cursorPrioridad = db.rawQuery(" SELECT F.IdFormula,F.Abreviatura  FROM Formulas F,Prioridad P WHERE F.IdFormula = P.IdFormula AND P.Tipo ='Alta' ", null);
                 break;
            case "Media":
                 cursorPrioridad = db.rawQuery(" SELECT F.IdFormula,F.Abreviatura  FROM Formulas F,Prioridad P WHERE F.IdFormula = P.IdFormula AND P.Tipo ='Media' ", null);
                break;
            case "Baja" :
                 cursorPrioridad = db.rawQuery(" SELECT F.IdFormula,F.Abreviatura  FROM Formulas F,Prioridad P WHERE F.IdFormula = P.IdFormula AND P.Tipo ='Baja' ", null);
                break;


        }



        //Hacemos una consulta para obtener todas las Ids cuya prioridad es alta cursorAlta

        //utilizamos la propiedad JOIN para hacer una consulta sobre 2 tablas que tienen un valor en comun, en este caso la IdFormula
        //Cursor cursorAlta = db.rawQuery(" SELECT F.IdFormula,F.Abreviatura  FROM Formulas F,Prioridad P WHERE F.IdFormula = P.IdFormula AND P.Tipo ='Alta' ", null);
        //Cursor cursorAlta = db.rawQuery("SELECT * FROM Formulas",null);
        cursorPrioridad.moveToFirst();

        //Contamos el numero de formulas
        int numeroFormulas;
        numeroFormulas = cursorPrioridad.getCount();



        for( int i=0; i < numeroFormulas; i++ )
        {
            final Button boton = new Button(this);
            boton.setText(cursorPrioridad.getString(1));
            boton.setId(cursorPrioridad.getInt(0));
            cursorPrioridad.moveToNext();
            lm.addView(boton);

            boton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Creamos el Intent
                    Intent intent =
                            new Intent(FormulasPrioridad.this, CalcularFormula.class);

                    //Creamos la información a pasar entre actividades
                    Bundle b = new Bundle();
                    String cadenaId= "";
                    cadenaId = cadenaId + boton.getId() ;
                    //Vamos a pasar el identificador de la formula que es un campo unico .
                    b.putString("IdFormula", cadenaId );

                    //Añadimos la información al intent
                    intent.putExtras(b);

                    //Iniciamos la nueva actividad
                    startActivity(intent);

                }
            });



        }



    }

    //Esta es una pagina filstrada que mostrara una lista de todas las formulas cuya prioridad es Alta

    //Sera una lista de botones que al pulsarlo te llevaran a la formula en si, la pantalla debe ser intuitiva y sin muchas
    // mas elementos que puedan confundir al usuario.






    //Hacemos una consulta de todas las formulas  cursorFormulas

    //Creamos un boton para cada formula

    //Al pulsar en el boton nos llevara a la formula cuyo nombre tiene (el identificador del boton deberia ser el IdFormula





}

