package com.example.myproject;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.myproject.databinding.Fragment2Binding;


public class Fragment2 extends Fragment {
    private Fragment2Binding binding;
    private String receive;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = Fragment2Binding.inflate(LayoutInflater.from(getContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        receive();
        onClick();

    }



    private void receive() {
        Bundle bundle = this.getArguments();
        if (bundle != null){
          receive = bundle.getString("key");
          binding.textViewF2.setText(receive);
        }

    }

    private void onClick() {
        binding.buttonNextF2.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            Fragment3 fragment3 = new Fragment3();
            bundle.putString("key2",receive);
            fragment3.setArguments(bundle);
            FragmentTransaction ft = getParentFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_conteiner,fragment3).commit();
        });
    }




}
