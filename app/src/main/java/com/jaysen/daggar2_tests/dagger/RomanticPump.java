package com.jaysen.daggar2_tests.dagger;

import javax.inject.Inject;

/**
 * com.jaysen.daggar2_tests
 * Created by jaysen.lin@foxmail.com on 2016/8/16.
 */
public class RomanticPump implements Pump {
    private final Heater mHeater;

    @Inject
    RomanticPump(@CoffeeHeaterScope Heater heater) {
        mHeater = heater;
    }

    @Override
    public void pump() {
        if (mHeater.isHot()) {
            System.out.println("RomanticPump :~~~~ pump coffee ~~~~~");
        }
    }
}
