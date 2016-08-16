package com.jaysen.daggar2_tests.dagger;

import javax.inject.Inject;

/**
 * Created by lin on 2016/8/16.
 */
public class ActivityMaker {
    private final Shower mShower;
    @Inject
    Sleep mSleep;
    @Inject
    GetUp mGetup;

    @Inject
    ActivityMaker(Shower shower) {
        this.mShower = shower;
    }

    public void print() {
        System.out.println("Activity maker live life start!");
        mShower.shower();
        mSleep.getToSleep();
        mGetup.getUp();
    }
}
