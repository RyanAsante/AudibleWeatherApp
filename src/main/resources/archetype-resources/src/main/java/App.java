package org.example;

import java.util.Scanner;
//import org.apache.http.HttpEntity;
//import org.apache.http.entity.BasicHttpEntity;

public class App {

    private String date;
    private String locationName;
    private String measurement;
    private final String API_KEY = "YMX5CP95D2LLVM4P4ABH5WNN4";
    private String apiEndPoint = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/";

    public App (String Weatherdate, String WeatherlocationName, String Weathermeasurement) {
        date = Weatherdate;
        locationName = WeatherlocationName;
        measurement = Weathermeasurement;
    }

   public String getDate() {
        return date;
   }
   public String getLocationName() {
        return locationName;
   }
   public String getMeasurement() {
        return measurement;
   }
   public String getApiEndPoint() {
      return apiEndPoint;
   }

}


