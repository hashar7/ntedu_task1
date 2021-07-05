package com.company;

/**
 * Class for solving quadratic equations:
 * a * x^2 + b * x + c = 0;
 */
public class QuadraticEquation {

    /**
     * Roots of the equation
     */
    private Double x1;
    private Double x2;

    /**
     * Coefficients of the equation:
     * a * x^2 + b * x + c = 0;
     */
    private final Double a;
    private final Double b;
    private final Double c;

    /**
     * Nested class to find discriminant.
     */
    public class Discriminant {

        /**
         * Discriminant value.
         */
        private final Double disc_value;

        /**
         * Constructor that calculates discriminant of given quadratic equation.
         *
         * @param equation — quadratic equation.
         */
        public Discriminant(QuadraticEquation equation) {
            disc_value = equation.b * equation.b - 4 * equation.a * equation.c;
        }

        /**
         * Get discriminant value.
         *
         * @return discriminant value.
         */
        public Double getDiscriminant() {
            return disc_value;
        }

        /**
         * Check whether discriminant is valid or not.
         *
         * @return true if discriminant is zero or greater, false otherwise.
         */
        public boolean isValid() {
            return disc_value >= 0.0;
        }
    }

    /**
     * Default quadratic equation constructor.
     */
    public QuadraticEquation() {
        a = 0.0;
        b = 0.0;
        c = 0.0;
    }

    /**
     * Quadratic equation constructor from given coefficients.
     *
     * @param a coefficient
     * @param b coefficient
     * @param c coefficient
     */
    public QuadraticEquation(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Method that solves given quadratic equation.
     */
    public void solveEquation() {
        if (isQuadratic()) {
            Discriminant discriminant = new Discriminant(this);
            if (!discriminant.isValid()) {
                x1 = null;
                x2 = null;
            } else {
                x1 = (-b + Math.sqrt(discriminant.getDiscriminant())) / (2 * a);
                x2 = (-b - Math.sqrt(discriminant.getDiscriminant())) / (2 * a);
            }
        } else {
            x1 = -c / b;
            x2 = -c / b;
        }
    }

    /**
     * Check whether given equation is quadratic or not.
     *
     * @return true if "a" coefficient is not null, false otherwise.
     */
    public boolean isQuadratic() {
        return Math.abs(a) > 2 * Double.MIN_VALUE;
    }

    /**
     * Get first root of given equation.
     *
     * @return first root of given equation.
     */
    public Double getX1() {
        return x1;
    }

    /**
     * Get second root of given equation.
     *
     * @return second root of given equation.
     */
    public Double getX2() {
        return x2;
    }

}
