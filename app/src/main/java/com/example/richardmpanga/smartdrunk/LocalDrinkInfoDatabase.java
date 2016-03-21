package com.example.richardmpanga.smartdrunk;

import android.util.LruCache;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by richardmpanga on 3/5/16.
 */
public class LocalDrinkInfoDatabase {
    private static LocalDrinkInfoDatabase ourInstance = new LocalDrinkInfoDatabase();

    public static LocalDrinkInfoDatabase getInstance() {
        return ourInstance;
    }

    private Map<String, DrinkInfo> drinksDataBase;

    private LruCache<String, DrinkInfo> drinkInfoCache;

    private LocalDrinkInfoDatabase() {
        init();
    }

    /**
     * Initializes the class
     */
    private void init(){
        drinksDataBase = new HashMap<String, DrinkInfo>();
    }


    /**
     *  Returns true if the drink entered by the user in in the database
     * @param searchQuery
     * @return
     */



    public boolean containsDrink(String searchQuery){

        if (drinksDataBase.containsKey(searchQuery.trim().toLowerCase())) {
            return true;
        }
        else {
            return false;
        }
    }

    public DrinkInfo searchForDrink(String searchQuery){

        DrinkInfo drinkInfo = drinksDataBase.get(searchQuery);
        return drinkInfo;
    }

    //TODO Implement method to populate db via filereader
    //TODO Determine How to get the image ?
    public void populateLocalDrinkInfoDatabase(String... lines ) {

        for (String line : lines ){
            String [] seperations = line.split(" ");

            String key = seperations[0];
            String value = seperations[1];

        }
    }

    public void addDrinkInfo(String key, DrinkInfo drinkInfo){

        drinksDataBase.put(key, drinkInfo);
    }


    //For testing purposes
    public Map<String, DrinkInfo> getDB(){
        return drinksDataBase;
    }

    public void insertStockNamesAndImagesFromFile(){

        DrinkInfo drinkInfo = new DrinkInfo();
        drinkInfo.setDrinkName("test");
        drinkInfo.setDrinkName("info");

    }
}
