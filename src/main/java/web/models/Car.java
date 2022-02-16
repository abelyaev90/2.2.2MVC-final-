package web.models;

public class Car {
    private String model;
    private  int series;
    private  String enginesType;

    public Car(String model, int series, String enginesType) {
        this.model = model;
        this.series = series;
        this.enginesType = enginesType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getEnginesType() {
        return enginesType;
    }

    public void setEnginesType(String enginesType) {
        this.enginesType = enginesType;
    }
}
