package com.example.android1_51.ui.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.android1_51.ui.fragments.RecyclerFragment;
import com.example.android1_51.ui.fragments.SecondFragment;
import com.example.android1_51.ui.fragments.SwitchFragment;

public class PagerAdapter extends FragmentStateAdapter {


    private String[] titles  = {"Exchange","Date & Time","More"};

    public String[] getTitles() {
        return titles;
    }

    public PagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new RecyclerFragment();
            case 2:
                return new SecondFragment();
            case 1:
                return new SwitchFragment();

        }
        return new RecyclerFragment();
    }


    @Override
    public int getItemCount() {
        return 3;
    }
}
