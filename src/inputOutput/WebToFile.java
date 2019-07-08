package inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;

public class WebToFile {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://raw.githubusercontent.com/fivethirtyeight/data/master/airline-safety/airline-safety.csv");
        PrintWriter out = new PrintWriter("plane_incidents_85-99.csv");

        InputStreamReader urlIn = new InputStreamReader(url.openStream());
        BufferedReader in = new BufferedReader(urlIn);

        String inputLine;
        ArrayList<String> airlinesStats = new ArrayList<>();

        while ((inputLine = in.readLine()) != null) {
            airlinesStats.add(inputLine);
        }

        in.close();

        airlinesStats.remove(0);
//        airline,avail_seat_km_per_week,incidents_85_99,fatal_accidents_85_99,fatalities_85_99,incidents_00_14,fatal_accidents_00_14,fatalities_00_14
        int incidents = 0;
        int fatal_accidents = 0;
        int fatalities = 0;

        int count = 0;

        for (String airline: airlinesStats) {
            String[] parts = airline.split(",");
            incidents += Integer.parseInt(parts[2]);
            fatal_accidents += Integer.parseInt(parts[3]);
            fatalities += Integer.parseInt(parts[4]);
            count++;
        }

        out.print("Total incidents: " + incidents);
        out.print("\n");
        out.print("Total fatal incidents: " + fatal_accidents);
        out.print("\n");
        out.print("Total fatalities: " + fatalities);
        out.print("\n");
        out.print("Average incidents: " + incidents / count);
        out.print("\n");
        out.print("Average fatal incidents: " + fatal_accidents / count);
        out.print("\n");
        out.print("Average fatalities: " + fatalities / count);

        out.flush();
    }
}