package pt.up.fe.lendea.model.layout.elements;

public class Timer {
    private int milliseconds;
    private int seconds;

    public Timer() {}

    public int getMilliseconds() {return milliseconds;}
    public void increaseMilliseconds() {this.milliseconds++;}

    public void resetMilliseconds() {this.milliseconds = 0;}
    public int getSeconds() {return seconds;}

    public void increaseSeconds() {this.seconds++;}
}