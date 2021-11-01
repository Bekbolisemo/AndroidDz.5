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


public class Fragment4 extends Fragment {
    private TextView textView;
    private  String receive;
    private Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_4, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        receive();
        onClick();
    }
    private void receive() {
        Bundle bundle = this.getArguments();
        if (bundle != null){
            receive = bundle.getString("Key3");
            textView.setText(receive);
        }

    }

    private void onClick() {
        button.setOnClickListener(view -> {
            Bundle bundle = this.getArguments();
            Fragment5 fragment5 = new Fragment5();
            bundle.putString("key4",receive);
            fragment5.setArguments(bundle);
            FragmentTransaction ft = getParentFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_conteiner,fragment5).commit();
        });
    }

    private void initView(View view) {
        textView = view.findViewById(R.id.textView_f4);
        button = view.findViewById(R.id.button_next_f4);
    }
}