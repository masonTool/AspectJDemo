package com.mapeiyu.cleardemo;

import android.content.Context;
import android.os.Parcel;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiSelector;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    private UiDevice mDevice;

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
//        Context appContext = InstrumentationRegistry.getTargetContext();
//        assertEquals("com.mapeiyu.cleardemo", appContext.getPackageName());
        mDevice.pressBack();
        mDevice.pressBack();
        // Home键
        mDevice.pressHome();
        // 找到设置并点击
        mDevice.findObject(new UiSelector().text("多媒体")).click();

        mDevice.findObject(new UiSelector().text("音乐")).click();

        mDevice.findObject(new UiSelector().text("我的")).click();

        mDevice.findObject(new UiSelector().text("本地音乐")).click();

        mDevice.findObject(new UiSelector().text("随机播放")).click();
    }

    @Before
    public void prepare() {
        mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

//        UiObject cancelButton = mDevice.findObject(new UiSelector().instance()
//                .text("Cancel")
//                .className("android.widget.Button"));
    }
}
