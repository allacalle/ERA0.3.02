package net.allacalle.android.era030.Test.TestResultados;

import android.content.Context;
import android.test.InstrumentationTestCase;

import net.allacalle.android.era030.Formula;

/**
 * Created by Alfonso on 06/05/2016.
 */
public class TestAguaLibreExceso extends InstrumentationTestCase {

    public void testResultadoAguaLibreExceso () throws Exception
    {
        double expected ;
        double reality ;
        String idFormula ="";
        idFormula = "11";
        //IMPORTANTE como llamar al contexto desde el TEST
        Context context = this.getInstrumentation().getTargetContext().getApplicationContext();
        final Formula formulaActual = new Formula(idFormula, context);


        //Asignamos los valores que se han introducido por la pantalla

        //Que usa el siguiente vector 80,60,136
        String vectorResultados [] = new String[3];
        vectorResultados[0] = "60";
        vectorResultados[1] = "80";
        vectorResultados[2] = "136";

        formulaActual.introducirValoresFormula(vectorResultados);

        formulaActual.calcularFormula();

        expected = 1.37;
        reality = Float.parseFloat(formulaActual.getResultado().getValor()) ;

        //Ahora lo redondeamos para que sea como expected
        reality = Math.round(reality*100.0)/100.0;

        assertEquals(expected, reality);
    }
}
