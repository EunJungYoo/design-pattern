package observer.weather_push;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
