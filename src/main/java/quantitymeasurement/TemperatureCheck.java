package quantitymeasurement;

public class TemperatureCheck {
    private final double temperature;
    private final Degree degree;

    enum Degree {CELSIUS,FAHRENHEIT}

    public double getTemperature() {
        return temperature;
    }

    public Degree getDegree() {
        return degree;
    }

    public TemperatureCheck(Degree degree, double temperature){
        this.degree = degree;
        this.temperature=temperature;
    }

    public boolean compare(TemperatureCheck that){
        if(that == null || this.getClass() != that.getClass()){
            return false;
        }
        if(this.getDegree().equals(that.getDegree())){
            return this.equals(that);
        }
        if(this.getDegree().equals(Degree.CELSIUS) && that.getDegree().equals(Degree.FAHRENHEIT)){
            return Double.compare(Math.round(this.getTemperature()*1.8)+32,that.getTemperature())==0;
        }
        if(this.getDegree().equals(Degree.FAHRENHEIT) && that.getDegree().equals(Degree.CELSIUS)){
            return Double.compare(this.getTemperature(),Math.round(that.getTemperature()*1.8)+32)==0;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemperatureCheck that = (TemperatureCheck) o;
        return Double.compare(that.temperature, temperature) == 0 && degree == that.degree;
    }
}
