package com.example.sesion4_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnPrimero, btnSegundo, btnTercero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPrimero = findViewById(R.id.btnPrimero);
        btnSegundo = findViewById(R.id.btnSegundo);
        btnTercero = findViewById(R.id.btnTercero);
    }

    public void primerToast(View v){
        Context context = getApplicationContext();
        CharSequence mensaje = "1er Mensaje TOAST \n Cómputo Móvil";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, mensaje, duration);

        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);

        toast.show();

        //Toast integrado
        Toast.makeText(this, "Ventana Emergente (Inferior 1)", Toast.LENGTH_LONG).show();
    }

    public void segundoToast(View v){
        Context context = getApplicationContext();
        CharSequence mensaje = "2do Mensaje TOAST \n Cómputo Móvil";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, mensaje, duration);

        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);

        toast.show();

        //Toast integrado
        Toast.makeText(this, "Ventana Emergente (Inferior 2)", Toast.LENGTH_LONG).show();
    }

    public void tercerToast(View v){
        Context context = getApplicationContext();
        CharSequence mensaje = "3er Mensaje TOAST \n Cómputo Móvil";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, mensaje, duration);

        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);

        toast.show();

        //Toast integrado
        Toast.makeText(this, "Ventana Emergente (Inferior 3)", Toast.LENGTH_LONG).show();
    }

    //Toast personalizado con XML
    public void toastPersonalizadoXML1(View view){

        //Inflater => Ejecución, visualización, desplegado de una vista
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast2, null);

        Toast toastXML = new Toast(getApplicationContext());
        toastXML.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toastXML.setDuration(Toast.LENGTH_LONG);

        //Integración de los elementos
        toastXML.setView(layout);
        toastXML.show();
    }
}