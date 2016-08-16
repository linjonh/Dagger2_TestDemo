package com.jaysen.daggar2_tests.dagger;

/**
 * com.jaysen.daggar2_tests
 * Created by jaysen.lin@foxmail.com on 2016/8/16.
 */
public class ElectricHeater implements Heater {
    boolean heating;

    @Override
    public void on() {
        System.out.println("electirc heater on! ~~~~ heating ~~~~~");
        heating = true;
    }

    @Override
    public void off() {
        System.out.println("electirc heater off!");
        this.heating = false;
    }

    @Override
    public boolean isHot() {
        return heating;
    }
}
