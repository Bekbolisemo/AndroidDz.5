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

import com.example.myproject.databinding.Fragment3Binding;


public class Fragment3 extends Fragment {
    private Fragment3Binding binding;
    private  String receive;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = Fragment3Binding.inflate(LayoutInflater.from(getContext()),container,false);
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
            receive = bundle.getString("key2");
            binding.textViewF3.setText(receive);
        }
    }

    private void onClick() {
        binding.buttonNextF3.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            Fragment4 fragment4 = new Fragment4();
            bundle.putString("Key3",receive);
            fragment4.setArguments(bundle);
            FragmentTransaction ft = getParentFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_conteiner,fragment4).commit();
        });
    }


}