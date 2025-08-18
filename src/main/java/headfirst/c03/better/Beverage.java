package headfirst.c03.better;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class Beverage {
    protected String description = "Unknown Beverage";
    private boolean milk;
    private boolean soy;
    private boolean mocha;
    private boolean whip;

    public String getDescription() {
        return description;
    }

    public double cost() {
        double cost = 0.0;
        if (hasMilk()) cost += 0.5;
        if (hasSoy()) cost += 0.5;
        if (hasMocha()) cost += 0.5;
        if (hasWhip()) cost += 0.5;
        return cost;
    }

    public boolean hasMilk() {
        return milk;
    }
    public void setMilk(boolean milk) {
        this.milk = milk;
    }
    public boolean hasSoy() {
        return soy;
    }
    public void setSoy(boolean soy) {
        this.soy = soy;
    }
    public boolean hasMocha() {
        return mocha;
    }
    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }
    public boolean hasWhip() {
        return whip;
    }
    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}