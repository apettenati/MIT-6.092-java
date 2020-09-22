public class GravityCalculator {
    // position of falling time
    // x(t) = 0.5 × at2 + vit + xi

    double gravity = -9.81; // earth's gravity in m/s^2
    double initialVelocity = 0.0;
    double fallingTime = 10.0;
    double initialPosition = 0.0;
    double finalPosition = 0.0;


    public double finalPosition() {
        finalPosition = 0.5 * (gravity * (fallingTime * fallingTime)) + (initialVelocity * fallingTime) + initialPosition;
        return finalPosition;
    }

    public static void main(String[] arguments) {
        GravityCalculator gc = new GravityCalculator();
        System.out.println("The object's position after " + gc.fallingTime +" seconds is " + gc.finalPosition() +" m.");
    }
}
// done! correct