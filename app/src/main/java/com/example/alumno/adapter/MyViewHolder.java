package com.example.alumno.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alumno on 27/04/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    private TextView txNombre;
    private TextView txApellido;

    View itemView;
    public MyViewHolder(View itemView) {
        super(itemView);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("xd","xd");
            }
        });

        this.txNombre = (TextView) itemView.findViewById(R.id.TvNombre);
        this.txApellido = (TextView) itemView.findViewById(R.id.TvApellido);
    }
    public void setNombreApellido(String nombre,String Apellido)
    {

        txNombre.setText(nombre);
        txApellido.setText(Apellido);
    }

}
