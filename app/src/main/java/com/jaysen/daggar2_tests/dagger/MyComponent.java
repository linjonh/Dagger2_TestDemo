package com.jaysen.daggar2_tests.dagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * com.jaysen.daggar2_tests.dagger
 * Created by jaysen.lin@foxmail.com on 2016/8/16.
 */
@CoffeeHeaterScope
@Component(modules = ApiModule.class)
public interface MyComponent {
    CoffeeMaker maker();
    void inject(RomanticPump romanticPump);
}
