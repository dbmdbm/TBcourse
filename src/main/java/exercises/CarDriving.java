package exercises;

public class CarDriving {

    public static void main(String[] args) {
        System.out.println(willRide(true,2));
    }

    public static boolean willRide(boolean ifRide, int route) {

        if (route < 1 || route > 3) {
            return false;
        } else if (route == 2) {
            return true;
        } return false;
    }
}
