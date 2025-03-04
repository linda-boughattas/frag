package com.example.frag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ResultFragment#} factory method to
 * create an instance of this fragment.
 */
public class ResultFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.fragment_result,container,false);
        TextView textView=(TextView) view.findViewById(R.id.textView);
        textView.setText(""+value());

        return view;
    }

    public double value(){
        /* TODO */
    }
}