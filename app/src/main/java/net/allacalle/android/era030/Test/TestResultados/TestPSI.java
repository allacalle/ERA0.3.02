package net.allacalle.android.era030.Test.TestResultados;

import android.content.Context;
import android.test.InstrumentationTestCase;

import net.allacalle.android.era030.Formula;

/**
 * Created by Alfonso on 06/05/2016.
 */
public class TestPSI extends InstrumentationTestCase {
    public void testResultadoPSI () throws Exception
    {
        String expected = "";
        String reality = "" ;
        String idFormula ="";
        idFormula = "5";
        //IMPORTANTE como llamar al contexto desde el TEST
        Context context = this.getInstrumentation().getTargetContext().getApplicationContext();
        final Formula formulaActual = new Formula(idFormula, context);


        //Asignamos los valores que se han introducido por la pantalla

        //Que usan el siguiente vector. 4;33;2;12;13
        String vectorResultados [] = new String[19];
        //1;60;0;1;0
        // ;0;1;0;0;0
        // ;0;1;0;0;0
        // ;1;0;0;1
        vectorResultados[0] = "1";
        vectorResultados[1] = "60";
        vectorResultados[2] = "0";
        vectorResultados[3] = "1";
        vectorResultados[4] = "0";

        vectorResultados[5] = "0";
        vectorResultados[6] = "1";
        vectorResultados[7] = "0";
        vectorResultados[8] = "0";
        vectorResultados[9] = "0";

        vectorResultados[10] = "0";
        vectorResultados[11] = "1";
        vectorResultados[12] = "0";
        vectorResultados[13] = "0";
        vectorResultados[14] = "0";

        vectorResultados[15] = "1";
        vectorResultados[16] = "0";
        vectorResultados[17] = "0";
        vectorResultados[18] = "1";


        formulaActual.introducirValoresFormula(vectorResultados);

        formulaActual.calcularFormula();

        expected = "Alto V. Ingreso hospitalario (planta o UCI)" ;
        reality = formulaActual.getResultado().getValor() ;

        assertEquals(expected, reality);


        float expectedNumber = 135;
        float realityNumber = formulaActual.getResultado().getPuntuacionEscala() ;

        assertEquals(expectedNumber, realityNumber);
    }
}
