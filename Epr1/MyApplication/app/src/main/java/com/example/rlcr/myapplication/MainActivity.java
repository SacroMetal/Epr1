package com.example.rlcr.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_entrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_entrar = (Button) findViewById(R.id.btn_entrar);


        btn_entrar.setOnClickListener((new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Toast.makeText(getApplicationContext(),
                                "Bienvenido a calculadora de notas",  Toast.LENGTH_SHORT).show();


                        startActivity(new Intent(MainActivity.this,
                                Menu.class));


                    }
                })
        );



    }
}
