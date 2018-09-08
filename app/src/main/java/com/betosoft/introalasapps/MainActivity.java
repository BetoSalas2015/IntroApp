package com.betosoft.introalasapps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    TextView edtSalario, edtHoras, edtResultado;
    Button btnCalcula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtHoras = findViewById(R.id.edtHoras);
        edtSalario = findViewById(R.id.edtSalario);
        edtResultado = findViewById(R.id.edtResultado);
        btnCalcula = findViewById(R.id.btnCalculaSalario);

        btnCalcula.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int salario, horas;
        double total;
        if(view.getId() == R.id.btnCalculaSalario) {
            salario = Integer.parseInt( edtSalario.getText().toString() );
            horas = Integer.parseInt( edtHoras.getText().toString());
            if(horas <= 40)
                total = salario * horas;
            else
                total = (40 * salario) + ((horas - 40) *  (salario * 1.5));
            edtResultado.setText( Double.toString( total ));
        }
    }
}
