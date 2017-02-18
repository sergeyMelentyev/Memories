package com.example.melentyev.sergey.memories;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class EventsList {

    private static EventsList sEventsList;
    private List<Event> mEvents;

    public static EventsList get(Context context) {
        if (sEventsList == null)
            sEventsList = new EventsList(context);
        return sEventsList;
    }

    private EventsList(Context context) {
        mEvents = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Event event = new Event();
            event.setTitle("Event #" + i);
            event.setBest(i % 2 == 0);
            mEvents.add(event);
        }
    }

    public Event getEvent(UUID id) {
        for (Event event : mEvents)
            if (event.getId().equals(id))
                return event;
        return null;
    }

}
