package com.example;


import java.text.DecimalFormat;
import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        double avgScored=0;
        double score;

        DecimalFormat twodec= new DecimalFormat("#.00");

        String[] playerNames =
                {
                        "Bobby Portis",
                        "Christiano Felicio",
                        "D'Vauntes Smith-Rivera",
                        "Denzel Valentine",
                        "Dough McDermott",
                        "Dwyane Wade",
                        "Isaiah Canaan",
                        "J.J Avila",
                        "Jerain Grant",
                        "Jimmy Butler",
                        "Mikola Mirotic",
                        "Paul Zipser",
                        "Rajon Rondo",
                        "Robin Lopez",
                        "Spencer Dinwiddie",
                        "Taj Gibson",
                        "Thomas Walkup",
                        "Tony Snell"
                };
        double[] avgRebounds =
                {
                        7.0,
                        .7,
                        1,
                        1,
                        4.7,
                        2.3,
                        0.0,
                        0.0,
                        .7,
                        2.3,
                        4.7,
                        1.5,
                        5.5,
                        3.0,
                        3.3,
                        6.7,
                        1.0,
                        3.0
                };
        double[] pointsScored =
                {
                        5.0,
                        2.3,
                        0.0,
                        4.0,
                        9.3,
                        12.7,
                        4.3,
                        0.0,
                        4.0,
                        10.7,
                        8.0,
                        6.0,
                        8.0,
                        7.7,
                        8.7,
                        13.7,
                        0.0,
                        9.7
                };
        double[] threePointPercentage =
                {
                        20.0,
                        0.0,
                        0.0,
                        0.0,
                        33.3,
                        71.4,
                        25.0,
                        0.0,
                        20.0,
                        100.0,
                        26.7,
                        0.0,
                        0.0,
                        0.0,
                        0.0,
                        0.0,
                        0.0,
                        37.5

                };


        //assign first element of an array to largest and smallest
        double smallest = pointsScored[0];
        double largetst = pointsScored[0];

        for (int i = 1; i < pointsScored.length; i++) {
            avgScored = pointsScored[i] + avgScored;

        }
        double avgScoredFinal = avgScored/18;
        System.out.print("AVG Score is : "+twodec.format(avgScoredFinal));

        

        System.out.println(threePointPercentage[1]);

    }
}