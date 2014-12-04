package com.arolla.jam.shop;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainHelperTest {

    @Test
    public void should_create_main_helper_from_my_injector() {

        //Given
        ApplicationScope applicationScope = anApplicationScope();

        //When
        ApplicationMainHelper myMainHelper = ApplicationInjector.injectMainHelper(applicationScope);

        //Then
        assertThat(myMainHelper).isNotNull();
    }

    private static ApplicationScope anApplicationScope(String... args) {
        return new ApplicationScope(args);
    }

}
