package by.bsu2.enummap;


public enum LocomotiveType {
    DISEL(880), ELECTRIC(9360), NUCLEAR;
    private int power; // kiloWatt
    LocomotiveType() {
    }
    LocomotiveType(int power) {
        this.power = power;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    @Override
    public String toString() {
        return super.toString() + " power=" + power;
    }
}
