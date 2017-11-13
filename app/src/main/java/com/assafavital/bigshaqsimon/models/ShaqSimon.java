package com.assafavital.bigshaqsimon.models;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Assaf Avital on 12-Nov-17.
 */

public final class ShaqSimon {

    private static final String TAG = "ShaqSimon";

    private static final Random RNG = new Random();

    public static final int GRID_SIZE = 4 * 4;
    private List<ShaqButton> buttons;
    private GameState state;

    public interface Listener {
        void buttonStateChanged(int index);
        void multipleButtonStateChanged();
    }

    enum GameState {
        IDLE, LISTENING, PLAYING, LOSING, LOST, PAUSED
    }

    private List<Integer> currentSequence;

    public ShaqSimon(Context context) {
        buttons = new ArrayList<>();
        for(int buttonIndex = 0; i < GRID_SIZE; i++) {
            buttons.add(new ShaqButton(context, buttonIndex));
        }
        state = GameState.IDLE;
    }

    void start() {
        for(ShaqButton button : buttons) {
            button.release();
        }
        if(currentSequence == null) {
            currentSequence = new ArrayList<>();
        }
        currentSequence.clear();
        currentSequence.add(getRandomShaq());
        playNext();
    }

    void playNext() {

    }

    private int getRandomShaq() {
        return RNG.nextInt(GRID_SIZE);
    }
}
