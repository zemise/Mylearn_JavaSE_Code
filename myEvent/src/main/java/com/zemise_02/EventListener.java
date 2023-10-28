package com.zemise_02;

import com.zemise_03.MouseEvent;

public interface EventListener {
    void handleEvent(Event event);

    default void handldeMouseEvent(MouseEvent event){
        //Do nothing
    }
}
