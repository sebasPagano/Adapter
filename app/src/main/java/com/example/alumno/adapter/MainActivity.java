package com.example.alumno.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView RV = (RecyclerView) super.findViewById(R.id.personas);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Sebastian","Pagano"));
        personas.add(new Persona("Sebastian2","Pagano2"));
        personas.add(new Persona("Sebastian3","Pagano3"));
        personas.add(new Persona("Sebastian4","Pagano4"));

        RecyclerView.LayoutManager lm = new LinearLayoutManager(this); //de que manera va a presentar la informacion
        RV.setLayoutManager(lm);
        MyAdapter myAdapter = new MyAdapter(personas);
        RV.setAdapter(myAdapter);

    }
}
