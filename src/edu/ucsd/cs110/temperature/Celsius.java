package edu.ucsd.cs110.temperature;

/**
 * Created by yezha on 2/15/2017.
 */
public class Celsius extends Temperature {
    public Celsius (float t){
        super (t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit()
    {
        float v = (float) (this.getValue()*1.8 +32);
        this.setV(v);
        return this;
    }

    public String toString(){
        float v = this.getValue();
        return v+" C";
    }
}
