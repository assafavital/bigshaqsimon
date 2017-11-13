package com.assafavital.bigshaqsimon.models;

import android.media.AudioManager;
import android.media.SoundPool;

/**
 * Created by Assaf Avital on 12-Nov-17.
 */

class ShaqPool extends SoundPool {

    static ShaqPool SHAQ_POOL = null;

    private ShaqPool(int maxStreams, int streamType, int srcQuality) {
        super(maxStreams, streamType, srcQuality);
    }

    static ShaqPool get() {
        if(SHAQ_POOL == null) {
            SHAQ_POOL = new ShaqPool(ShaqSimon.GRID_SIZE, AudioManager.STREAM_MUSIC, 0);
        }

        return SHAQ_POOL;
    }
}
