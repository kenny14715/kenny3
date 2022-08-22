package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class xitunRecommendFragment extends Fragment {

    public xitunRecommendFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_xitunrecommend, container, false);
        Button btnXR1;
        btnXR1= view.findViewById(R.id.XRe1);
        btnXR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller = Navigation.findNavController(v);
                controller.navigate(R.id.action_xitunRecommendFragment_to_oneday_xitunFragment);
            }
        });
        return view;
    }
}
