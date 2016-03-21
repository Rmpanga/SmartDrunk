package com.example.richardmpanga.smartdrunk;

import android.graphics.Bitmap;
import android.media.Image;
import android.widget.ImageView;

/**
 * Created by richardmpanga on 3/5/16.
 */

//import java.awt.image.BufferedImage;

public class DrinkInfo {

    public DrinkInfo(String drinkName, String info, ImageView imageView) {

        this.drinkName = drinkName;
        this.information = info;
        this.imageView = imageView;

    }

    public DrinkInfo(){


    }

    private String drinkName;

    private String information;

    private ImageView imageView;


    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public void setImageView(Bitmap image){

        imageView.setImageBitmap(image);
    }

}
