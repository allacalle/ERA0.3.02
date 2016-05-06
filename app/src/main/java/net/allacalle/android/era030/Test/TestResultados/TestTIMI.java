package net.allacalle.android.era030.Test.TestResultados;

import android.content.Context;
import android.test.InstrumentationTestCase;

import net.allacalle.android.era030.Formula;

/**
 * Created by Alfonso on 06/05/2016.
 */
public class TestTIMI extends InstrumentationTestCase
{
    public void testResultadoTIMI () throws Exception {
        String expected = "";
        String reality = "" ;
        String idFormula ="";
        idFormula = "6";
        //IMPORTANTE como llamar al contexto desde el TEST
        Context context = this.getInstrumentation().getTargetContext().getApplicationContext();
        final Formula formulaActual = new Formula(idFormula, context);


        //Asignamos los valores que se han introducido por la pantalla

        //Que usa el siguiente vector 60;1;0;1;0;1;0;0
        String vectorResultados [] = new String[8];
        vectorResultados[0] = "73";
        vectorResultados[1] = "1";
        vectorResultados[2] = "0";
        vectorResultados[3] = "1";
        vectorResultados[4] = "0";
        vectorResultados[5] = "1";
        vectorResultados[6] = "0";
        vectorResultados[7] = "0";

        formulaActual.introducirValoresFormula(vectorResultados);

        formulaActual.calcularFormula();

        expected = "Mortalidad en 30 días del 16.1%" ;
        reality = formulaActual.getResultado().getValor() ;

        assertEquals(expected, reality);


        float expectedNumber = 6;
        float realityNumber = formulaActual.getResultado().getPuntuacionEscala() ;

        assertEquals(expectedNumber, realityNumber);
    }

}
