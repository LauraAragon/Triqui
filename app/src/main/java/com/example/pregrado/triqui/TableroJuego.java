package com.example.pregrado.triqui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.ImageView;


public class TableroJuego extends ActionBarActivity {


    private ImageButton[][] botones;
    private int turno;
    private Button boton1;
    private String texto1;
    private Button boton2;
    private String texto2;
    private Bundle bundle;
    private Bitmap b1;
    private Bitmap b2;
    private ImageView iv1;
    private ImageView iv2;



    public void crearMatrizBotones(){
        for (int i = 0; i<2; i++){
            for(int j = 0; j<2;j ++){
                botones[0][0] = (ImageButton) findViewById(R.id.button1);
                botones[0][1] = (ImageButton) findViewById(R.id.button2);
                botones[0][2] = (ImageButton) findViewById(R.id.button3);
                botones[1][0] = (ImageButton) findViewById(R.id.button4);
                botones[1][1] = (ImageButton) findViewById(R.id.button5);
                botones[1][2] = (ImageButton) findViewById(R.id.button6);
                botones[2][0] = (ImageButton) findViewById(R.id.button7);
                botones[2][1] = (ImageButton) findViewById(R.id.button8);
                botones[2][2] = (ImageButton) findViewById(R.id.button9);

            }
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        turno = 0;
        boton1 = (Button) findViewById(R.id.botonUnJugador);
        texto1 = (String) boton1.getText();
        boton2 = (Button) findViewById(R.id.botonDosJugadores);
        texto2 = (String) boton2.getText();
        bundle = getIntent().getExtras();
        crearMatrizBotones();
    }


    public void onClickButton1(){

        while(bundle.getString("dos").equals(texto2)){
            if(turno == 0 || turno == 2){
                botones[0][0].setBackground(Drawable.createFromPath("C:/Users/Laura Aragon/AndroidStudioProjects/Triqui/app/src/main/res/drawable-hdpi/cali.png"));
                turno = 1;
                botones[0][0].setEnabled(false);
            }

            else if(turno == 1){
                botones[0][0].setBackground(Drawable.createFromPath("C:/Users/Laura Aragon/AndroidStudioProjects/Triqui/app/src/main/res/drawable-hdpi/america.png"));
                turno = 2;
                botones[0][0].setEnabled(false);
            }
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }





}
