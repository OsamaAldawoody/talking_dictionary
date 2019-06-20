package com.example.android.miwok;


public class Word  {
    private String Arabic;
    private String English;
    private int imageId = No_image;
    private static final int No_image = -1;
    private int audioId;


    public Word(String Arabic,String English,int audioId){
        this.Arabic = Arabic;
        this.English = English;
        this.audioId = audioId;
    }
    public Word(String Arabic,String English,int imageId,int audioId){
        this.Arabic = Arabic;
        this.English = English;
        this.imageId = imageId;
        this.audioId = audioId;
    }



    public String getArabic(){
        return Arabic;
    }
    public String getEnglish(){
        return English;
    }
    public int getImageId(){
        return imageId;
    }
    public boolean hasImage(){
        return imageId != No_image;
    }
    public int getAudioId(){
        return audioId;
    }
}
