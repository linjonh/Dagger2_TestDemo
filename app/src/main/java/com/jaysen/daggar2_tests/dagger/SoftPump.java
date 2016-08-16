package com.jaysen.daggar2_tests.dagger;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * com.jaysen.daggar2_tests
 * Created by jaysen.lin@foxmail.com on 2016/8/16.
 */
public class SoftPump implements Pump {
    private final Heater mHeater;

    @Inject
    SoftPump(@CoffeeHeaterScope Heater heater) {
        mHeater = heater;
    }

    @Override
    @Named("soft")
    public void pump() {
        if (mHeater.isHot()) {
            System.out.println("~~~~ soft pump~~~~");
        }
    }
}
