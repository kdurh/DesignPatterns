import java.util.Observable;
import java.util.Observer;

public class StaticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    public StaticsDisplay(Observable observable) {
        observable.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            float temp = weatherData.getTemperature();
            tempSum += temp;
            numReadings++;

            if(temp > maxTemp) {
                maxTemp = temp;
            }

            if(temp < minTemp) {
                minTemp = temp;
            }

            display();
        }
    }
}
