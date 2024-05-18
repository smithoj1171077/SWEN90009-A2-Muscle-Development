package BaseModel;

public class MuscleFibre {
    // should not be static because if muscle slow twitch, the max size is larger
    private double maxFibreSize = 4;
    private static double minFibreSize;
    private boolean fastTwitch;
    private double fibreSize;
    private double catabolicHormone;
    private double anabolicHormone;
    public void grow(){};
    public void regulateMuscle(){};

}
