package com.virgilio.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Favoritas extends AppCompatActivity {

    private ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager( this );
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascotas.setLayoutManager(llm);

        initMascotas();

        rvMascotas.setAdapter( new MascotaAdaptador( mascotas ) );
    }

    public void initMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add( new Mascota(R.drawable.app7, "Ragnar", 20) );
        mascotas.add( new Mascota(R.drawable.app4, "Manini", 11) );
        mascotas.add( new Mascota(R.drawable.app5, "Mujica", 10) );
        mascotas.add( new Mascota(R.drawable.app1, "Dogui", 5) );
        mascotas.add( new Mascota(R.drawable.app8, "Floki", 2) );
    }
}