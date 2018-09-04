package com.example.rlcr.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {

    private EditText Epe1, Epe2, Epr1, Epr2, Eva1, Eva2, Eva3, Eva4, et_respuesta, et_examen, et_notafinal;
    private Button btn_resultado, btn_examen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        Epe1 = (EditText) findViewById(R.id.Epe1);
        Epe2 = (EditText) findViewById(R.id.Epe2);
        Epr1 = (EditText) findViewById(R.id.Epr1);
        Epr2 = (EditText) findViewById(R.id.Epr2);
        Eva1 = (EditText) findViewById(R.id.Eva1);
        Eva2 = (EditText) findViewById(R.id.Eva2);
        Eva3 = (EditText) findViewById(R.id.Eva3);
        Eva4 = (EditText) findViewById(R.id.Eva4);

        et_notafinal = (EditText) findViewById(R.id.et_notafinal);
        et_examen = (EditText) findViewById(R.id.et_examen);
        et_respuesta = (EditText) findViewById(R.id.et_respuesta);
      //  et_minimo = (EditText) findViewById(R.id.et_minimo);
        btn_resultado = (Button) findViewById(R.id.btn_resultado);
        btn_examen = (Button) findViewById(R.id.btn_examen);

    }

    public void btn_resultado(View v) {


        btn_resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int solemne1 = Integer.parseInt(Epe1.getText().toString());
                int solemne2 = Integer.parseInt(Epr1.getText().toString());
                int solemne3 = Integer.parseInt(Epe2.getText().toString());
                int solemne4 = Integer.parseInt(Epr2.getText().toString());
                int acum1 = Integer.parseInt(Eva1.getText().toString());
                int acum2 = Integer.parseInt(Eva2.getText().toString());
                int acum3 = Integer.parseInt(Eva3.getText().toString());
                int acum4 = Integer.parseInt(Eva4.getText().toString());

                double resSolemne = (solemne1 * 0.10) + (solemne2 * 0.15) + (solemne3 * 0.20) + (solemne4 * 0.25);
                int resEva = (acum1 + acum2 + acum3 + acum4) / 4;
                double totalEva = (resEva * 0.3);
                double sinexamen = (resSolemne + totalEva);




                et_respuesta.setText(Double.toString(sinexamen));


                if( sinexamen >= 4 ){

                    if (solemne1 < 4 || solemne2 < 4 || solemne3 < 4 || solemne4 < 4 )
                        Toast.makeText(getApplicationContext(),
                                "Debe rendir examen. Solemne inferior a 4  ", Toast.LENGTH_LONG).show();

                    else{

                        Toast.makeText(getApplicationContext(),
                                "Eximido!!!  ", Toast.LENGTH_LONG).show();
                    }

                }else{

                    Toast.makeText(getApplicationContext(),

                            "Rinde examen  " , Toast.LENGTH_LONG).show();


                }
            }
            });

    }



    public void btn_examen(View v) {


        btn_examen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int solemne1 = Integer.parseInt(Epe1.getText().toString());
                int solemne2 = Integer.parseInt(Epr1.getText().toString());
                int solemne3 = Integer.parseInt(Epe2.getText().toString());
                int solemne4 = Integer.parseInt(Epr2.getText().toString());
                int acum1 = Integer.parseInt(Eva1.getText().toString());
                int acum2 = Integer.parseInt(Eva2.getText().toString());
                int acum3 = Integer.parseInt(Eva3.getText().toString());
                int acum4 = Integer.parseInt(Eva4.getText().toString());

                int promedioexamen = Integer.parseInt(et_examen.getText().toString());

                double resSolemne = (solemne1 * 0.10) + (solemne2 * 0.15) + (solemne3 * 0.20) + (solemne4 * 0.25);
                int resEva = (acum1 + acum2 + acum3 + acum4) / 4;
                double totalEva = (resEva * 0.3);
                double sinexamen = (resSolemne + totalEva);

                double notapresentacion = (sinexamen * 0.7);
                double notaexamen = (promedioexamen * 0.3);
                double totalexamen = (notapresentacion + notaexamen);


                et_respuesta.setText(Double.toString(notapresentacion));
                et_notafinal.setText(Double.toString(totalexamen));


                if( totalexamen >= 3.99 ){


                        Toast.makeText(getApplicationContext(),
                                "Has aprobado la asignatura!!!  ", Toast.LENGTH_LONG).show();


                }else{

                    Toast.makeText(getApplicationContext(),

                            "Reprobado! Hiciste enojar a germansete :(  " , Toast.LENGTH_LONG).show();


                }
            }
        });

    }












}