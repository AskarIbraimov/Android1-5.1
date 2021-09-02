package com.example.android1_51.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import com.example.android1_51.R;
import com.example.android1_51.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.switchCase.setOnCheckedChangeListener((buttonView, isChecked) -> {
            switch (buttonView.getId()) {
                case R.id.switch_case:
                    if (isChecked) setImg(R.drawable.img2);
                    else setImg(R.drawable.img_two);
            }
        });

    }

    private void setImg(int img2) {
        binding.imgV.setImageResource(img2);
    }
}