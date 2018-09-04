package com.example.rlcr.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    private EditText et_nombre, et_apellido, et_correo;
    private Button btn_entrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        et_nombre = (EditText) findViewById(R.id.et_nombre);
        et_apellido = (EditText) findViewById(R.id.et_apellido);
        et_correo = (EditText) findViewById(R.id.et_correo);
        btn_entrar = (Button) findViewById(R.id.btn_entrar);


        btn_entrar.setOnClickListener((new View.OnClickListener() {

                    public void onClick(View v) {

                    String nombre = et_nombre.getText().toString();
                    String apellido = et_apellido.getText().toString();
                    String correo = et_correo.getText().toString();

                    Toast.makeText(getApplicationContext(),

                     "Bienvenido don: " +     nombre +
                            apellido + " Su correo es:  " +
                            correo, Toast.LENGTH_LONG).show();



                        startActivity(new Intent(Menu.this,
                            Calculadora.class));


                    }
                })
        );



    }
}
