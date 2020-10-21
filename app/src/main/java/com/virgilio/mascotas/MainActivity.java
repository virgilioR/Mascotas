package com.virgilio.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar actionBarCustom = (Toolbar) findViewById(R.id.actionBarCustom);
        //actionBarCustom.setTitleTextColor(getResources().);
        setSupportActionBar( actionBarCustom );

        rvMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager( this );
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rvMascotas.setLayoutManager(llm);

        initMascotas();

        rvMascotas.setAdapter( new MascotaAdaptador( mascotas ) );

    }

    public void initMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add( new Mascota(R.drawable.app1, "Dogui", 5) );
        mascotas.add( new Mascota(R.drawable.app2, "Tarzán", 1) );
        mascotas.add( new Mascota(R.drawable.app3, "Talvi", 2) );
        mascotas.add( new Mascota(R.drawable.app4, "Manini", 11) );
        mascotas.add( new Mascota(R.drawable.app5, "Mujica", 10) );
        mascotas.add( new Mascota(R.drawable.app6, "Cebolla", 4) );
        mascotas.add( new Mascota(R.drawable.app7, "Ragnar", 20) );
        mascotas.add( new Mascota(R.drawable.app8, "Floki", 2) );
    }

    public void goToFavorites(View v){
        Intent i = new Intent( this, Favoritas.class );
        startActivity(i);
    }
}