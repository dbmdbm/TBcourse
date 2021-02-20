package exercises;

public class SpeedConverterMain {

    public static void main(String[] args) {

        double miles = SpeedConverter.toMilesPerHour(30);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(100);
    }
}
