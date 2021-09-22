public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        printTemperatures(noon, fahrenheitToCelsius(noon));
        printTemperatures(evening, fahrenheitToCelsius(evening));
        printTemperatures(midnight, fahrenheitToCelsius(midnight));
    }


    public static double fahrenheitToCelsius (double fahrenheit){
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return celsius;
    }

    /**
     * Function name: fahrenheitToCelsius - converts fahrenheit to celcius
     * @param fahrenheit (double)
     * @return celsius (double)
     * 
     * Inside the function:
     * 1. returns the temperature in celcius. C = (F - 32) * 5/9. 
     */

     
    public static void printTemperatures(double f, double c) {
        System.out.println("F: " + f);
        System.out.println("C: " + c + "\n");
    }

    /**
     * Function name: printTemperatures – prints both temperature values. 
     * @param fahrenheit (double)
     * 
     * Inside the function: 
     *  1. prints: F: <temperature in fahrenheit>.
     *  2. prints: C: <temperature in celsius> . 
     */
}