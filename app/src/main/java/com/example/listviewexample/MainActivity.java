package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView miPrimeraLista;
    ArrayAdapter<String> adaptadorLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        miPrimeraLista = (ListView) findViewById( R.id.lista);
        String [] miListaStings = {
                "Johanna",
                "Jonathan",
                "Alejandro",
                "Cristian",
                "Luiza",
                "JAIBER",
                "ENRIQUE",
                "WALTHER"
        };
        adaptadorLista = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                miListaStings
        );
        miPrimeraLista.setAdapter( adaptadorLista );
    }
}