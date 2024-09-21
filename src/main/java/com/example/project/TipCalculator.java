package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
                
        
        double tip = cost * (percent / 100.0);
        
        double totalCost = cost + tip;

        double costPerPerson = (cost / people);
        
        double tipPerPerson = tip / people;

        double totalPersonCost = (tipPerPerson + costPerPerson);


        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + String.format("%.2f", cost) + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        result.append("Total tip: $" + String.format("%.2f", tip) + "\n");
        result.append("Total Bill with tip: $" + String.format("%.2f", totalCost) + "\n");
        result.append("Per person cost before tip: $" + String.format("%.2f", costPerPerson) + "\n");
        result.append("Tip per person: $" + String.format("%.2f", tipPerPerson) + "\n");
        result.append("Total cost per person: $" + String.format("%.2f", totalPersonCost) + "\n");
        result.append("-------------------------------\n");

        // I learned how to round with String.format from here: https://www.w3schools.com/java/ref_string_format.asp

        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 2;
        int percent = 5;
        double cost = 29.56;
        System.out.println(calculateTip(people,percent,cost));
    }
}