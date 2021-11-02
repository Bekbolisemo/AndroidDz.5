package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.myproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        initFragment();
    }



    private void initFragment() {
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_conteiner,new Fragment1()).commit();
    }


    public void click1(View view) {
        Fragment1 fragment1 = new Fragment1();
        FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction();
        ft1.replace(R.id.fragment_conteiner,fragment1);
        ft1.commit();
    }

    public void click2(View view) {
        Fragment2 fragment2 = new Fragment2();
        FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
        ft2.replace(R.id.fragment_conteiner,fragment2);
        ft2.commit();
    }

    public void click3(View view) {
        Fragment3 fragment3 = new Fragment3();
        FragmentTransaction ft3 = getSupportFragmentManager().beginTransaction();
        ft3.replace(R.id.fragment_conteiner,fragment3);
        ft3.commit();
    }

    public void click4(View view) {
        Fragment4 fragment4 = new Fragment4();
        FragmentTransaction ft4 = getSupportFragmentManager().beginTransaction();
        ft4.replace(R.id.fragment_conteiner,fragment4);
        ft4.commit();
    }

    public void click5(View view) {
        Fragment5 fragment5 = new Fragment5();
        FragmentTransaction ft5 = getSupportFragmentManager().beginTransaction();
        ft5.replace(R.id.fragment_conteiner,fragment5);
        ft5.commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}