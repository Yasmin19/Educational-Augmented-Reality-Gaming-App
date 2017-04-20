package com.example.yasmin.educationalaugmentedreality;

import android.util.Log;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

/**
 * Created by Yasmin on 16/04/2017.
 */
public class Items {

    String word;
    String desc;
    int image;
    LatLng location;
    static ArrayList<Items> itemsList = new ArrayList<Items>();
    static ArrayList<String> words = new ArrayList<String>();

    public Items(String w, String d, LatLng loc){
        word = w;
        desc = d;
        //image = i;
        location = loc;
    }

    public String getWord(){
        return word;
    }

    public String getDesc(){
        return desc;
    }
    public LatLng getLocation(){
        return location;
    }

    public int imagePath(){
        return image;
    }

    public static ArrayList<Items> getItemList(){
        return itemsList;
    }

    public static ArrayList<String> getWordList(){

        for (int i=0; i<itemsList.size(); i++){
            words.add(itemsList.get(i).getWord());
            Log.d("CROSS", ""+itemsList.get(i).getWord());
        }
        return words;
    }

    public static int getItemsNumber(){
        return itemsList.size();
    }
}
