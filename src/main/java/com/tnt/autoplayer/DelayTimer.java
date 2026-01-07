package com.tnt.autoplayer;

public class DelayTimer {

    private int ticks;

    public boolean ready() {
        if (ticks > 0) {
            ticks--;
            return false;
        }
        return true;
    }

    public void set(int ticks) {
        this.ticks = ticks;
    }
}
