package co.edu.unbosque.model;

public class Coulomb {

    public static final double COULOMB_CONSTANT = 9e9;

    public static double calculateElectricForce(double q1, double q2, double distance) {
        return COULOMB_CONSTANT * ((q1 * q2) / (Math.pow(distance, 2)));
    }

    public static double calculateElectricField(double q, double distance) {
        return COULOMB_CONSTANT * (q) / (Math.pow(distance, 2));
    }


    public static double assignUnit(String unit, double value) {
        if (unit.equalsIgnoreCase("Micro")) {
            return value * Math.pow(10, -6);
        } else if (unit.equalsIgnoreCase("Pico")) {
            return value * Math.pow(10, -12);
        } else if (unit.equalsIgnoreCase("Nano")) {
            return value * Math.pow(10, -9);
        }
        return 0.0;
    }
}
