package org.example;

import java.util.Scanner;
import org.apache.http.HttpEntity;
import org.apache.http.entity.BasicHttpEntity;
import java.lang.StringBuilder;
import java.net.URL;

public class WeatherAppUserData {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userLocation;
        String userMeasurement;
        String userDate;
        String API_KEY = "YMX5CP95D2LLVM4P4ABH5WNN4";
        String apiEndPoint = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/";

        String method = "GET";

        System.out.println("Please enter your location: ");
        userLocation = scanner.nextLine();

        System.out.println("Please enter the measurement you prefer (us, uk, metric, or base): ");
        userMeasurement = scanner.nextLine();

        System.out.println("Please enter the date: ");
        userDate = scanner.nextLine();

            String urlLink = apiEndPoint + userLocation;

            StringBuilder keyParameters = new StringBuilder();
            keyParameters.append("&").append("unitGroup=").append(userMeasurement);
            keyParameters.append("&").append("key=").append(API_KEY);

            if ("GET".equals(method)) {
                urlLink.append("?").append(keyParameters);

                System.out.println(urlLink);

            }


try {
    URL url = new URL(urlLink);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");


    int responseNum = connection.getResponseCode();

    if (responseNum == 200) {
        StringBuilder weatherDataResponse = new StringBuilder();
        Scanner scanner2 = new Scanner(connection.getInputStream());
        while (scanner2.hasNext()) {
            weatherDataResponse.append(scanner2.nextLine());
        }


    }
}
        catch(Exception e){
            System.out.println("Error: Could not connect to API. Please try again.");

        }
    }

}


