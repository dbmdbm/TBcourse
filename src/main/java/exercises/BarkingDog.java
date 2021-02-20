package exercises;

public class BarkingDog {
    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean ifBarking, int timeNow) {

        if (timeNow < 0 || timeNow > 23) {
            return false;
        } else if ((ifBarking && (timeNow < 8 || timeNow > 22))) {
            return true;
        }
        return false;
    }
}

