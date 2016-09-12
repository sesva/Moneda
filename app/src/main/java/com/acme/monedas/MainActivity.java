package com.acme.monedas;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.btn_ok);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //codigo a ejecutar cuando sea pulsado
                EditText et = (EditText) findViewById(R.id.et_ingreso);
                String vacio = et.getText().toString();
                if (vacio.equals("") ){
                    Toast.makeText(getApplicationContext(),"Ingresa un valor para poder continuar...",Toast.LENGTH_LONG).show();
                }else{
                    EditText et2 = (EditText) findViewById(R.id.et_ingreso);
                    String dato1 = "";
                    dato1 = et2.getText().toString();
                    Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
                    intent.putExtra("dato1", dato1);
                    startActivity(intent);
                }
            }
        });
    }
}
