public class Main {
    public static double convertCmToMeter(double cm) {
        return cm / 100;
    }

    public static double convertMeterToCm(double meter) {
        return meter * 100;
    }

    public static double convertMeterToKm(double meter) {
        return meter / 1000;
    }

    public static double convertKmToMeter(double km) {
        return km * 1000;
    }

    public static void main(String[] args) {
        double cm = 150;
        double meter = 1.5;
        double km = 0.001;

        double meterFromCm = convertCmToMeter(cm);
        double cmFromMeter = convertMeterToCm(meter);
        double kmFromMeter = convertMeterToKm(meter);
        double meterFromKm = convertKmToMeter(km);

        System.out.println(cm + " سم = " + meterFromCm + " متر");
        System.out.println(meter + " متر = " + cmFromMeter + " سم");
        System.out.println(meter + " متر = " + kmFromMeter + " كم");
        System.out.println(km + " كم = " + meterFromKm + " متر");
    }
}













