package com.rudy.android_java_tabmenu_viewpager2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);



        VPAdapter vpAdapter = new VPAdapter(this);
        vpAdapter.addFragment(new Fragment1(), "CHATS");
        vpAdapter.addFragment(new Fragment2(), "STATUS");
        vpAdapter.addFragment(new Fragment3(), "CALLS");
        viewPager.setAdapter(vpAdapter);


        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> tab.setText("Tab " + (position + 1))).attach();
    }
}