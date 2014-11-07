package com.cracknet.hechoscuriosos;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends Activity {

    private Button showFactButton;
    private String textoHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.showFactButton = (Button) findViewById(R.id.button);
        this.textoHelp = getResources().getString(R.string.know_help);
        this.showFactButton.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View view) {
                Context context = getApplicationContext();
                Toast.makeText(context, textoHelp, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    public void factButtonAction(View view) {
        TextView factLabel = (TextView) findViewById(R.id.hechoCurioso);
        String texto = FactBook.getRandomFact(this);
        factLabel.setText(texto);
        changeBackgroundColor(view);
    }

    public void changeBackgroundColor(View view) {
        RelativeLayout relLay = (RelativeLayout) findViewById(R.id.relativeLayout);
        int color = FactBook.getRandomColor(this);
        relLay.setBackgroundColor(color);
    }
}
