package net.allacalle.android.era030.Test;

import android.content.Context;
import android.test.InstrumentationTestCase;

import net.allacalle.android.era030.Formula;

/**
 * Created by Alfonso on 28/04/2016.
 */
public class TestClassFormula extends InstrumentationTestCase
{
    public void testSimple () throws Exception
    {
        //final int expected = 1;
        //final int reality = 5;
        String expected = "Child-Pugh";
        String reality = "" ;
        String idFormula ="";
        //Clave de la formula Child Pugh
        idFormula = "1";
        //IMPORTANTE como llamar al contexto desde el TEST
        Context context = this.getInstrumentation().getTargetContext().getApplicationContext();
        final Formula formulaActual = new Formula(idFormula, context);
        reality = formulaActual.getAbreviatura();

        assertEquals(expected, reality);

    }

    public void testMenosSimple () throws Exception
    {
        //final int expected = 1;
        //final int reality = 5;
        String expected = "Child-Pugh";
        String reality = "" ;
        String idFormula ="";
        //Clave de la formula Child Pugh
        idFormula = "1";
        //IMPORTANTE como llamar al contexto desde el TEST
        Context context = this.getInstrumentation().getTargetContext().getApplicationContext();
        final Formula formulaActual = new Formula(idFormula, context);
        reality = formulaActual.getAbreviatura();
        assertEquals(expected, reality);

        expected = "escala";
        reality = formulaActual.getTipoFormula() ;
        assertEquals(expected, reality);


    }



}
