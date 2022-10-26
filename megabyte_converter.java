public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes >= 0) {
            int megaBytes = kiloBytes / 1024;
            float remKiloBytes = (((float)kiloBytes / 1024) - megaBytes) * 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + (int)remKiloBytes + " KB");
        } else {
            System.out.println("Invalid Value");
        }

    }
}