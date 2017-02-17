package com.example.melentyev.sergey.memories;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class EventFragment extends Fragment {
    private Event mEvent;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mBestEventCheckBox;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mEvent = new Event();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_event, container, false);

        mTitleField = (EditText) v.findViewById(R.id.event_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mEvent.setTitle(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                //
            }
        });

        mDateButton = (Button) v.findViewById(R.id.event_date);
        mDateButton.setText(mEvent.getDate().toString());
        mDateButton.setEnabled(false);

        mBestEventCheckBox = (CheckBox) v.findViewById(R.id.event_best);
        mBestEventCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mEvent.setBest(isChecked);
            }
        });

        return v;
    }
}
