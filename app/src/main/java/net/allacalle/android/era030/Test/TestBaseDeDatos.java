package net.allacalle.android.era030.Test;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.test.InstrumentationTestCase;
import android.content.Context;

import net.allacalle.android.era030.FormulasSQLiteHelper;


/**
 * Created by Alfonso on 29/04/2016.
 */
public class TestBaseDeDatos extends InstrumentationTestCase
{

    public void testSimpleCreacionBD () throws Exception {
     //creamos un contexto para poder manipular la base de datos.
     Context context = this.getInstrumentation().getTargetContext().getApplicationContext();


     //Lo primero es abrir la base de datos de ERA.
     FormulasSQLiteHelper usdbh =
             new FormulasSQLiteHelper(context, "DbEra", null, 1);
     SQLiteDatabase db = usdbh.getReadableDatabase();

     //Creamos dos variables tipo cadena para valorEsperado, valorRecibido
     String valorEsperado = "";
     String valorRecibido = "";

     //Ahora vamos a crear un cursor para ir realizando las consultas.
     Cursor cursorFormulas;
     //Hacemos 22 consultas 1 para cada campo de la base de datos y vamos comparando los resultados

     //Consulta numero 1
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '1'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "Child-Pugh";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 2
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '2'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "Glasgow, Escala de Coma";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 3
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '3'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "CHA2DS2-VASc";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 4
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '4'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "PSI inicial";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 5
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '5'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "PSI puntuacion";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 6
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '6'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "TIMI";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 7
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '7'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "Wells Score para Embolismo Pulmonar";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 8
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '8'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "Wells, Score para Trombosis Venosa Profunda";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 9
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '9'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "BUN";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 10
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '10'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "Aclaramiento de creatinina";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 11
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '11'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "Agua Libre,Exceso";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 12
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '12'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "Agua Corporal,Deficit";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 13
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '13'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "Cloro,Deficit";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 14
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '14'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "Superficie Corporal Total";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 15
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '15'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "Gasto de Energía Basal";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 16
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '16'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "Osmolaridad";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 17
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '17'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "Agua Corporal Total";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 18
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '18'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "Bicarbonato,Exceso";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 19
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '19'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "Bicarbonato,Deficit";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 20
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '20'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "Gradiente A-a de O2";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 21
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '21'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "Tension Inspirada de Oxígeno";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);
     //Consulta numero 22
     cursorFormulas = db.rawQuery("SELECT Abreviatura FROM Formulas  WHERE IdFormula = '22'  ", null);
     cursorFormulas.moveToFirst();
     valorEsperado = "Dosis de insulina al día";
     valorRecibido = cursorFormulas.getString(0);
     assertEquals(valorEsperado, valorRecibido);

     cursorFormulas.close();
     db.close();
    }




    }


