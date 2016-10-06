package com.edu.cristiangamarra.amigos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by CRISTIAN GAMARRA on 05/10/2016.
 */
public class AmigosAdapter extends BaseAdapter {
    private List<Amigo> amigos;
    private Context context;

    public AmigosAdapter(List<Amigo> amigos ,Context context){
        this.amigos = amigos;
        this.context = context;

    }

    @Override
    public int getCount() {
        return amigos.size();
    }

    @Override
    public Object getItem(int position) {
        return amigos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return amigos.get(position).getId();
    }

    @Override
    public View getView(int position , View convetView, ViewGroup parent) {
        View view = convetView;
        if (convetView==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_amigo,null);
        }

        Amigo a = this.amigos.get(position);

        TextView textViewUsuario = (TextView) view.findViewById(R.id.textViewUsuario);
        TextView textViewEmail = (TextView) view.findViewById(R.id.textViewEmail);

        textViewUsuario.setText(a.getNombre());
        textViewEmail.setText((a.getEmail()));

        return view;


    }
}
