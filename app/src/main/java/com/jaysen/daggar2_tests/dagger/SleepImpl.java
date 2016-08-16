package com.jaysen.daggar2_tests.dagger;

/**
 * Created by lin on 2016/8/16.
 */
public class SleepImpl implements Sleep {
    @Override
    public void getToSleep() {
        System.out.println("It's time to sleep!");
    }
}
