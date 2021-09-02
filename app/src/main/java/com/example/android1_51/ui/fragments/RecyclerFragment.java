package com.example.android1_51.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android1_51.R;
import com.example.android1_51.databinding.FragmentRecyclerBinding;
import com.example.android1_51.ui.adapters.Adapter;
import com.example.android1_51.ui.model.CoinBase;

import java.util.ArrayList;

public class RecyclerFragment extends Fragment {

    private FragmentRecyclerBinding binding;
    private Adapter adapter;
    private ArrayList<CoinBase> list = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new Adapter();
        addList();
    }

    private void addList() {
        for (int i = 0; i < 20; i++) {
            list.add(new CoinBase("V-coin","1.00",R.drawable.coins));
        }
        adapter.setList(list);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRecyclerBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.coinRec.setAdapter(adapter);

    }
}