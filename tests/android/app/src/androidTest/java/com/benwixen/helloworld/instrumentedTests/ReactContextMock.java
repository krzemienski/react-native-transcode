package com.benwixen.helloworld.instrumentedTests;
import android.support.test.InstrumentationRegistry;

import com.facebook.react.bridge.ReactApplicationContext;

public class ReactContextMock extends ReactApplicationContext {

    public ReactContextMock() {
        super(InstrumentationRegistry.getContext());
    }
}

