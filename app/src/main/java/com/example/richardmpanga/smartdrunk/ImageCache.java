package com.example.richardmpanga.smartdrunk;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by richardmpanga on 3/20/16.
 *
 * TODO
 * This class is responsible for cache images that is it
 * Remove DrinkInfo references [DONE]
 *
 *
 */
public class ImageCache {

    private LruCache<String, Bitmap> cache;

    private static ImageCache lruCacheInstance = new ImageCache();

    private ImageCache(){
        init();


    }


    private void init(){
        int cacheSize = 1024 *1024 * 8;
        cache = new LruCache<String, Bitmap>(cacheSize);
    }
    public static ImageCache getInstance()
    {
        return lruCacheInstance;
    }


    public void add(String drinkName ,Bitmap bitmap){

        cache.put(drinkName, bitmap);

    }

    public void delete(String  drinkName){

         cache.remove(drinkName);
    }


    public void clearCache (){
     cache.evictAll();
    }

    public LruCache<String, Bitmap> getCache(){
        return cache;
    }

    public boolean cacheEmpty(){

        return cache.size() == 0;
    }
}
