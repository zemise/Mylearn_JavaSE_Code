package com.zemise_03;

import com.zemise_02.BaseListener;
import com.zemise_02.EventDispatcher;

/**
 * @Author Zemise_
 * @Date 2023/3/19
 * @Description
 */
public class testMain {

    public static void main(String[] args) {
        MouseEvent mouseEvent = new MouseEvent();
        EventDispatcher dispatcher = new EventDispatcher();
        BaseListener listener = new BaseListener();
        dispatcher.addListener(listener);

        dispatcher.dispatch(mouseEvent);
    }

}
