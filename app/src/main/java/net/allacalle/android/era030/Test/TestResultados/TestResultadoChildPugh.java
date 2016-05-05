package net.allacalle.android.era030.Test.TestResultados;

import android.content.Context;
import android.test.InstrumentationTestCase;

import net.allacalle.android.era030.Formula;

/**
 * Created by Alfonso on 04/05/2016.
 */
public class TestResultadoChildPugh extends InstrumentationTestCase
{
    public void testResultadoChildPugh () throws Exception
    {

        String expected = "Child-Pugh";
        String reality = "" ;
        String idFormula ="";
        //Clave de la formula Child Pugh
        idFormula = "1";
        //IMPORTANTE como llamar al contexto desde el TEST
        Context context = this.getInstrumentation().getTargetContext().getApplicationContext();
        final Formula formulaActual = new Formula(idFormula, context);
        reality = formulaActual.getAbreviatura();

        //Comprobamos primero que la formula es la corecta.
        assertEquals(expected, reality);

        //Asignamos los valores que se han introducido por la pantalla

        //Que usan el siguiente vector. 4;33;2;12;13
        String vectorResultados [] = new String[5];
        vectorResultados[0] = "4";
        vectorResultados[1] = "33";
        vectorResultados[2] = "2";
        vectorResultados[3] = "12";
        vectorResultados[4] = "13";

        formulaActual.introducirValoresFormula(vectorResultados);

        formulaActual.calcularFormula();

        expected = "Clase C. La supervivencia al cabo de 1 año es del 45%." ;
        reality = formulaActual.getResultado().getValor() ;

        assertEquals(expected, reality);


        float expectedNumber = 10;
        float realityNumber = formulaActual.getResultado().getPuntuacionEscala() ;

        assertEquals(expectedNumber, realityNumber);

    }


}
