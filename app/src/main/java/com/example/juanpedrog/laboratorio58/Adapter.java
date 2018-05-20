package com.example.juanpedrog.laboratorio58;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ListaViewHolder>{
    List<Item> datos;

    public Adapter(List<Item> datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public ListaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ListaViewHolder listaViewHolder=new ListaViewHolder(v);
        return listaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListaViewHolder holder, int position) {
        holder.number.setText(datos.get(position).getNumber());
        holder.date.setText(datos.get(position).getDate());
        holder.duration.setText(datos.get(position).getDuration());
        holder.type.setText(datos.get(position).getType());
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ListaViewHolder extends RecyclerView.ViewHolder{
        TextView number,date,duration,type;
        public ListaViewHolder(View itemView) {
            super(itemView);
            number=itemView.findViewById(R.id.number);
            date=itemView.findViewById(R.id.date);
            duration=itemView.findViewById(R.id.duration);
            type=itemView.findViewById(R.id.type);
        }
    }
}
