package com.zouxianbin.android.slide;

import android.app.Application;

/**
 *Created by zouxianbin on 2017/6/19.
 */
public interface ActivityInterface {
    /**
     * Set the callback for activity lifecycle
     *
     * @param callbacks callbacks
     */
    void setActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks callbacks);
}
