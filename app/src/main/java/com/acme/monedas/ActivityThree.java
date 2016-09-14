package com.acme.monedas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Apolo on 31/08/2016.
 */
public class ActivityThree extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        final String valor = getIntent().getExtras().getString("dato2");
        final String valor1 = getIntent().getExtras().getString("dato1");
        final Integer dinero = Integer.parseInt(valor1);
        Log.e("valor",valor);
        Log.e("dinero",dinero.toString());


        final CheckBox cb_bra = (CheckBox) findViewById(R.id.cb_bra);
        final CheckBox cb_chi = (CheckBox) findViewById(R.id.cb_chi);
        final CheckBox cb_col = (CheckBox) findViewById(R.id.cb_col);
        final CheckBox cb_usa = (CheckBox) findViewById(R.id.cb_usa);
        final CheckBox cb_jap = (CheckBox) findViewById(R.id.cb_jap);
        final CheckBox cb_china = (CheckBox) findViewById(R.id.cb_china);
        final CheckBox cb_mex = (CheckBox) findViewById(R.id.cb_mex);
        final CheckBox cb_euro = (CheckBox) findViewById(R.id.cb_euro);
        Button btn_convertir = (Button)findViewById(R.id.btn_convertir);
        final TextView txt_bra = (TextView) findViewById(R.id.txt_bra);
        final TextView txt_chi = (TextView) findViewById(R.id.txt_chi);
        final TextView txt_col = (TextView) findViewById(R.id.txt_col);
        final TextView txt_usa = (TextView) findViewById(R.id.txt_usa);
        final TextView txt_jap = (TextView) findViewById(R.id.txt_jap);
        final TextView txt_china = (TextView) findViewById(R.id.txt_china);
        final TextView txt_mex = (TextView) findViewById(R.id.txt_mex);
        final TextView txt_euro = (TextView) findViewById(R.id.txt_euro);


        btn_convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Si selecciona moneda de origen Colombia
                if(cb_bra.isChecked() && (valor.equals("1"))){
                    double operador = dinero * 0.0011000;
                    txt_bra.setText(String.format("%.2f",operador));
                }
                if(cb_chi.isChecked() && (valor.equals("1"))){
                    double operador = dinero * 0.23162;
                    //txt_chi.setText(String.valueOf(operador));
                    txt_chi.setText(String.format("%.2f",operador));
                }
                if(cb_col.isChecked() && (valor.equals("1"))){
                    txt_col.setText(";)");
                }
                if(cb_usa.isChecked() && (valor.equals("1"))){
                    double operador = dinero * 0.0014700;
                    txt_usa.setText(String.format("%.2f",operador));
                }
                if(cb_jap.isChecked() && (valor.equals("1"))){
                    double operador = dinero * 0.15173;
                    txt_jap.setText(String.format("%.2f",operador));
                }
                if(cb_china.isChecked() && (valor.equals("1"))){
                    double operador = dinero * 0.0098100;
                    txt_china.setText(String.format("%.2f",operador));
                }
                if(cb_mex.isChecked() && (valor.equals("1"))){
                    double operador = dinero * 0.027620;
                    txt_mex.setText(String.format("%.2f",operador));
                }
                if(cb_euro.isChecked() && (valor.equals("1"))){
                    double operador = dinero * 0.0013200;
                    txt_euro.setText(String.format("%.2f",operador));
                }
                //Si seleciona moneda de origen Dolar
                if(cb_bra.isChecked() && (valor.equals("2"))){
                    double operador = dinero * 3.2265;
                    txt_bra.setText(String.format("%.2f",operador));
                }
                if(cb_chi.isChecked() && (valor.equals("2"))){
                    double operador = dinero * 608.36;
                    txt_chi.setText(String.format("%.2f",operador));
                }
                if(cb_col.isChecked() && (valor.equals("2"))){
                    double operador = dinero * 2.937;
                    txt_col.setText(String.format("%.2f",operador));
                }
                if(cb_usa.isChecked() && (valor.equals("2"))){
                    txt_usa.setText(";)");
                }
                if(cb_jap.isChecked() && (valor.equals("2"))){
                    double operador = dinero * 103.23;
                    txt_jap.setText(String.format("%.2f",operador));
                }
                if(cb_china.isChecked() && (valor.equals("2"))){
                    double operador = dinero * 6.6766;
                    txt_china.setText(String.format("%.2f",operador));
                }
                if(cb_mex.isChecked() && (valor.equals("2"))){
                    double operador = dinero * 18.795;
                    txt_mex.setText(String.format("%.2f",operador));
                }
                if(cb_euro.isChecked() && (valor.equals("2"))){
                    double operador = dinero * 0.0013200;
                    txt_euro.setText(String.format("%.2f",operador));
                }
                //Si seleciona moneda de origen Brasil
                if(cb_bra.isChecked() && (valor.equals("3"))){
                    txt_bra.setText(";)");
                }
                if(cb_chi.isChecked() && (valor.equals("3"))){
                    double operador = dinero * 210.86;
                    txt_chi.setText(String.format("%.2f",operador));
                }
                if(cb_col.isChecked() && (valor.equals("3"))){
                    double operador = dinero * 910.38;
                    txt_col.setText(String.format("%.2f",operador));
                }
                if(cb_usa.isChecked() && (valor.equals("3"))){
                    double operador = dinero * 0.30993;
                    txt_usa.setText(String.format("%.2f",operador));
                }
                if(cb_jap.isChecked() && (valor.equals("3"))){
                    double operador = dinero * 31.994;
                    txt_jap.setText(String.format("%.2f",operador));
                }
                if(cb_china.isChecked() && (valor.equals("3"))){
                    double operador = dinero * 2.0693;
                    txt_china.setText(String.format("%.2f",operador));
                }
                if(cb_mex.isChecked() && (valor.equals("3"))){
                    double operador = dinero * 5.8251;
                    txt_mex.setText(String.format("%.2f",operador));
                }
                if(cb_euro.isChecked() && (valor.equals("3"))){
                    double operador = dinero * 0.27769;
                    txt_euro.setText(String.format("%.2f",operador));
                }
                //Si seleciona moneda de origen Chile
                if(cb_bra.isChecked() && (valor.equals("4"))){
                    double operador = dinero * 0.0047400;
                    txt_bra.setText(String.format("%.2f",operador));
                }
                if(cb_chi.isChecked() && (valor.equals("4"))){
                    txt_chi.setText(";)");
                }
                if(cb_col.isChecked() && (valor.equals("4"))){
                    double operador = dinero * 4.3174;
                    txt_col.setText(String.format("%.2f",operador));
                }
                if(cb_usa.isChecked() && (valor.equals("4"))){
                    double operador = dinero * 0.0014700;
                    txt_usa.setText(String.format("%.2f",operador));
                }
                if(cb_jap.isChecked() && (valor.equals("4"))){
                    double operador = dinero * 0.15173;
                    txt_jap.setText(String.format("%.2f",operador));
                }
                if(cb_china.isChecked() && (valor.equals("4"))){
                    double operador = dinero * 0.0098100;
                    txt_china.setText(String.format("%.2f",operador));
                }
                if(cb_mex.isChecked() && (valor.equals("4"))){
                    double operador = dinero * 0.027620;
                    txt_mex.setText(String.format("%.2f",operador));
                }
                if(cb_euro.isChecked() && (valor.equals("4"))){
                    double operador = dinero * 0.0013200;
                    txt_euro.setText(String.format("%.2f",operador));
                }

                ScrollView sv = (ScrollView)findViewById(R.id.ScrollView01);
                sv.fullScroll(0);
            }
        });

        Button btnMap = (Button) findViewById(R.id.btnVerMap);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout rootLayout = (LinearLayout) findViewById(R.id.ly);
