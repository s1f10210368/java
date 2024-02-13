package final2.three;

public abstract class Liquid {
    protected final double volume;

    public Liquid(double volume){
        this.volume = volume;
    }

    public double getVolume(){
        return volume;
    }

    public abstract double getWeight();
}
