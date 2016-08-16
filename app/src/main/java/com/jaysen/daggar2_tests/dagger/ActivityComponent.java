package com.jaysen.daggar2_tests.dagger;

import dagger.Component;

/**
 * Created by lin on 2016/8/16.
 */

@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    ActivityMaker maker();
}
