package com.rudy.android_java_tabmenu_viewpager2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class VPAdapter extends FragmentStateAdapter {

    private final ArrayList<Fragment> fragmentsArrayList = new ArrayList<>();
    private final ArrayList<String> fragmentsTitle = new ArrayList<>();

    public VPAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragmentsArrayList.get(position);
    }

    @Override
    public int getItemCount() {
        return fragmentsArrayList.size();
    }

    public void addFragment(Fragment fragment, String title) {
        fragmentsArrayList.add(fragment);
        fragmentsTitle.add(title);
    }

}
