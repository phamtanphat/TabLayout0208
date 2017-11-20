package com.ptp.phamtanphat.tablayout0208;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewpagerAdapter viewpagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        viewpagerAdapter = new ViewpagerAdapter(getSupportFragmentManager());
        viewpagerAdapter.AddFragmentTitle(new Fragment_Android(),"Android");
        viewpagerAdapter.AddFragmentTitle(new Fragment_iOS(),"iOS");
        viewpagerAdapter.AddFragmentTitle(new Fragment_Android(),"Android");
        viewpagerAdapter.AddFragmentTitle(new Fragment_iOS(),"iOS");
        viewpagerAdapter.AddFragmentTitle(new Fragment_Android(),"Android");
        viewpagerAdapter.AddFragmentTitle(new Fragment_iOS(),"iOS");
        viewpagerAdapter.AddFragmentTitle(new Fragment_Android(),"Android");
        viewpagerAdapter.AddFragmentTitle(new Fragment_iOS(),"iOS");
        viewpagerAdapter.AddFragmentTitle(new Fragment_Android(),"Android");
        viewpagerAdapter.AddFragmentTitle(new Fragment_iOS(),"iOS");
        viewpagerAdapter.AddFragmentTitle(new Fragment_Android(),"Android");
        viewpagerAdapter.AddFragmentTitle(new Fragment_iOS(),"iOS");
        viewPager.setAdapter(viewpagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(android.R.drawable.btn_dialog);
        tabLayout.getTabAt(1).setIcon(android.R.drawable.btn_dropdown);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Toast.makeText(MainActivity.this, tab.getText(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void anhxa() {
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
    }
}
