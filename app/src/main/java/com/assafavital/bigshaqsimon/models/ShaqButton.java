package com.assafavital.bigshaqsimon.models;

import android.content.Context;
import android.util.Log;

import com.poetnerd.simonclone.R;

/**
 * Created by Assaf Avital on 12-Nov-17.
 */

public class ShaqButton {

    private static final String TAG = "ShaqButton";

    private boolean pressed;
    private int soundId;

    ShaqButton(Context context, int index) {
        pressed = false;
        soundId = ShaqPool.get().load(context, R.raw.shaq_button + index);
        Log.d(TAG, "Created button #" + index);
    }

    boolean isPressed() {
        return pressed;
    }

    int getSoundId() {
        return soundId;
    }

    void release() {

    }

    void press() {

    }
}
