package com.example.melentyev.sergey.memories;

import java.util.Date;
import java.util.UUID;

class Event {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mBest;

    Event() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    UUID getId() { return mId; }
    Date getDate() { return mDate; }
    void setDate(Date date) { mDate = date; }
    boolean isBest() { return mBest; }
    void setBest(boolean best) { mBest = best; }
    String getTitle() { return mTitle; }
    void setTitle(String title) { mTitle = title; }

}