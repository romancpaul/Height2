package com.HomeWork1;

//6

public class Main {

    public static void main(String[] args) {

        double inchToCentimeters = 2.54;
        double feetToCentimeters = 30.48;

        int centimeters = 166;

        double convertedFeetToCentimeters = (int) (centimeters / feetToCentimeters);
        double resultConversionInchToCentimeter = centimeters - (convertedFeetToCentimeters * feetToCentimeters);
        double convertedInchToCentimeters = resultConversionInchToCentimeter / inchToCentimeters;

        System.out.println((int)convertedFeetToCentimeters + " feet and " +
                (int)convertedInchToCentimeters + " inches." )  ;

    }
}
