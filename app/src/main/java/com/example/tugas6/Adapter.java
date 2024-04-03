package com.example.tugas6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {

    private ArrayList<Model> clubModel;

    public Adapter(ArrayList<Model> clubModel) {
        this.clubModel = clubModel;
    }

    @NonNull
    @Override
    public Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        viewHolder vh = new viewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.viewHolder holder, int position) {
    holder.namaClub.setText(clubModel.get(position).getNamaClub());
    holder.logoClub.setImageResource(clubModel.get(position).getLogoClub());
    }

    @Override
    public int getItemCount() {
        return clubModel.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView namaClub;
        ImageView logoClub;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            namaClub = itemView.findViewById(R.id.nama_club);
            logoClub = itemView.findViewById(R.id.Logo_club);
        }
    }
}
