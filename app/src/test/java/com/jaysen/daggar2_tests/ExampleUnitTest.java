package com.jaysen.daggar2_tests;

import com.jaysen.daggar2_tests.dagger.ApiModule;
import com.jaysen.daggar2_tests.dagger.DaggerMyComponent;
import com.jaysen.daggar2_tests.dagger.PumpModule;

import org.junit.Test;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
//    @Test
//    public void addition_isCorrect() throws Exception {
//        assertEquals(4, 2 + 2);
//    }


    @Test
    public void testDagger() {
//       MyComponet myComponet= DaggerExampleUnitTest_MyComponet.builder()
//                .apiModule(new com.jaysen.daggar2_tests.dagger.ApiModule())
//                .pumpModule(new com.jaysen.daggar2_tests.dagger.PumpModule())
//                .build();
//        myComponet.maker().brew();
        DaggerMyComponent.builder()
                .pumpModule(new PumpModule())
                .apiModule(new ApiModule())
                .build().maker().brew();
    }
}