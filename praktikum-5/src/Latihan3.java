public class Latihan3 {
    // Celsius ke Fahrenheit
    static double konversiSuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Celsius ke Fahreinheit atau kelvin
    static double konversiSuhu(double celsius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return (celsius * 9 / 5) + 32;
        } else if (skalaTujuan.equalsIgnoreCase("Kelvin")) {
            return celsius + 273.15;
        }
        return celsius;
    }

    public static void main(String[] args) {
        double suhu = 25;

        System.out.println("KONVERSI SUHU:");
        System.out.println("Suhu Celsius = " + suhu);
        System.out.println("Celsius ke Fahrenheit = " + konversiSuhu(suhu));
        System.out.println("Celsius Ke Kelvin = " + konversiSuhu(suhu,"Kelvin"));
    }
}
