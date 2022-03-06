package co.edu.unbosque.model;

public class Coulomb {

    public static final double COULOMB_CONSTANT = 9e9;

    public static double coulombLaw(double q1, double q2, double distance) {
        return COULOMB_CONSTANT * ((q1 * q2) / (Math.pow(distance, 2)));
    }
}
