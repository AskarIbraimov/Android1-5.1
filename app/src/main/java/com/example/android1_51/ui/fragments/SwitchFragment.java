package com.example.android1_51.ui.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android1_51.R;
import com.example.android1_51.databinding.FragmentSwitchBinding;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SwitchFragment extends Fragment {

    private FragmentSwitchBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onResume() {
        super.onResume();
        binding.curTime.setText(new SimpleDateFormat("HH:mm:ss yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSwitchBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

}