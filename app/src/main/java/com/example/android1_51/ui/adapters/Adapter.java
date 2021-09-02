package com.example.android1_51.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1_51.databinding.ItemElementBinding;
import com.example.android1_51.ui.model.CoinBase;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<CoinBase> list = new ArrayList<>();
    private ItemElementBinding binding;

    public void setList(ArrayList<CoinBase> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemElementBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull ItemElementBinding itemView) {
            super(itemView.getRoot());
        }

        public void onBind(CoinBase coinBase) {
            binding.valuta.setImageResource(coinBase.getCoin());
            binding.coinName.setText(coinBase.getCoinName());
            binding.status.setText("USD "+coinBase.getStatus());
        }
    }
}
