package by.bsu2.phaser;

public class Event {
    private String name;
    private float winFirst;
    private float winSecond;

    public Event(String name, float winFirst, float winSecond) {
        this.name = name;
        this.winFirst = winFirst;
        this.winSecond = winSecond;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWinFirst() {
        return winFirst;
    }

    public void setWinFirst(float winFirst) {
        this.winFirst = winFirst;
    }

    public float getWinSecond() {
        return winSecond;
    }

    public void setWinSecond(float winSecond) {
        this.winSecond = winSecond;
    }
}
