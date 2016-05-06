package net.allacalle.android.era030.Test.TestResultados;

import android.content.Context;
import android.test.InstrumentationTestCase;

import net.allacalle.android.era030.Formula;

/**
 * Created by Alfonso on 06/05/2016.
 */
public class TestWellScoreTrombosisVenosaProfunda extends InstrumentationTestCase {

    public void testResultadoWellScoreTrombosisVenosaProfunda () throws Exception
    {
        {
            String expected = "";
            String reality = "";
            String idFormula = "";
            idFormula = "8";
            //IMPORTANTE como llamar al contexto desde el TEST
            Context context = this.getInstrumentation().getTargetContext().getApplicationContext();
            final Formula formulaActual = new Formula(idFormula, context);


            //Asignamos los valores que se han introducido por la pantalla

            //Que usan el siguiente vector. 0;0;1;1;0;0;1;0
            String vectorResultados[] = new String[8];
            vectorResultados[0] = "0";
            vectorResultados[1] = "0";
            vectorResultados[2] = "1";
            vectorResultados[3] = "1";
            vectorResultados[4] = "0";
            vectorResultados[5] = "0";
            vectorResultados[6] = "1";
            vectorResultados[7] = "0";

            formulaActual.introducirValoresFormula(vectorResultados);

            formulaActual.calcularFormula();

            expected = "Probabilidad alta de trombosis venosa profunda";
            reality = formulaActual.getResultado().getValor();

            assertEquals(expected, reality);


            float expectedNumber = 3;
            float realityNumber = formulaActual.getResultado().getPuntuacionEscala();

            assertEquals(expectedNumber, realityNumber);
        }
    }
}
