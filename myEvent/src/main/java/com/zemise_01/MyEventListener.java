package com.zemise_01;

/**
 * @Author Zemise_
 * @Date 2023/3/19
 * @Description
 */
public interface MyEventListener {
    void onEvent(MyEventA event);

    void onEvent(MyEventB event);
}
