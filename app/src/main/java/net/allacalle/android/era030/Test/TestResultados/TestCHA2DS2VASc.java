package net.allacalle.android.era030.Test.TestResultados;

import android.content.Context;
import android.test.InstrumentationTestCase;

import net.allacalle.android.era030.Formula;

/**
 * Created by Alfonso on 05/05/2016.
 */
public class TestCHA2DS2VASc extends InstrumentationTestCase
{
    public void testResultadoChad2DsVasc () throws Exception
    {
        String expected = "";
        String reality = "" ;
        String idFormula ="";
        idFormula = "3";
        //IMPORTANTE como llamar al contexto desde el TEST
        Context context = this.getInstrumentation().getTargetContext().getApplicationContext();
        final Formula formulaActual = new Formula(idFormula, context);


        //Asignamos los valores que se han introducido por la pantalla

        //Que usan el siguiente vector. 4;33;2;12;13
        String vectorResultados [] = new String[7];
        vectorResultados[0] = "1";
        vectorResultados[1] = "1";
        vectorResultados[2] = "80";
        vectorResultados[3] = "0";
        vectorResultados[4] = "0";
        vectorResultados[5] = "0";
        vectorResultados[6] = "1";

        formulaActual.introducirValoresFormula(vectorResultados);

        formulaActual.calcularFormula();

        expected = "Riesgo Moderado-Alto. Anticoagulacion, salvo contraindicacion." ;
        reality = formulaActual.getResultado().getValor() ;

        assertEquals(expected, reality);


        float expectedNumber = 5;
        float realityNumber = formulaActual.getResultado().getPuntuacionEscala() ;

        assertEquals(expectedNumber, realityNumber);
    }
}
