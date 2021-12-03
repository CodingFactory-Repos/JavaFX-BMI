package me.loule.bmi.model;

public class BmiModel {
    private double size;
    private double weight;

    public BmiModel(Double size, Double weight) {
        this.size = size;
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Double getBmi() {
        if(this.size >= 100){
            setSize(this.size / 100);
        }

        return this.weight / (this.size * this.size);
    }
}
