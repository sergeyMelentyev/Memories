package com.example.melentyev.sergey.memories;

import java.util.Date;
import java.util.UUID;

class Event {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    Event() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() { return mId; }
    public Date getDate() { return mDate; }
    public void setDate(Date date) { mDate = date; }
    public boolean isSolved() { return mSolved; }
    public void setSolved(boolean solved) { mSolved = solved; }
    public String getTitle() { return mTitle; }
    public void setTitle(String title) { mTitle = title; }

}