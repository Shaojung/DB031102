package com.example.teacher.db031102;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    android.app.FragmentTransaction ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickA(View v)
    {
        ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.contentLayout, new AFragment(), "f_a");
        // ft.add(R.id.contentLayout, new AFragment());
        ft.commit();
    }
    public void clickB(View v)
    {
        ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.contentLayout, new BFragment(), "f_b");
        ft.commit();
    }
}
