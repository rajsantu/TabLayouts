package com.mainpackage.tablayouts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.mainpackage.tablelayouts.R;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);


        TabLayout tabLayout = findViewById(R.id.tabLayout);
        TabItem tabChat = findViewById(R.id.tabChats);
        TabItem tabStatus = findViewById(R.id.tabStatus);
        TabItem tabCals = findViewById(R.id.tabCalls);

        ViewPager viewPager = findViewById(R.id.viewpager);

        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        tabLayout.setupWithViewPager(viewPager);





    }
}