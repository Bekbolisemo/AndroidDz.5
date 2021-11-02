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
import android.widget.FrameLayout;

import com.example.myproject.databinding.Fragment1Binding;
import com.google.android.material.textfield.TextInputEditText;

public class Fragment1 extends Fragment {
    Fragment1Binding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = Fragment1Binding.inflate(LayoutInflater.from(getContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onClick();

    }

    private void onClick() {
     binding.nextBtn.setOnClickListener(v->{
         Fragment2 fragment2 = new Fragment2();

         Bundle bundle = new Bundle();
         bundle.putString("key",binding.emailEditText.getText().toString());
         fragment2.setArguments(bundle);
         FragmentTransaction ft = getParentFragmentManager().beginTransaction();
         ft.replace(R.id.fragment_conteiner,fragment2);
         ft.commit();
     });

    }


}