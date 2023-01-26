package com.zemise_03.impl;

import com.zemise_03.MyService;

public class zemise implements MyService {
    @Override
    public void service() {
        System.out.println("这是来自zemise的天天学习");
    }
}
