package net.allacalle.android.era030.Test.TestResultados;

import android.content.Context;
import android.test.InstrumentationTestCase;

import net.allacalle.android.era030.Formula;

/**
 * Created by Alfonso on 09/05/2016.
 */
public class TestGastoEnergiaBasal extends InstrumentationTestCase
{
    public void testResultadoGastoEnergiaBasal () throws Exception
    {
        double expected ;
        double reality ;
        String idFormula ="";
        idFormula = "15";
        //IMPORTANTE como llamar al contexto desde el TEST
        Context context = this.getInstrumentation().getTargetContext().getApplicationContext();
        final Formula formulaActual = new Formula(idFormula, context);


        //Asignamos los valores que se han introducido por la pantalla

        //Vamos a introducir los parametros de un hombre y comprobamos que sea lo correcto

        //Que usa el siguiente vector
        String vectorResultados [] = new String[4];
        vectorResultados[0] = "96";
        vectorResultados[1] = "185";
        vectorResultados[2] = "33";
        vectorResultados[3] = "129";

        formulaActual.introducirValoresFormula(vectorResultados);

        formulaActual.calcularFormula();

        expected =2088.39;
        reality = Float.parseFloat(formulaActual.getResultado().getValor()) ;

        //Ahora lo redondeamos para que sea como expected
        reality = Math.round(reality*100.0)/100.0;

        assertEquals(expected, reality);

        //Vamos a introducir los parametros de una mujer y comprobamos que sea lo correcto

        //Que usa el siguiente vector
        vectorResultados[0] = "56";
        vectorResultados[1] = "160";
        vectorResultados[2] = "24";
        vectorResultados[3] = "130";

        formulaActual.introducirValoresFormula(vectorResultados);

        formulaActual.calcularFormula();

        expected =784.55 ;
        reality = Float.parseFloat(formulaActual.getResultado().getValor()) ;

        //Ahora lo redondeamos para que sea como expected
        reality = Math.round(reality*100.0)/100.0;

        assertEquals(expected, reality);

    }

}
