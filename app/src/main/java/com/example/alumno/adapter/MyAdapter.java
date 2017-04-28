package com.example.alumno.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by alumno on 27/04/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder > {

    private List<Persona> personas;
    public MyAdapter(List<Persona> personas)
    {
        this.personas = personas;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        MyViewHolder vh = new MyViewHolder(v);
        Log.d("Adapter","onCreate");

        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Persona p =personas.get(position);
        holder.setNombreApellido(p.getNombre(),p.getApellido());
        Log.d("Adapter","Bind");

    }

    @Override
    public int getItemCount() {
        Log.d("Adapter","ItemCount");
        return this.personas.size();

    }
}
