package com.jaysen.daggar2_tests.dagger;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * com.jaysen.daggar2_tests
 * Created by jaysen.lin@foxmail.com on 2016/8/16.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Scope
public @interface MyScope {
}
