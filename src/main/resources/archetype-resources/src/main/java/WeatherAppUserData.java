package $org.example;

import.java.util.Scanner;
import org.apache.http.HttpEntity;
import org.apache.http.entity.BasicHttpEntity;

public class WeatherAppUserData {
    Scanner scanner = new Scanner(System.in);

    String userLocation;
    String userMetric;
    Strind userDate;

    System.out.println("Please enter your location: ");
    userLocation = scanner.nextLine();

    System.out.println("Please enter the metric you prefer: ");
    userMetric = scanner.nextLine();

     System.out.println("Please enter the date: ");
     userDate = scanner.nextLine();

    WeatherAppData data = new WeatherAppData (userDate,userLocation,userMetric);






    }




}


