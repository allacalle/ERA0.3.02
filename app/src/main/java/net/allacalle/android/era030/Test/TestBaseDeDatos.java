package net.allacalle.android.era030.Test;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.test.InstrumentationTestCase;
import android.content.Context;

import net.allacalle.android.era030.Formula;
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

 public void testDetalladoCreacionBD () throws Exception
 {
  Context context = this.getInstrumentation().getTargetContext().getApplicationContext();

  //Lo primero es abrir la base de datos de ERA.
  FormulasSQLiteHelper usdbh =
          new FormulasSQLiteHelper(context ,"DbEra", null, 1);
  SQLiteDatabase db = usdbh.getReadableDatabase();

  //Creamos dos variables tipo cadena para valorEsperado, valorRecibido
  String valorEsperado ="";
  String valorRecibido ="";

  //Ahora vamos a crear un cursor para ir realizando las consultas.
  Cursor cursorFormulas;
  Cursor cursorParametros;
  Cursor cursorCriterios;
  //Primera formula
  //cursorFormulas = db.rawQuery("SELECT NombreCompleto,Abreviatura,Expresion,Tipo FROM Formulas  WHERE IdFormula = '1'  ", null);
  //valorEsperado ="";
  //valorEsperado ="";
  //valorRecibido = cursorFormulas.getString();
  //assertEquals(valorEsperado, valorRecibido);
  cursorFormulas = db.rawQuery("SELECT NombreCompleto,Abreviatura,Tipo FROM Formulas  WHERE IdFormula = '1'  ", null);
  cursorFormulas.moveToFirst();
  //Nombre completo
  valorEsperado ="Child-Pugh";
  valorRecibido = cursorFormulas.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Abreviatura
  valorEsperado ="Child-Pugh";
  valorRecibido = cursorFormulas.getString(1);
  assertEquals(valorEsperado, valorRecibido);
  //Tipo
  valorEsperado ="escala";
  valorRecibido = cursorFormulas.getString(2);
  assertEquals(valorEsperado, valorRecibido);
  //Parametro 1
  cursorParametros = db.rawQuery("SELECT NombreParametro,TipoParametro,Medida,Minimo,Maximo FROM Parametros WHERE IdParametro = '1'", null);
  cursorParametros.moveToFirst();
  //Nombre Parametro
  valorEsperado ="Billirumina";
  valorRecibido = cursorParametros.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Tipo Parametro
  valorEsperado ="numero";
  valorRecibido = cursorParametros.getString(1);
  assertEquals(valorEsperado, valorRecibido);
  //Medida
  valorEsperado ="mg/100 ml";
  valorRecibido = cursorParametros.getString(2);
  assertEquals(valorEsperado, valorRecibido);
  //Minimo
  valorEsperado ="0";
  valorRecibido = cursorParametros.getString(3);
  assertEquals(valorEsperado, valorRecibido);
  //Maximo
  valorEsperado ="200";
  valorRecibido = cursorParametros.getString(4);
  assertEquals(valorEsperado, valorRecibido);
  //Parametro 2
  cursorParametros = db.rawQuery("SELECT NombreParametro,TipoParametro,Medida,Minimo,Maximo FROM Parametros WHERE IdParametro = '2'", null);
  cursorParametros.moveToFirst();
  //Nombre Parametro
  valorEsperado ="Albumina serica";
  valorRecibido = cursorParametros.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Tipo Parametro
  valorEsperado ="numero";
  valorRecibido = cursorParametros.getString(1);
  assertEquals(valorEsperado, valorRecibido);
  //Medida
  valorEsperado ="g/l";
  valorRecibido = cursorParametros.getString(2);
  assertEquals(valorEsperado, valorRecibido);
  //Minimo
  valorEsperado ="0";
  valorRecibido = cursorParametros.getString(3);
  assertEquals(valorEsperado, valorRecibido);
  //Maximo
  valorEsperado ="500";
  valorRecibido = cursorParametros.getString(4);
  assertEquals(valorEsperado, valorRecibido);
//Parametro 3
  cursorParametros = db.rawQuery("SELECT NombreParametro,TipoParametro,Medida,Minimo,Maximo FROM Parametros WHERE IdParametro = '3'", null);
  cursorParametros.moveToFirst();
  //Nombre Parametro
  valorEsperado ="Tiempo de protombina";
  valorRecibido = cursorParametros.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Tipo Parametro
  valorEsperado ="numero";
  valorRecibido = cursorParametros.getString(1);
  assertEquals(valorEsperado, valorRecibido);
  //Medida
  valorEsperado ="segundos";
  valorRecibido = cursorParametros.getString(2);
  assertEquals(valorEsperado, valorRecibido);
  //Minimo
  valorEsperado ="1";
  valorRecibido = cursorParametros.getString(3);
  assertEquals(valorEsperado, valorRecibido);
  //Maximo
  valorEsperado ="1000";
  valorRecibido = cursorParametros.getString(4);
  assertEquals(valorEsperado, valorRecibido);

//Parametro 4
  cursorParametros = db.rawQuery("SELECT NombreParametro,TipoParametro,Medida,Minimo,Maximo FROM Parametros WHERE IdParametro = '4'", null);
  cursorParametros.moveToFirst();
  //Nombre Parametro
  valorEsperado ="Ascitis";
  valorRecibido = cursorParametros.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Tipo Parametro
  valorEsperado ="lista";
  valorRecibido = cursorParametros.getString(1);
  assertEquals(valorEsperado, valorRecibido);
//Parametro 5
  cursorParametros = db.rawQuery("SELECT NombreParametro,TipoParametro,Medida,Minimo,Maximo FROM Parametros WHERE IdParametro = '5'", null);
  cursorParametros.moveToFirst();
  //Nombre Parametro
  valorEsperado ="Encefalopatia de origen hepatico";
  valorRecibido = cursorParametros.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Tipo Parametro
  valorEsperado ="lista";
  valorRecibido = cursorParametros.getString(1);
  assertEquals(valorEsperado, valorRecibido);
  //CriterioPuntuacion
  cursorCriterios = db.rawQuery("SELECT Criterio,Puntuacion  FROM CriteriosPuntuacion WHERE IdCriterioPuntuacion = ''", null);
  cursorCriterios.moveToFirst();
  //Criterio
  valorEsperado ="";
  valorRecibido = cursorCriterios.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Puntuacion
  valorEsperado ="";
  valorRecibido = cursorCriterios.getString(1);
  assertEquals(valorEsperado, valorRecibido);
  //CriterioPuntuacion 1
  cursorCriterios = db.rawQuery("SELECT Criterio,Puntuacion  FROM CriteriosPuntuacion WHERE IdCriterioPuntuacion = '1'", null);
  cursorCriterios.moveToFirst();
  //Criterio
  valorEsperado ="x < 2";
  valorRecibido = cursorCriterios.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Puntuacion
  valorEsperado ="1";
  valorRecibido = cursorCriterios.getString(1);
  assertEquals(valorEsperado, valorRecibido);
//CriterioPuntuacion 2
  cursorCriterios = db.rawQuery("SELECT Criterio,Puntuacion  FROM CriteriosPuntuacion WHERE IdCriterioPuntuacion = '2'", null);
  cursorCriterios.moveToFirst();
  //Criterio
  valorEsperado ="x>= 2 && x<=3";
  valorRecibido = cursorCriterios.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Puntuacion
  valorEsperado ="2";
  valorRecibido = cursorCriterios.getString(1);
  assertEquals(valorEsperado, valorRecibido);
//CriterioPuntuacion 3
  cursorCriterios = db.rawQuery("SELECT Criterio,Puntuacion  FROM CriteriosPuntuacion WHERE IdCriterioPuntuacion = '3'", null);
  cursorCriterios.moveToFirst();
  //Criterio
  valorEsperado ="x > 3";
  valorRecibido = cursorCriterios.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Puntuacion
  valorEsperado ="3";
  valorRecibido = cursorCriterios.getString(1);
  assertEquals(valorEsperado, valorRecibido);
//CriterioPuntuacion 4
  cursorCriterios = db.rawQuery("SELECT Criterio,Puntuacion  FROM CriteriosPuntuacion WHERE IdCriterioPuntuacion = '4'", null);
  cursorCriterios.moveToFirst();
  //Criterio
  valorEsperado ="x > 35";
  valorRecibido = cursorCriterios.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Puntuacion
  valorEsperado ="1";
  valorRecibido = cursorCriterios.getString(1);
  assertEquals(valorEsperado, valorRecibido);
//CriterioPuntuacion 5
  cursorCriterios = db.rawQuery("SELECT Criterio,Puntuacion  FROM CriteriosPuntuacion WHERE IdCriterioPuntuacion = '5'", null);
  cursorCriterios.moveToFirst();
  //Criterio
  valorEsperado ="x >= 30 && x <= 35";
  valorRecibido = cursorCriterios.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Puntuacion
  valorEsperado ="2";
  valorRecibido = cursorCriterios.getString(1);
  assertEquals(valorEsperado, valorRecibido);
//CriterioPuntuacion 6
  cursorCriterios = db.rawQuery("SELECT Criterio,Puntuacion  FROM CriteriosPuntuacion WHERE IdCriterioPuntuacion = '6'", null);
  cursorCriterios.moveToFirst();
  //Criterio
  valorEsperado ="x < 30";
  valorRecibido = cursorCriterios.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Puntuacion
  valorEsperado ="3";
  valorRecibido = cursorCriterios.getString(1);
  assertEquals(valorEsperado, valorRecibido);
//CriterioPuntuacion 7
  cursorCriterios = db.rawQuery("SELECT Criterio,Puntuacion  FROM CriteriosPuntuacion WHERE IdCriterioPuntuacion = '7'", null);
  cursorCriterios.moveToFirst();
  //Criterio
  valorEsperado ="x >= 1 && x <= 3";
  valorRecibido = cursorCriterios.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Puntuacion
  valorEsperado ="1";
  valorRecibido = cursorCriterios.getString(1);
  assertEquals(valorEsperado, valorRecibido);
//CriterioPuntuacion 8
  cursorCriterios = db.rawQuery("SELECT Criterio,Puntuacion  FROM CriteriosPuntuacion WHERE IdCriterioPuntuacion = '8'", null);
  cursorCriterios.moveToFirst();
  //Criterio
  valorEsperado ="x >= 4 && x <= 6";
  valorRecibido = cursorCriterios.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Puntuacion
  valorEsperado ="2";
  valorRecibido = cursorCriterios.getString(1);
  assertEquals(valorEsperado, valorRecibido);
//CriterioPuntuacion 9
  cursorCriterios = db.rawQuery("SELECT Criterio,Puntuacion  FROM CriteriosPuntuacion WHERE IdCriterioPuntuacion = '9'", null);
  cursorCriterios.moveToFirst();
  //Criterio
  valorEsperado ="x > 6";
  valorRecibido = cursorCriterios.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Puntuacion
  valorEsperado ="3";
  valorRecibido = cursorCriterios.getString(1);
  assertEquals(valorEsperado, valorRecibido);
//CriterioPuntuacion 10
  cursorCriterios = db.rawQuery("SELECT Criterio,Puntuacion  FROM CriteriosPuntuacion WHERE IdCriterioPuntuacion = '10'", null);
  cursorCriterios.moveToFirst();
  //Criterio
  valorEsperado ="Ninguna";
  valorRecibido = cursorCriterios.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Puntuacion
  valorEsperado ="1";
  valorRecibido = cursorCriterios.getString(1);
  assertEquals(valorEsperado, valorRecibido);
//CriterioPuntuacion 11
  cursorCriterios = db.rawQuery("SELECT Criterio,Puntuacion  FROM CriteriosPuntuacion WHERE IdCriterioPuntuacion = '11'", null);
  cursorCriterios.moveToFirst();
  //Criterio
  valorEsperado ="Control facil";
  valorRecibido = cursorCriterios.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Puntuacion
  valorEsperado ="2";
  valorRecibido = cursorCriterios.getString(1);
  assertEquals(valorEsperado, valorRecibido);
//CriterioPuntuacion 12
  cursorCriterios = db.rawQuery("SELECT Criterio,Puntuacion  FROM CriteriosPuntuacion WHERE IdCriterioPuntuacion = '12'", null);
  cursorCriterios.moveToFirst();
  //Criterio
  valorEsperado ="Control inadecuado";
  valorRecibido = cursorCriterios.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Puntuacion
  valorEsperado ="3";
  valorRecibido = cursorCriterios.getString(1);
  assertEquals(valorEsperado, valorRecibido);
//CriterioPuntuacion 13
  cursorCriterios = db.rawQuery("SELECT Criterio,Puntuacion  FROM CriteriosPuntuacion WHERE IdCriterioPuntuacion = '13'", null);
  cursorCriterios.moveToFirst();
  //Criterio
  valorEsperado ="Ninguna";
  valorRecibido = cursorCriterios.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Puntuacion
  valorEsperado ="1";
  valorRecibido = cursorCriterios.getString(1);
  assertEquals(valorEsperado, valorRecibido);
//CriterioPuntuacion 14
  cursorCriterios = db.rawQuery("SELECT Criterio,Puntuacion  FROM CriteriosPuntuacion WHERE IdCriterioPuntuacion = '14'", null);
  cursorCriterios.moveToFirst();
  //Criterio
  valorEsperado ="Minima";
  valorRecibido = cursorCriterios.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Puntuacion
  valorEsperado ="2";
  valorRecibido = cursorCriterios.getString(1);
  assertEquals(valorEsperado, valorRecibido);
  //CriterioPuntuacion 15
  cursorCriterios = db.rawQuery("SELECT Criterio,Puntuacion  FROM CriteriosPuntuacion WHERE IdCriterioPuntuacion = '15'", null);
  cursorCriterios.moveToFirst();
  //Criterio
  valorEsperado ="Fase avanzada";
  valorRecibido = cursorCriterios.getString(0);
  assertEquals(valorEsperado, valorRecibido);
  //Puntuacion
  valorEsperado ="3";
  valorRecibido = cursorCriterios.getString(1);
  assertEquals(valorEsperado, valorRecibido);










  //Ultima formula
  //Formula tipo escala
  //Formula tipo general
  //Formula tipo general con multiples opciones de expresion.





 }



    }


