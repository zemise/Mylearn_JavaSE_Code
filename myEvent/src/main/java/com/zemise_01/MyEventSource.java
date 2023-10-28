package com.zemise_01;

import java.beans.EventHandler;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MyEventSource {
    // 保存监听器的列表
    private List<MyEventListener> listeners = new ArrayList<>();

    // 注册监听器
    public void addEventListener(MyEventListener listener) {
        listeners.add(listener);
    }

    // 触发事件
    public void fireEvent(MyEventA event) {
        for (MyEventListener listener :listeners) {
            // 查找带有 @EventHandler 注解的方法，并调用它们处理事件
            Method[] methods = listener.getClass().getMethods();
            for (Method method : methods) {
                if(method.isAnnotationPresent((Class<? extends Annotation>) EventHandler.class)){
                    try{
                        method.invoke(listener,event);
                    }catch (IllegalAccessException | InvocationTargetException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
