package net.allacalle.android.era030.Test.TestResultados;

import android.content.Context;
import android.test.InstrumentationTestCase;

import net.allacalle.android.era030.Formula;

/**
 * Created by Alfonso on 09/05/2016.
 */
public class TestDosisDeInsulina extends InstrumentationTestCase {

    public void testResultadoTensionInspiradaDeOxigeno () throws Exception
    {
        double expected ;
        double reality ;
        String idFormula ="";
        idFormula = "22";
        //IMPORTANTE como llamar al contexto desde el TEST
        Context context = this.getInstrumentation().getTargetContext().getApplicationContext();
        final Formula formulaActual = new Formula(idFormula, context);


        //Asignamos los valores que se han introducido por la pantalla

        //Que usa el siguiente vector
        String vectorResultados [] = new String[2];
        vectorResultados[0] = "75";
        vectorResultados[1] = "132";


        formulaActual.introducirValoresFormula(vectorResultados);

        formulaActual.calcularFormula();

        expected =22.5;
        reality = Float.parseFloat(formulaActual.getResultado().getValor()) ;

        //Ahora lo redondeamos para que sea como expected
        reality = Math.round(reality*100.0)/100.0;

        assertEquals(expected, reality);
    }

}
