package com.zemise_02;

import java.util.ArrayList;
import java.util.List;

public class EventDispatcher {
    private List<EventListener> listeners = new ArrayList<>();

    public void addListener(EventListener listener) {
        listeners.add(listener);
    }

    public void removeListener(EventListener listener) {
        listeners.remove(listener);
    }

    public void dispatch(Event event) {
        for (EventListener listener : listeners) {
            listener.handleEvent(event);
        }
    }
}
