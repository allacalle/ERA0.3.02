package net.allacalle.android.era030.Test.TestResultados;

import android.content.Context;
import android.test.InstrumentationTestCase;

import net.allacalle.android.era030.Formula;

/**
 * Created by Alfonso on 09/05/2016.
 */
public class TestCloroDeficit extends InstrumentationTestCase {

    public void testResultadoCloroDeficit () throws Exception
    {
        double expected ;
        double reality ;
        String idFormula ="";
        idFormula = "13";
        //IMPORTANTE como llamar al contexto desde el TEST
        Context context = this.getInstrumentation().getTargetContext().getApplicationContext();
        final Formula formulaActual = new Formula(idFormula, context);


        //Asignamos los valores que se han introducido por la pantalla

        //Que usa el siguiente vector 80,60,136
        String vectorResultados [] = new String[4];
        vectorResultados[0] = "75";
        vectorResultados[1] = "102";
        vectorResultados[2] = "99";
        vectorResultados[3]= "50";

        formulaActual.introducirValoresFormula(vectorResultados);

        formulaActual.calcularFormula();

        expected =112.5;
        reality = Float.parseFloat(formulaActual.getResultado().getValor()) ;

        //Ahora lo redondeamos para que sea como expected
        reality = Math.round(reality*100.0)/100.0;

        assertEquals(expected, reality);
    }
}
