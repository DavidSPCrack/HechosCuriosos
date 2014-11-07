package com.cracknet.hechoscuriosos;

import android.app.Activity;
import android.content.res.TypedArray;

import java.util.Random;

/**
 * Created by David on 31/10/2014.
 */
public class FactBook {

    public static String getRandomFact(Activity actividad) {
        String[] textos = actividad.getResources().getStringArray(R.array.know_array);

        Random rnd = new Random();
        int idTxt = rnd.nextInt(textos.length);
        return textos[idTxt];
    }

    public static int getRandomColor(Activity actividad) {
        TypedArray arrayColors = actividad.getResources().obtainTypedArray(R.array.todosColores);

        Random rnd = new Random();
        int idCol = rnd.nextInt(arrayColors.length());
        return arrayColors.getColor(idCol, 0);
    }
}
