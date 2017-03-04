package com.example.melentyev.sergey.memories.Controller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.melentyev.sergey.memories.R;

public abstract class SingleFragmentActivity extends AppCompatActivity {

    abstract Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = createFragment();
            manager.beginTransaction().add(R.id.fragment_container, fragment, null).commit();
        }
    }
}