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


public class Fragment2 extends Fragment {
    private TextView textView;
    private Button button;
    private String receive;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_2, container, false);
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
          receive = bundle.getString("key");
          textView.setText(receive);
        }

    }

    private void onClick() {
        button.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            Fragment3 fragment3 = new Fragment3();
            bundle.putString("key2",receive);
            fragment3.setArguments(bundle);
            FragmentTransaction ft = getParentFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_conteiner,fragment3).commit();
        });
    }

    private void initView(View view) {
        textView = view.findViewById(R.id.textView_f2);
        button = view.findViewById(R.id.button_next_f2);
    }


}
