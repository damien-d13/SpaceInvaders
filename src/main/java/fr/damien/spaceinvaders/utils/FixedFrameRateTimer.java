package fr.damien.spaceinvaders.utils;

import javafx.animation.AnimationTimer;

public abstract class FixedFrameRateTimer extends AnimationTimer {

    private double frameRateWanted;
    private long timeNeededBetweenTicks;

    private final long NANOS_IN_A_SECOND = 1_000_000_000L;

    private long nanoLastTickStamp;
    private long nanoTimeSinceLastTick;

    private double frameRate;
    private float frameCount = 0;
    private long deltaTime = 0;
    private long timeCounter = 0;
    private long last = System.nanoTime();

    public FixedFrameRateTimer(double FPSWanted) {

        timeNeededBetweenTicks = (long) (NANOS_IN_A_SECOND / FPSWanted);
//        System.out.println(timeNeededBetweenTicks);
    }

    public double getFrameRate() {return frameRate;}

    @Override
    public void handle(long now) {
        deltaTime = now - last;
        last = now;
        timeCounter += deltaTime;
        nanoTimeSinceLastTick = now - nanoLastTickStamp;
        if (nanoTimeSinceLastTick > timeNeededBetweenTicks) {
            nanoLastTickStamp = now;
            frameCount++;
            loop();
        }
        if (timeCounter > NANOS_IN_A_SECOND) {
            frameRate = frameCount;
            frameCount = 0;
            timeCounter %= NANOS_IN_A_SECOND;
        }
    }


    protected abstract void loop();
}


