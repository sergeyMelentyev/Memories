package com.example.melentyev.sergey.memories;

import android.support.v4.app.Fragment;

public class EventListActivityManager extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new EventListFragmentController();
    }

}