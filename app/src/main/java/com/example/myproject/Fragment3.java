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


public class Fragment3 extends Fragment {
    private TextView textView;
    private  String receive;
    private Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_3, container, false);
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
            receive = bundle.getString("key2");
            textView.setText(receive);
        }
    }

    private void onClick() {
        button.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            Fragment4 fragment4 = new Fragment4();
            bundle.putString("Key3",receive);
            fragment4.setArguments(bundle);
            FragmentTransaction ft = getParentFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_conteiner,fragment4).commit();
        });
    }

    private void initView(View view) {
        textView = view.findViewById(R.id.textView_f3);
        button = view.findViewById(R.id.button_next_f3);
    }
}