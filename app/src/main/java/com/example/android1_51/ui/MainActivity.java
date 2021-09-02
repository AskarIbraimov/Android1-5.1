package com.example.android1_51.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android1_51.R;
import com.example.android1_51.databinding.ActivityMainBinding;
import com.example.android1_51.ui.adapters.PagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private PagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setViewPager();
    }

    private void setViewPager() {
        adapter = new PagerAdapter(this);
        binding.pager.setAdapter(adapter);
        new TabLayoutMediator(binding.tabs, binding.pager,
                (tab, position) -> tab.setText(adapter.getTitles()[position])).attach();
    }
}