package com.jaysen.daggar2_tests.dagger;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lin on 2016/8/16.
 */
@Module
public class ActivityModule {
    @Provides
    Shower provideShower(){
        return new ShowerImpl();
    }
    @Provides
    Sleep provideSleep() {
        return new SleepImpl();
    }

    @Provides
    GetUp provideGetup() {
        return new GetUpImpl();
    }
}
