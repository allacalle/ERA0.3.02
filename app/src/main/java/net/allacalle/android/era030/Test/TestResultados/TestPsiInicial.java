package net.allacalle.android.era030.Test.TestResultados;

import android.content.Context;
import android.test.InstrumentationTestCase;

import net.allacalle.android.era030.Formula;

/**
 * Created by Alfonso on 05/05/2016.
 */
public class TestPsiInicial extends InstrumentationTestCase {
    public void testResultadoPsiInicial () throws Exception
    {
        String expected = "";
        String reality = "" ;
        String idFormula ="";
        idFormula = "4";
        //IMPORTANTE como llamar al contexto desde el TEST
        Context context = this.getInstrumentation().getTargetContext().getApplicationContext();
        final Formula formulaActual = new Formula(idFormula, context);


        //Asignamos los valores que se han introducido por la pantalla

        //Que usan el siguiente vector. 4;33;2;12;13
        String vectorResultados [] = new String[11];
        //1;0;0;0;1;0;0;0;1;0;0
        vectorResultados[0] = "1";
        vectorResultados[1] = "0";
        vectorResultados[2] = "0";
        vectorResultados[3] = "0";
        vectorResultados[4] = "1";
        vectorResultados[5] = "0";
        vectorResultados[6] = "0";
        vectorResultados[7] = "0";
        vectorResultados[8] = "1";
        vectorResultados[9] = "0";
        vectorResultados[10] = "0";

        formulaActual.introducirValoresFormula(vectorResultados);

        formulaActual.calcularFormula();

        expected = "El paciente muestra signos de riesgo. Si quiere calcular la puntuacion del PSI utlice la formula de PSI puntuacion." ;
        reality = formulaActual.getResultado().getValor() ;

        assertEquals(expected, reality);


        float expectedNumber = 3;
        float realityNumber = formulaActual.getResultado().getPuntuacionEscala() ;

        assertEquals(expectedNumber, realityNumber);
    }
}
