package com.example.frag;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends Acivity implements FormFragmentListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new FormFragment())
                    .commit();
        }
    }

    @Override
    public void onEquals(double value1, double value2){
        /* TODO: affichage de resulatat */
    }
}

/*protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState); count=0;
        setContentView(R.layout.activity_main);
        text=(TextView)findViewById(R.id.text);
        text.setText(""+count);
    }
    public vouid count(View view){
        count++; text.setText(""+count);
    }*/