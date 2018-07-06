package com.example.adityacomputers.fragmentdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleAddition extends Fragment {


    TextView textView;
    public SimpleAddition() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_simple_addition, container, false);
        textView=(TextView)view.findViewById(R.id.textview);
        return view;
    }
    //method to display the data onto the textview
    public void setNumber(String data)
    {
        //display the data on textview
        textView.setText(data);
    }
}
