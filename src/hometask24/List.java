package hometask24;

import java.util.ArrayList;

public class List {

  public static ArrayList<String> getSpecialCities(ArrayList<String> cityList) {
      int counter = 0;
      ArrayList cityList1 = new ArrayList();
        for (int i = 0; i < cityList.size(); i++) {
            if (cityList.get(i).contains("К") == true) {
                cityList1.add(counter++,cityList.get(i));
            }
        }


        return cityList1;


    }
}
