package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ElearningAdapter extends RecyclerView.Adapter<ElearningAdapter.ElearningViewHolder> {


    private ArrayList<Elearning> dataList;

    public ElearningAdapter(ArrayList<Elearning> dataList) {
        this.dataList = dataList;
    }

    @Override
    public ElearningViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item, parent, false);
        return new ElearningViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ElearningViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtJumlah.setText(dataList.get(position).getJumlah());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ElearningViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtJumlah;

        public ElearningViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_elearning);
            txtJumlah = (TextView) itemView.findViewById(R.id.txt_jumlah_elearning);

        }
    }
}