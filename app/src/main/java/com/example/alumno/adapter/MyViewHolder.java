package com.example.alumno.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 27/04/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    View itemView;
    public MyViewHolder(View itemView) {
        super(itemView);
        this.itemView = itemView;
    }
    public void setNombreApellido(String nombre,String Apellido)
    {
        TextView txNombre = (TextView) itemView.findViewById(R.id.TvNombre);
        TextView txApellido = (TextView) itemView.findViewById(R.id.TvApellido);
        txNombre.setText(nombre);
        txApellido.setText(Apellido);
    }

}
