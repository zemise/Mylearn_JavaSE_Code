package com.zemise_02;

import com.zemise_03.MouseEvent;

public class BaseListener implements EventListener {
    @Override
    public void handleEvent(Event event) {
        // Do something with the event
    }

    @Override
    public void handldeMouseEvent(MouseEvent event) {
        System.out.println("点击");
    }
}
