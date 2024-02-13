package final2.three;

public class Oil extends Liquid{
    public Oil(double volume){
        super(volume);
    }

    public double getWeight(){
        return 0.9 * volume;
    }
}
