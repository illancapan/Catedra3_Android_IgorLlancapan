package com.example.catedra3android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_act extends AppCompatActivity {

    private EditText userId, passwordId;
    private String user, pass;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userId = (EditText)findViewById(R.id.txtUsuario);
        passwordId = (EditText)findViewById(R.id.txtContrasena);
    }

    public void Menu(View v){

         user = userId.getText().toString();
         pass = passwordId.getText().toString();

        if (user.equalsIgnoreCase("android") && pass.equalsIgnoreCase("123") ){
            Intent i = new Intent(this, Menu_act.class);
            startActivity(i);
        }
        else {
            Toast.makeText(this, "Ha Ocurrido un Error\nIngrese los Datos Nuevamente", Toast.LENGTH_LONG).show();
            Limpiar();
            }
        }

        private void Limpiar(){

        userId.setText("");
        passwordId.setText("");

        }
    }
