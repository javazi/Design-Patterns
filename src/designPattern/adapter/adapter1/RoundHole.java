package designPattern.adapter.adapter1;

public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public boolean fit(RoundPeg radius){
        return this.getRadius()>= radius.getRadius();
    }
}
