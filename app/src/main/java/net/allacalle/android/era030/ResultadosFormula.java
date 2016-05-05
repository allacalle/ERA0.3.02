package net.allacalle.android.era030;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ResultadosFormula extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados_formula);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final LinearLayout lm = (LinearLayout) findViewById(R.id.LytContenedor);

        //Lo primero es capturar la abreviatura de la formula que se nos pasa en un bundle
        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
        //Construimos el mensaje a mostrar
        final String valorRecibido = bundle.getString("Resultado");

        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT, 1.0f);

        //Cosas que tener en cuenta IMPORTANTES.
        //El primer campo de la cadena SIEMPRE sera el identificador de la formula (necesario para crearla)
        //Los valores de tipo numero seran el numero directamente.
        //Los valores de tipo lista seran el Id del criterio de puntuacion
        //Los valores de tipo logico seran 1 si esta marcado o 0 sino esta marcado.
        //mensaje.setText(cadena);

        TextView textoPrueba = new TextView(this);
        textoPrueba.setText(valorRecibido);
        lm.addView(textoPrueba);
        //Convertimo la cadena recibida en un vector de resultados para poder trabajar con el
        String vectorResultados[] = valorRecibido.split(";");
        String cadenaPrueba = "";

        //Cogemos el primer campo que sera el id de la forumula con la que estamos trabajando
        String idFormula = vectorResultados[0];
        //creamos la formula.
        final Formula formulaActual = new Formula(idFormula, getApplicationContext());
        //Ya consegui la de la formula asi que voy a eliminar el campo 0 del vector




        //Desplazamos todos los elementos uno a la izquierda
        for(int i =0; i < vectorResultados.length -1; i++)
        {
            vectorResultados[i] = vectorResultados[i+1];

        }
        TextView labelTextoRecibidos = new TextView(this);
        labelTextoRecibidos.setText("Valores recibidos desde el formulario");
        labelTextoRecibidos.setLayoutParams(param);
        labelTextoRecibidos.setTextSize(30);
        lm.addView(labelTextoRecibidos);

        //Mostramos el nombre de los parametros con sus valores recibidos
        for (int i =0 ;i < formulaActual.contarParametros(); i++)
        {
            LinearLayout layoutDeParametro = new LinearLayout(this);
            TextView labelNombre = new TextView(this);
            labelNombre.setText(formulaActual.getParametro(i).getNombre() + ": ");
            layoutDeParametro.addView(labelNombre);
            TextView labelValor = new TextView(this);
            labelValor.setText(vectorResultados[i]);
            layoutDeParametro.addView(labelValor);
            lm.addView(layoutDeParametro);
        }

        TextView labelTextoCalcular = new TextView(this);
        labelTextoCalcular.setText("Valores necesarios para hacer el calculo ");
        labelTextoCalcular.setLayoutParams(param);
        labelTextoCalcular.setTextSize(30);
        lm.addView(labelTextoCalcular);
        formulaActual.introducirValoresFormula(vectorResultados);



            //Asignamos cada uno de los valores al campo valor de sus respectivos parametros.
        /*

        for (int i =0 ;i < formulaActual.contarParametros(); i++)
        {

            //El valor del parametro dependera del tipo de este.
            //Tipo numero: El valor es el numero que se necesita para calcular la formula.
            //Tipo lista: Es el identificador del criterio de puntuacion que contiene el valor del parametro
            //Tipo logico: Si es 1 significa que esta checked si es 0 significa que no lo esta. En caso de estar chequeado
            //el valor del parametro sera el valor del criterio que tenga el idParametro de este campo.

            int posicionCriterio;
            String  valorCriterio;


            switch (formulaActual.getParametro(i).getTipo())
            {
                case ("numero"):
                    formulaActual.getParametro(i).setValor(vectorResultados[i]);
                    if (formulaActual.getTipoFormula().equals("escala"))
                      formulaActual.getParametro(i).setValor(formulaActual.getParametro(i).evaluarPuntuacion(vectorResultados[i]));

                    break;
                case ("lista"):
                    //Buscamos la posicion del criterio de puntuacion
                    posicionCriterio = formulaActual.getParametro(i).buscarPosicionDeCriterio(Integer.parseInt(vectorResultados[i])) ;
                    valorCriterio = formulaActual.getParametro(i).getCriterioPuntuacion(posicionCriterio).getPuntuacion() ;
                    formulaActual.getParametro(i).setValor(valorCriterio);
                    //Si la formula general este seleccionable es el que crea la expresion.
                    if (formulaActual.getTipoFormula().equals("general"))
                        formulaActual.setExpresion(valorCriterio);

                    break;
                case ("logico"):
                    if (vectorResultados[i].equals("1") )
                    {
                        posicionCriterio = formulaActual.getParametro(i).buscarPosicionDeCriterio();
                        valorCriterio = formulaActual.getParametro(i).getCriterioPuntuacion(posicionCriterio).getPuntuacion() ;
                        formulaActual.getParametro(i).setValor(valorCriterio);
                    }
                    else
                        formulaActual.getParametro(i).setValor("0");
                    break;
            }
        }
    */

        cadenaPrueba ="";

        //Vamos a recorrer todos los parametros para ver si los resultados han sido introducidos correctamente.
       for(int i =0; i < formulaActual.contarParametros(); i++)
       {
           cadenaPrueba = cadenaPrueba + formulaActual.getParametro(i).getNombre() + ": " + formulaActual.getParametro(i).getValor() + "\n";
       }

        //Por ultimo calculamos la formula
        formulaActual.calcularFormula();

        TextView textoResultado = new TextView(this);
        textoResultado.setText(cadenaPrueba  + "\n Su resultado es \n" + formulaActual.getResultado().getValor());
        textoResultado.setTextSize(30);
        lm.addView(textoResultado);

        /* Despues de introducir los valores podemos decir que
         - Para formulas generales:
            - Tipo numero: Son los valores que se aplicarán a los parametros para resolver la formula.
                - Para resolver esto debemos recorrer todos los criterios de este parametro y ejecutar el criterio con el valor
                actual del parametro. En el criterio que se cumpla True significa que lo satisface entonces cogeremos esa puntuacion.
            - Tipo lista: Si existe algun valor de este tipo esta es la cadena que contiene la expresion de la formula.
                - El valor de expresion sera el valor de este parametro

         - Para formulas escala:
            - Tipo numero: Debemos buscar la puntuación para este valor.
            - Tipo lista: Tenemos la puntuación del valor.
            - Tipo logico: Tenemos la puntuación del valor

         */


        //Llamamos al metodo calcular de la clase formula.








    }

}

//Aqui se mostrara los valores de los parametros introducidos

//Es ent esta pagina donde realmente se realizaran los calculos de las formulas leyendo el vector con los valores primero






