package com.example.inzynierka;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ObiektAdapter extends RecyclerView.Adapter<ObiektAdapter.ViewHolder> {

    private List<Obiekt> obiektList;
    private Main4Activity main4Activity;

    public ObiektAdapter(Main4Activity main4Activity, List<Obiekt> obiektList){
        this.obiektList=obiektList;
        this.main4Activity=main4Activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(main4Activity).inflate(R.layout.activity_obiekt,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nameText.setText(obiektList.get(position).getNazwa());
        holder.cityText.setText(obiektList.get(position).getMiasto());
    }

    @Override
    public int getItemCount() {
       return obiektList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        View widok;
        public TextView nameText;
        public TextView cityText;

        public ViewHolder(View itemView){
            super(itemView);
            nameText=(TextView)itemView.findViewById(R.id.nazwaText);
            cityText=(TextView)itemView.findViewById(R.id.miastoText);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Obiekt obiekt = obiektList.get(getAdapterPosition());
            Intent intent = new Intent(main4Activity, Main5Activity.class);
            intent.putExtra("obiekt", obiekt);
            main4Activity.startActivity(intent);

        }
    }
}
