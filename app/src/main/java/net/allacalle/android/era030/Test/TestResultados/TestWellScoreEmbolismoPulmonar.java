package net.allacalle.android.era030.Test.TestResultados;

import android.content.Context;
import android.test.InstrumentationTestCase;

import net.allacalle.android.era030.Formula;

/**
 * Created by Alfonso on 06/05/2016.
 */
public class TestWellScoreEmbolismoPulmonar extends InstrumentationTestCase {

    public void testResultadoWellScoreEmbolismoPulmonar() throws Exception {
        {
            String expected = "";
            String reality = "";
            String idFormula = "";
            idFormula = "7";
            //IMPORTANTE como llamar al contexto desde el TEST
            Context context = this.getInstrumentation().getTargetContext().getApplicationContext();
            final Formula formulaActual = new Formula(idFormula, context);


            //Asignamos los valores que se han introducido por la pantalla

            //Que usan el siguiente vector. 0;1;0;0;1;0;0
            String vectorResultados[] = new String[7];
            vectorResultados[0] = "0";
            vectorResultados[1] = "1";
            vectorResultados[2] = "0";
            vectorResultados[3] = "0";
            vectorResultados[4] = "1";
            vectorResultados[5] = "0";
            vectorResultados[6] = "0";

            formulaActual.introducirValoresFormula(vectorResultados);

            formulaActual.calcularFormula();

            expected = "Probabilidad intermedia de tromboembolia pulmonar.";
            reality = formulaActual.getResultado().getValor();

            assertEquals(expected, reality);


            double expectedNumber = 2.5;
            double realityNumber = formulaActual.getResultado().getPuntuacionEscala();

            assertEquals(expectedNumber, realityNumber);
        }
    }
}
