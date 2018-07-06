package com.example.adityacomputers.fragmentdemo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etnum;
    Button btnsubmit;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initilize the resources
        etnum=(EditText)findViewById(R.id.numberET);
        btnsubmit=(Button)findViewById(R.id.button);
        //create the object of the fragment simpleaddition
        final SimpleAddition simpleAddition=new SimpleAddition();
        //get the instance of fragmentmanager using getSupportFragmentManager()
        FragmentManager fragmentManager=getSupportFragmentManager();
        //add the fragment instance of simpleaddition to the fragmenttransaction
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction().add(R.id.frame_container,simpleAddition,null);
        fragmentTransaction.commit();
        //add event handler onclick to call the fragment SimpleAddittion object setNumber method to display the data of edittext on textvieew
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=etnum.getText().toString();
                simpleAddition.setNumber(data);
            }
        });
    }
}
