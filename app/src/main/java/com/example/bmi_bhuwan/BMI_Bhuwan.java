package com.example.bmi_bhuwan;

public class BMI_Bhuwan {

    private double height, weight;

    public BMI_Bhuwan(double height, double weight){
        this.height = height;
        this.weight = weight;
    }
    public double calculate(){
        return weight / (height/100 * height/100);
    }

}
