package com.jaysen.daggar2_tests.dagger;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * com.jaysen.daggar2_tests
 * Created by jaysen.lin@foxmail.com on 2016/8/16.
 */
@Module
public class PumpModule {
    @Provides
    @Named("soft")
    Pump providePump(Heater heater) {
        return new SoftPump(heater);
    }
}
