package com.example.melentyev.sergey.memories;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class EventLab {

    private static EventLab sEventLab;
    private List<Event> mEvents;

    public static EventLab get(Context context) {
        if (sEventLab == null)
            sEventLab = new EventLab(context);
        return sEventLab;
    }

    private EventLab(Context context) {
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
