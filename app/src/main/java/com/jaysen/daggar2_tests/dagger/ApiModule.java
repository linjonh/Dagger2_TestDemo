package com.jaysen.daggar2_tests.dagger;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * com.jaysen.daggar2_tests
 * Created by jaysen.lin@foxmail.com on 2016/8/16.
 * <p>
 * Module 类是用来提供各种实例构造的集合，每个方法都是静态的。
 * 以解决
 * <ul>
 * 1、接口无法实例化。
 * 2、第三方SDK无法编写注解的。
 * 3、配置对象必须配置的问题。
 * <ul>
 * 即
 * <ul>
 * <li>Interfaces can’t be constructed.</li>
 * <li>Third-party classes can’t be annotated.</li>
 * <li>Configurable objects must be configured!</li>
 * </ul>
 * </p>
 */
@Module(includes = PumpModule.class)
public class ApiModule {

    @Provides
    @Named("romantic")
    Pump providePump(Heater heater) {
        return new RomanticPump(heater);
    }

    @Provides
    @CoffeeHeaterScope
    Heater provideHeater() {
        return new ElectricHeater();
    }
    @Provides
    @Singleton
    Heater provideManualHeater() {
        return new ManulHeater();
    }
}
