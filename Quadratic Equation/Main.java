package com.company;

public class Main {

    public static void main(String[] args) {
        QuadraticEquation q1 = new QuadraticEquation(0.0, 2.0, 1.0);
        QuadraticEquation q2 = new QuadraticEquation(1.0, 0.0, -1.0);
        QuadraticEquation q3 = new QuadraticEquation(1.0, -2.0, 1.0);
        QuadraticEquation q4 = new QuadraticEquation(1.0, 0.0, 1.0);
        q1.solveEquation();
        q2.solveEquation();
        q3.solveEquation();
        q4.solveEquation();
        System.out.println("q1 solution:" + q1.getX1() + " " + q1.getX2());
        System.out.println("q2 solution:" + q2.getX1() + " " + q2.getX2());
        System.out.println("q3 solution:" + q3.getX1() + " " + q3.getX2());
        System.out.println("q4 solution:" + q4.getX1() + " " + q4.getX2());
        
        /*  OUTPUT:
            q1 solution:-0.5 -0.5
            q2 solution:1.0 -1.0
            q3 solution:1.0 1.0
            q4 solution:null null
         */
        
    }
}

