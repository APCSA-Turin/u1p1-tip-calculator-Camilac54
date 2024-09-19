package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
                
        
        double tip = Math.round(cost * ((double) percent * 0.01)) * 100.0 / 100.0;
        
        double totalCost = (tip + cost);

        double costPerPerson = (cost / people);
        
        double tipPerPerson = (costPerPerson * percent);
        double totalPersonCost = (tipPerPerson + costPerPerson);


        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + " $" + cost); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%");
        result.append("Total tip: " + " $" + tip);
        result.append("Total Bill with tip: " + " $" + totalCost);
        result.append("Per person cost before tip: " + " $" + costPerPerson);
        result.append("Tip per person: " + " $" + tipPerPerson);
        result.append("Total cost per person: " + " $" + totalPersonCost);
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        System.out.println(calculateTip(people,percent,cost));
    }
}