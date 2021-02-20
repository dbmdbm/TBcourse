package exercises;

public class TemperatureConverterFtoC {
    public static void main(String[] args) {
        toCesius(100);
    }

    public static void toCesius(double fahrenheit) {
        if (fahrenheit < 0)
            System.out.println("Invalid value");
        double conversionFactor = 1.8;
        double celsius = (fahrenheit - 32) / conversionFactor;
        System.out.println(fahrenheit + " F = " + celsius + " C.");
    }
}
