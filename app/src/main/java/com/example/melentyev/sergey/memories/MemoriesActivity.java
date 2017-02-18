package com.example.melentyev.sergey.memories;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MemoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_fragment_holder);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.main_activity_fragment_holder);
        if (fragment == null) {
            fragment = new EventFragmentController();
            fm.beginTransaction().add(R.id.main_activity_fragment_holder, fragment).commit();
        }
    }
}
