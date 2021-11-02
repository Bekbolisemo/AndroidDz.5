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

import com.example.myproject.databinding.Fragment4Binding;


public class Fragment4 extends Fragment {
    private Fragment4Binding binding;
    private  String receive;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = Fragment4Binding.inflate(LayoutInflater.from(getContext()),container,false);
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
            receive = bundle.getString("Key3");
            binding.textViewF4.setText(receive);
        }

    }

    private void onClick() {
        binding.buttonNextF4.setOnClickListener(view -> {
            Bundle bundle = this.getArguments();
            Fragment5 fragment5 = new Fragment5();
            bundle.putString("key4",receive);
            fragment5.setArguments(bundle);
            FragmentTransaction ft = getParentFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_conteiner,fragment5).commit();
        });
    }

}