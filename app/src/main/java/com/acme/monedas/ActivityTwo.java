package com.acme.monedas;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Apolo on 30/08/2016.
 */
public class ActivityTwo extends Activity {

    Spinner lista;
    String[] datos = {"Selecciona tu moneda", "Colombia Pesos", "Usa Dolar", "Brasil Pesos", "Chile Pesos"};
    Integer bandera = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        lista = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> adaptador =new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        lista.setAdapter(adaptador);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(getApplicationContext(),
                                "Selecciona tu moneda de origen para continuar",Toast.LENGTH_SHORT).show();
                        bandera = 0;
                        break;
                    case 1:
                        Toast toast = Toast.makeText(
                                getApplicationContext(),datos[position], Toast.LENGTH_SHORT);
                        toast.show();
                        bandera = 1;
                        break;
                    case 2:
                        Toast toast2 = Toast.makeText(
                                getApplicationContext(),datos[position], Toast.LENGTH_SHORT);
                        toast2.show();
                        bandera = 2;
                        break;
                    case 3:
                        Toast toast3 = Toast.makeText(
                                getApplicationContext(),datos[position], Toast.LENGTH_SHORT);
                        toast3.show();
                        bandera = 3;
                        break;
                    case 4:
                        Toast toast4 = Toast.makeText(
                                getApplicationContext(),datos[position], Toast.LENGTH_SHORT);
                        toast4.show();
                        bandera = 4;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        final String valor = getIntent().getExtras().getString("dato1");

        Button button2 = (Button) findViewById(R.id.btn_ok2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bandera == 0){
                    Toast.makeText(getApplicationContext(),
                            "Selecciona tu moneda de origen para continuar",Toast.LENGTH_SHORT).show();
                }else {

                    Intent i = new Intent(ActivityTwo.this, ActivityThree.class);
                    i.putExtra("dato2", bandera.toString() );
                    i.putExtra("dato1", valor);
                    startActivity(i);
                }
            }
        });
    }
}
