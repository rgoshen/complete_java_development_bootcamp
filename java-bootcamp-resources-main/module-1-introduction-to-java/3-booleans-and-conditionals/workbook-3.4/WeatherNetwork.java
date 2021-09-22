public class WeatherNetwork {
    public static void main(String[] args) {

        int temp = 5;

        String forecast = "";

        if(temp <= 0){
            forecast = "The forecast is FREEZING! Stay home!";
        } else if (temp > 0 && temp < 10) {
            forecast = "The forecast is Chilly.  Wear a coat!";
        } else {
            forecast = "It' warm. Go outside!";
        }

        System.out.println(forecast);
    }
}