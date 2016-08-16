package com.jaysen.daggar2_tests.dagger;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Lazy;

/**
 * com.jaysen.daggar2_tests
 * Created by jaysen.lin@foxmail.com on 2016/8/16.
 */
public class CoffeeMaker {
    private final Lazy<Heater> mHeater;
//    @Inject
//    @Named("soft")
    private final
    Pump mPump;

    @Inject
    CoffeeMaker(@CoffeeHeaterScope Lazy<Heater> heaterLazy, @Named("romantic") Pump pump) {
        this.mHeater = heaterLazy;
        this.mPump = pump;
    }
//    @Inject
//    CoffeeMaker(Lazy<Heater> heaterLazy) {
//        this.mHeater = heaterLazy;
//    }

    /**
     * 酝酿coffee
     */
    public void brew() {
        mHeater.get().on();
        mPump.pump();
        System.out.println("~~~ coffee brew success!~~~");
        mHeater.get().off();
    }
}
