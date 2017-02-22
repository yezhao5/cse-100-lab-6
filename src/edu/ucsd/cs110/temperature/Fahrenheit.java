package edu.ucsd.cs110.temperature;

/**
 * Created by yezha on 2/15/2017.
 */
public class Fahrenheit extends Temperature{
    public Fahrenheit (float t){
        super (t);
    }

    @Override
    public Temperature toCelsius() {
        float v = (float)((this.getValue()-32)/1.8);
        this.setV(v);
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString(){
        float v = this.getValue();
        return v+" F";
    }
}
