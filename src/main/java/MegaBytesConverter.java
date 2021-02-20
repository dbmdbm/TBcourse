public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid value");
        }
        int megaBytes = 0;
        int remaining = 0;
        int conversion = 1024;

        megaBytes = kiloBytes / conversion;
        remaining = kiloBytes % conversion;

        System.out.println(kiloBytes +" KB = " + megaBytes + " MB and " + remaining + " KB.");

    }
}
