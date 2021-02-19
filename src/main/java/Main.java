public class Main {

    public static void main(String[] args) {

        double miles = SpeedConverter.toMilesPerHour(20);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(100);
    }
}
