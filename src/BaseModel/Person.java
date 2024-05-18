package BaseModel;

import java.util.ArrayList;

public class Person {
    // grid represented as array list
    private ArrayList<ArrayList<MuscleFibre>> muscleFibres = new ArrayList<ArrayList<MuscleFibre>>();
    private double muscleMass;
    private int lift;
    private static Hormones hormoneController;
    private void liftWeights(){};
    private void sleep(){};
    private void developMuscle(){};
    public void performDailyActivity(){};

    public void go(int ticks){};
}
