package com.zemise_02;

public class MyClass extends BaseListener {
    @EventHandler
    public void onEvent(Event event) {
        // Do something with the event

    }

    public void doSomething() {
        Event event = new Event();
        EventDispatcher dispatcher = new EventDispatcher();
        dispatcher.addListener(this);
        dispatcher.dispatch(event);
    }
}
