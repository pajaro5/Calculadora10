package com.unir.pablo.calculadora10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**Creado por Pablo Robayo **/
public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSumar(View v){
        EditText n1 = (EditText)findViewById(R.id.txtN1);
        EditText n2 = (EditText)findViewById(R.id.txtN2);
        TextView resultado = (TextView)findViewById(R.id.txtResultado);

        int nu1 = Integer.parseInt(n1.getText().toString());
        int nu2 = Integer.parseInt(n2.getText().toString());
        int suma = nu1 + nu2;
        resultado.setText(String.valueOf(suma));
    }

    public void onRestar(View v){
        EditText n1 = (EditText)findViewById(R.id.txtN1);
        EditText n2 = (EditText)findViewById(R.id.txtN2);
        TextView resultado = (TextView)findViewById(R.id.txtResultado);

        int nu1 = Integer.parseInt(n1.getText().toString());
        int nu2 = Integer.parseInt(n2.getText().toString());
        int resta = nu1 - nu2;
        resultado.setText(String.valueOf(resta));
    }

    public void onMultiplicar(View v){
        EditText n1 = (EditText)findViewById(R.id.txtN1);
        EditText n2 = (EditText)findViewById(R.id.txtN2);
        TextView resultado = (TextView)findViewById(R.id.txtResultado);

        int nu1 = Integer.parseInt(n1.getText().toString());
        int nu2 = Integer.parseInt(n2.getText().toString());
        int producto = nu1 * nu2;
        resultado.setText(String.valueOf(producto));
    }

    public void onDividir(View v){
        EditText n1 = (EditText)findViewById(R.id.txtN1);
        EditText n2 = (EditText)findViewById(R.id.txtN2);
        TextView resultado = (TextView)findViewById(R.id.txtResultado);

        double nu1 = Double.parseDouble(n1.getText().toString());
        double nu2 = Double.parseDouble(n2.getText().toString());
        if(nu2 == 0){
            resultado.setText("No se puede dividir para cero");
        }
        else {
            double cociente = nu1 / nu2;
            resultado.setText(String.valueOf(cociente));
        }

    }

}
