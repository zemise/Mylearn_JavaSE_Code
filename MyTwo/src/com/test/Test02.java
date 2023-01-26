package com.test;


import com.zemise_03.MyService;

import java.util.ServiceLoader;

public class Test02 {
    public static void main(String[] args) {
        ServiceLoader<MyService> myServices = ServiceLoader.load(MyService.class);
        for(MyService my: myServices){
            System.out.println(my);
            my.service();
        }
    }
}
