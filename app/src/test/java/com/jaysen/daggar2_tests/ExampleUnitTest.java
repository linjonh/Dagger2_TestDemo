package com.jaysen.daggar2_tests;

import com.jaysen.daggar2_tests.dagger.ActivityMaker;
import com.jaysen.daggar2_tests.dagger.ActivityModule;
import com.jaysen.daggar2_tests.dagger.ApiModule;
import com.jaysen.daggar2_tests.dagger.DaggerActivityComponent;
import com.jaysen.daggar2_tests.dagger.DaggerMyComponent;
import com.jaysen.daggar2_tests.dagger.PumpModule;

import org.junit.Test;

import javax.inject.Inject;

import dagger.Component;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    //    @Test
//    public void addition_isCorrect() throws Exception {
//        assertEquals(4, 2 + 2);
//    }
    @Inject
    ActivityMaker maker;


    @Component(modules = ActivityModule.class)
    public interface ExampleTestComponent {
        void inject(ExampleUnitTest test);
    }

    @Test
    public void testDagger() {
//       MyComponet myComponet= DaggerExampleUnitTest_MyComponet.builder()
//                .apiModule(new com.jaysen.daggar2_tests.dagger.ApiModule())
//                .pumpModule(new com.jaysen.daggar2_tests.dagger.PumpModule())
//                .build();
//        myComponet.maker().brew();
        /*DaggerMyComponent.builder()
                .pumpModule(new PumpModule())
                .apiModule(new ApiModule())
                .build().maker().brew();
        DaggerActivityComponent.create()
        ;
//        .maker().print();*/
        DaggerExampleUnitTest_ExampleTestComponent.create().inject(this);
        maker.print();
    }
}