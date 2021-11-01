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
import com.google.android.material.textfield.TextInputEditText;

public class Fragment1 extends Fragment {

    private TextInputEditText email;
    private Button btn;
    private FrameLayout frame;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        onClick();

    }

    private void onClick() {
     btn.setOnClickListener(v->{
         Fragment2 fragment2 = new Fragment2();

         Bundle bundle = new Bundle();
         bundle.putString("key",email.getText().toString());
         fragment2.setArguments(bundle);
         FragmentTransaction ft = getParentFragmentManager().beginTransaction();
         ft.replace(R.id.fragment_conteiner,fragment2);
         ft.commit();
     });

    }

    private void initView(View view) {
        frame = view.findViewById(R.id.fragment_conteiner);
        btn = view.findViewById(R.id.next_btn);
        email = view.findViewById(R.id.email_EditText);

    }
}