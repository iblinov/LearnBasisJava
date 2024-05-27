package by;

public enum MusicStyle {
    JAZZ("Jazz"), CLASSIC("Classic"), ROCK("Rock");
    private String nameStyle;
    MusicStyle(String nameStyle) {
        this.nameStyle = nameStyle;
    }
    public void info() {
        System.out.println("is " + nameStyle + " " + this.name());

    }
}