//                ArrayList<CheckBox> editTextList = new ArrayList<CheckBox>();
//                String[] arrMoney = new String[8];
                ArrayList<String> arrMoney = new ArrayList<String>();
                Integer contArr = 0;
                for(int i = 0; i < rootLayout.getChildCount(); i++) {
                    LinearLayout layoutInner = (LinearLayout) rootLayout.getChildAt(i);
                    for (Integer x = 0; x < layoutInner.getChildCount(); x++) {
//                        Log.i("checkInner",x.toString());
                        if (layoutInner.getChildAt(x) instanceof CheckBox) {
                            CheckBox ch = (CheckBox) layoutInner.getChildAt(x);
                            if (ch.isChecked()) {
                                arrMoney.add(ch.getText().toString());
//                                Log.i("Money",arrMoney.get(contArr));
//                                //Log.e("Cont",contArr.toString());
//
                                contArr++;
//                                editTextList.add( (CheckBox) layoutInner.getChildAt(x));
//                                Log.e("CheckBox", ch.getText().toString());
                            }
                        }

                    }
                }
                if(contArr > 0){
                    Boolean cheked = cb_bra.isChecked() == true || cb_chi.isChecked() == true
                            || cb_col.isChecked() == true || cb_china.isChecked() == true
                            || cb_euro.isChecked() == true || cb_jap.isChecked() == true
                            || cb_mex.isChecked() == true || cb_usa.isChecked() == true;
                    if(cheked){
                        Intent i = new Intent(ActivityThree.this, MapsActivity.class);
                        i.putExtra("Monedas",arrMoney);
                        startActivity(i);
                    }
                    Log.e("ok","Ok");
                }


            }
        });
    }
}
