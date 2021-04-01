package com.example.newmiwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceid = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;
    public  Word( String defaultTranslation,String miwokTranslation){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }
    public  Word( String defaultTranslation,String miwokTranslation,int imageId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceid=imageId;


    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceid;
    }


       public boolean hasImage(){
         return  mImageResourceid != NO_IMAGE_PROVIDED;
       }

}


