package com.example.melentyev.sergey.memories;

import android.support.v4.app.Fragment;

public class MainActivityManager extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new EventFragmentController();
    }

}