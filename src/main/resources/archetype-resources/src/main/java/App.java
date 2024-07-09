package $org.example;

import.java.util.Scanner;
import org.apache.http.HttpEntity;
import org.apache.http.entity.BasicHttpEntity;

public class WeatherAppData {

    priavte String date;
    private String locationName;
    priavte String metric;
    private final String API_KEY = "YMX5CP95D2LLVM4P4ABH5WNN4";

    public WeatherAppData (String Weatherdate, String WeatherlocationName, String Weathermetric) {
        date = Weatherdate;
        locationName = WeatherlocationName;
        metric = Weathermetric;
    }

    WeatherAppData data = new WeatherAppData()



}


