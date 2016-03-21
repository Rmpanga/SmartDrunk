package com.example.richardmpanga.smartdrunk;

/**
 * Created by richardmpanga on 3/6/16.
 */

import org.junit.Assert;


import org.junit.Test;

public class TestingDatabase {


    public TestingDatabase(){

    }



    //AndroidJUnit4 aj4 = new AndroidJUnit4(this.getClass(), null);

    @Test
    public void testSimpleDrinkInfoObject(){
        DrinkInfo drinkInfo = new DrinkInfo();
        Assert.assertEquals( null, drinkInfo.getDrinkName());
    }

    @Test
    public void dbNotNull(){
        LocalDrinkInfoDatabase db = LocalDrinkInfoDatabase.getInstance();
        Assert.assertNotEquals(null, db);
    }

    @Test
    public void dbHashMapNotNull(){

        LocalDrinkInfoDatabase db = LocalDrinkInfoDatabase.getInstance();
        Assert.assertNotEquals(null ,db.getDB());
    }

    @Test
    public void createDrinkCache(){

        ImageCache lruDrinkInfoCase = ImageCache.getInstance();
        Assert.assertNotEquals(null ,lruDrinkInfoCase);

    }

    @Test
    public void cacheExists(){

        ImageCache lruDrinkInfoCase = ImageCache.getInstance();

       Assert.assertNotEquals(null ,lruDrinkInfoCase.getCache());
    }


    @Test
    public void cacheEmpty() {

        ImageCache lruDrinkInfoCase = ImageCache.getInstance();

        Assert.assertEquals(true, lruDrinkInfoCase.cacheEmpty());
    }



}
